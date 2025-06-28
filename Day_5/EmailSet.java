package Day_5;

import java.util.*;

public class EmailSet {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("a@gmail.com"); // duplicate

        for (String email : emails) {
            System.out.println(email);
        }
    }
}
