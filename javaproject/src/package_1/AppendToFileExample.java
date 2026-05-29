package package_1;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {

        try
        {
           
            FileWriter writer = new FileWriter("example.txt", true);

            writer.write("\nThis data is appended to the file.");
            writer.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending data.");
        }
    }
}

