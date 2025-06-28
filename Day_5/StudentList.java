package Day_5;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Divya");
        students.add("Karthik");

        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println("Student: " + it.next());
        }
    }
}
