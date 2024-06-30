package DAY2.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);

        // Create a file and write to it
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from the file
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete the file
        // if (file.delete()) {
        //     System.out.println("File deleted successfully: " + file.getName());
        // } else {
        //     System.out.println("Failed to delete the file.");
        // }
    }
}
