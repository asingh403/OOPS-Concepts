import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileRenamer {

    /**
     * Renames a file to the new filename while keeping it in the same directory.
     *
     * @param originalFilePath The original file path.
     * @param newFileName The new file name (not the full path, just the name).
     * @throws IOException If an I/O error occurs.
     */
    public static void renameFile(String originalFilePath, String newFileName) throws IOException {
        Path originalPath = Paths.get(originalFilePath);
        
        // Extract the parent directory path
        Path directoryPath = originalPath.getParent();
        
        // Combine the directory path with the new file name to create the new file path
        Path newPath = directoryPath.resolve(newFileName);
        
        // Use Files.move to rename (move) the file
        Files.move(originalPath, newPath);
        
        System.out.println("File has been renamed to: " + newPath);
    }

    public static void main(String[] args) {
        String originalFilePath = "c:/documents/test/BDD.BACS18.BBB12345.PM";
        String newFileName = "BDD.BACS18.BBB12345.AB";
        
        try {
            renameFile(originalFilePath, newFileName);
        } catch (IOException e) {
            System.err.println("An error occurred while renaming the file: " + e.getMessage());
        }
    }
}
