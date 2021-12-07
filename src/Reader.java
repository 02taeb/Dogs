import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Reader class according to assignment U6.3 on iLearn PROG1.
 * Adapter for java.util.Scanner.
 * @author Lucas Ilstedt, luil7872
 */
@UnderTest(id = "U6.3")
public class Reader {
    // List containing existing InputStreams. Static since List contents should not differ between different instances of object.
    private static ArrayList<InputStream> inputStreams = new ArrayList<>();
    private Scanner scanner;
    
    /**
     * Constructor taking an InputStream and creating a new Reader if one with given InputStream does not already exist.
     * @param input InputStream to create reader for.
     */
    public Reader(InputStream input) {
        if (!checkForExistingStream(input)) {
            scanner = new Scanner(input);
            // Adds inputstream to ArrayList containing open inputstreams.
            inputStreams.add(input); 
        } else {
            // Throws error when trying to open an inputstream which has already been previously opened.
            throw new IllegalStateException("Error: Instance of Obj Reader with given InputStream already exists.");
        }
    }

    /**
     * Constructor for InputStream System.in. Utilizes Constructor Reader(Inpustream input)
     */
    public Reader() {
        this(System.in);
    }

    /**
     * Checks whether given inputstream is already open.
     * @param is InputStream to check.
     * @return Boolean, true if open, false if not open.
     */
    private boolean checkForExistingStream(InputStream is) {
        if (inputStreams.contains(is)) {
            return true;
        }

        return false;
    }

    /**
     * Takes a prompt and reads a given integer after. Also clears Scanner buffer.
     * @param prompt Prompt before location to read.
     * @return Read integer.
     */
    public int readInt(String prompt) {
        int number;

        System.out.print(prompt + "?>");
        number = scanner.nextInt();
        scanner.nextLine();
        
        return number;
    }

    /**
     * Takes a prompt and reads a given double after. Also clears Scanner buffer.
     * @param prompt Prompt before location to read.
     * @return Read double.
     */
    public double readDouble(String prompt) {
        double number;

        System.out.print(prompt + "?>");
        number = scanner.nextDouble();
        scanner.nextLine();
        
        return number;
    }

    /**
     * Takes a prompt and reads a given String after.
     * @param prompt Prompt before location to read.
     * @return Read String.
     */
    public String readString(String prompt) {
        String text;

        System.out.print(prompt + "?>");
        text = nameCheck(scanner.nextLine());
        // text = emptyStringCheck(text, prompt);
        
        return text;
    }

    /**
     * Formats a string, making all characters except the first one lower case and removing spaces at beginning and end.
     * @param uneditedString String to format.
     * @return Formatted String.
     */
    private String nameCheck(String uneditedString) { 
        String editedString = uneditedString.toLowerCase();
        editedString = editedString.trim();

        if (editedString.equals("") || editedString.equals(null)) {
            return "";
        }

        editedString = String.valueOf(editedString.charAt(0)).toUpperCase() + editedString.substring(1);
        return editedString;
    }

    // TODO: Check during U9.1 and U9.2 for any place where this method should not be used.
    // If no such places exists, go back in code and check for loops this method makes unnecessary. 
    // Add if all empty strings should be printed to System. 
    /*
    private String emptyStringCheck(String s, String prompt) {
        while (s == null || s.equals("")) {
            System.out.println("Error: This string cannot be empty");
            s = readString(prompt);
        }

        return s;
    }
    */
}
