package Day_1;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double interest = 0;
        if (principal > 0 && rate > 0 && time > 0) {
            interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + interest);
        } else {
            System.out.println("Invalid input!");
        }
    }
}

