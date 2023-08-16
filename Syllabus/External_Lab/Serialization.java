package Syllabus.External_Lab;
import java.io.*;

class Student implements Serializable{
    String name;
    int rollno;
}

public class Serialization {
    public static void main(String args[]){
        String filename = "output.txt";

        Student s = new Student();
        s.name = "A";
        s.rollno = 45;

        try{
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            System.out.println("Object saved!");
            oos.close();
            fos.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
