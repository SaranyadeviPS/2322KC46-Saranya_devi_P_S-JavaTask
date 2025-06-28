package Day_4;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("Hello Java\n");
        bw.write("File Writing Example");
        bw.close();
    }
}

