package Day_2;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] book = new String[3][2]; 
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            book[i][0] = sc.nextLine();
            System.out.print("Enter phone: ");
            book[i][1] = sc.nextLine();
        }

        System.out.println("\nAddress Book:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + book[i][0] + ", Phone: " + book[i][1]);
        }
    }
}

