package Day_1;

import java.util.Scanner;

public class Calculator {
    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static double divide(int a, int b) {
        if (b != 0) return (double) a / b;
        else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + add(a, b)); break;
            case 2: System.out.println("Result: " + subtract(a, b)); break;
            case 3: System.out.println("Result: " + multiply(a, b)); break;
            case 4: System.out.println("Result: " + divide(a, b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}

