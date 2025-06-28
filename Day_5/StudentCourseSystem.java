package Day_5;

import java.util.*;

public class StudentCourseSystem {
    public static void main(String[] args) {
        HashMap<String, List<String>> studentCourses = new HashMap<>();

        studentCourses.put("Arun", Arrays.asList("Java", "Python"));
        studentCourses.put("Divya", Arrays.asList("C++", "Data Structures"));

        for (String student : studentCourses.keySet()) {
            System.out.println("Student: " + student);
            System.out.println("Courses: " + studentCourses.get(student));
        }
    }
}

