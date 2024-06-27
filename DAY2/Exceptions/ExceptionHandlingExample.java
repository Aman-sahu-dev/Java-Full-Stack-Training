package DAY2.Exceptions;

import java.io.*;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Trying to open a file that does not exist
            FileReader file = new FileReader("non_existent_file.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Reading the first line of the file
            System.out.println(fileInput.readLine());
        } catch (FileNotFoundException e) {
            // This block handles the FileNotFoundException
            System.out.println("File not found. Please check the file path.");
        } catch (IOException e) {
            // This block handles the IOException
            System.out.println("An error occurred while reading the file.");
        } finally {
            // This block executes regardless of an exception occurring or not
            System.out.println("Finished executing the try-catch block.");
        }
    }
}
