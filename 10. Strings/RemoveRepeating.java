public class RemoveRepeating {
    public static void main(String[] args) {
        String str = "manzoor mohammed";
        StringBuilder ans = new StringBuilder();
        boolean[] track = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            if(track[str.charAt(i) - 'a'] == false)
                ans.append(str.charAt(i));
            track[str.charAt(i) - 'a'] = true;
        }
        System.out.println(ans);
    }
}
