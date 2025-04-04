import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Aditya");
        students.put(102, "Vasvi");
        students.put(103, "Ajeet");
        students.put(104, "Yatri");
        students.put(105, "Priya");

        System.out.println("Students' names based on enrollment numbers:");

        for (int enrollmentNo : students.keySet()) {
            String studentName = students.get(enrollmentNo);
            System.out.println("Enrollment No: " + enrollmentNo + " -> Name: " + studentName);
        }
    }
}