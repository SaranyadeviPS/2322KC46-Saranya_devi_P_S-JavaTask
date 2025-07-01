package Day_7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudents {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " Name: " + rs.getString("name") + " Age: " + rs.getInt("age"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

