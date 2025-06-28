package Day_2;

import java.util.Scanner;

public class WordOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("Character count: " + word.length());
        System.out.println("Reversed: " + new StringBuilder(word).reverse());
        String[] words = word.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest word: " + longest);
    }
}

