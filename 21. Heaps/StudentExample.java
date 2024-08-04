
import java.util.PriorityQueue;

public class StudentExample {
    static class Student implements Comparable<Student>{
        int rollno;
        String name;

        public Student(int rollno, String name){
            this.rollno = rollno;
            this.name = name;
        }

        @Override
        public int compareTo(Student s1){
            return this.rollno-s1.rollno;
        }
    }

    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(17, "Man"));
        pq.add(new Student(5, "zoor"));
        pq.add(new Student(55, "mohd"));
        pq.add(new Student(10, "null"));

        while(!pq.isEmpty()){
            Student s = pq.remove();
            System.out.println("Roll No: " + s.rollno + ", Name: " + s.name);
        }
    }
}
