import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("sample.txt");
        writer.write("Oracle Internship Java Program");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        System.out.println(reader.readLine());
        reader.close();
    }
}
