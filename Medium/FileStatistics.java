import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {

    public static void main(String[] args) {
        String filePath = "example.txt"; // Specify the path to your file

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length(); // Count characters in the line
                wordCount += line.split("\\s+").length; // Count words by splitting on whitespace
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Display the counts
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}
