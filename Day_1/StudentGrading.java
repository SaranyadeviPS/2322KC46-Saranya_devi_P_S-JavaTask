package Day_1;

import java.util.Scanner;

public class StudentGrading {
    static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();
            String grade = calculateGrade(marks);
            System.out.println("Grade: " + grade);
        }
    }
}

