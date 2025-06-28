package Day_5;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Arun", 90);
        marks.put("Divya", 85);
        marks.put("Karthik", 78);

        int total = 0;
        for (int m : marks.values()) total += m;
        double avg = (double) total / marks.size();

        System.out.println("Average Marks: " + avg);
    }
}

