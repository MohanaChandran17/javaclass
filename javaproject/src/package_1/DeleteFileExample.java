package package_1;

import java.io.File;

public class DeleteFileExample
{
    public static void main(String[] args) 
    {

        File file = new File("example.txt");
        
        Runnable deleteFile = () ->
        {
            if (file.exists()) 
            {
                if (file.delete()) 
                {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Unable to delete the file.");
                }
            } else {
                System.out.println("File does not exist.");
            }
        };

        // Execute lambda
        deleteFile.run();
    }
}

