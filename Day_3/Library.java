package Day_3;

import java.util.*;

class Library {
    ArrayList<String> books = new ArrayList<>();

    void addBook(String book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println("Removed: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }

    void displayBooks() {
        System.out.println("Books in Library:");
        for (String b : books)
            System.out.println(b);
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Basics");
        lib.addBook("OOP in Java");
        lib.displayBooks();
        lib.removeBook("Java Basics");
        lib.displayBooks();
    }
}

