import java.io.File;

public class FileNameModifier {

    public static String removeSubstringAndRename(File file) {
        String originalName = file.getName();

        // Find the index of "23123" (ensuring it exists)
        int index = originalName.indexOf("23123");
        if (index == -1) {
            System.err.println("Substring '23123' not found in file name. No changes made.");
            return originalName;  // Return original name if the substring doesn't exist
        }

        // Build the new file name
        String newName = originalName.substring(0, index) + originalName.substring(index + 5); 

        // Rename the file
        File newFile = new File(file.getParentFile(), newName);
        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newName);
            return newName;
        } else {
            System.err.println("Error renaming the file.");
            return originalName;
        }
    }

    public static void main(String[] args) {
        File file = new File("path/to/your/BDD.BACS18.ABC12345.123123.PM.pgp");
        removeSubstringAndRename(file);
    }
}
