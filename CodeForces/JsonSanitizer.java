package CodeForces;

import java.util.*;

public class JSONCleaner {
    public static String cleanJSON(Map value2) {
        // Parse the JSON string into a Map
        Map<String, Object> jsonObject = new HashMap<>();
        try {
            JSONObject jsonObject1 = new JSONObject(value2);
            Iterator<String> keys = jsonObject1.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Object value = jsonObject1.get(key);
                jsonObject.put(key, value);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Remove properties with null or empty string values
        jsonObject.entrySet().removeIf(entry -> entry.getValue() == null || entry.getValue().toString().isEmpty());

        // Sort the remaining properties by key
        Map<String, Object> sortedMap = new TreeMap<>(jsonObject);

        // Convert the sorted map back to a JSON string
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : sortedMap.entrySet()) {
            result.append("\"").append(entry.getKey()).append("\": ").append(valueToString(entry.getValue())).append(",");
        }
        if (!sortedMap.isEmpty()) {
            result.deleteCharAt(result.length() - 1); // Remove the trailing comma
        }
        result.append("}");
        return result.toString();
    }

    private static String valueToString(Object value) {
        if (value instanceof Map) {
            return cleanJSON((Map) value);
        } else {
            return "\"" + value.toString() + "\"";
        }
    }

    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": null, \"address\": {\"city\": \"\", \"zipcode\": \"12345\"}, \"email\": \"john@example.com\"}";
        String cleanedJSON = cleanJSON(jsonString);
        System.out.println(cleanedJSON);
    }
}