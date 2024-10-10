import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "example.txt";
        String contentToWrite = "Computer Science and Engineering";

        // Writing to the file using FileWriter
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(contentToWrite);
            System.out.println("Successfully wrote to the file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading from the file using FileReader
        try (FileReader fileReader = new FileReader(fileName)) {
            int character;
            System.out.println("Reading from the file: " + fileName);
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); // Print each character
            }
            System.out.println(); // New line for better output formatting
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
