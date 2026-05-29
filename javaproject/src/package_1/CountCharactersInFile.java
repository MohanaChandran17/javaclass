package package_1;
import java.io.FileReader;
import java.io.IOException;

public class CountCharactersInFile {
    public static void main(String[] args) {

        int count = 0;

        try {
            FileReader reader = new FileReader("example.txt");
            int ch;

            while ((ch = reader.read()) != -1) {
                count++;
            }

            reader.close();
            System.out.println("Number of characters in the file: " + count);

        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }
}

