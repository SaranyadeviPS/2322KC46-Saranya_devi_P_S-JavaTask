package Day_4;

import java.io.*;
import java.util.*;

public class EmployeeFileCRUD {
    static String file = "employee.txt";

    public static void add(String emp) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.write(emp + "\n");
        bw.close();
    }

    public static void display() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }

    public static void main(String[] args) throws IOException {
        add("101,Raj,50000");
        add("102,Meena,55000");
        display();
    }
}
