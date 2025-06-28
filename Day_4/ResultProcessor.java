package Day_4;

import java.io.*;

public class ResultProcessor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            int total = 0;
            for (int i = 1; i < parts.length; i++)
                total += Integer.parseInt(parts[i]);
            bw.write(parts[0] + " Total: " + total + "\n");
        }
        br.close();
        bw.close();
    }
}
