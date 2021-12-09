import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Reader class according to assignment U6.3 on iLearn PROG1.
 * Adapter for java.util.Scanner.
 * 
 * @author Lucas Ilstedt, luil7872
 */
@UnderTest(id = "U6.3")
public class Reader {
    // #region Class Variables
    private static ArrayList<InputStream> inputStreams = new ArrayList<>();
    // #endregion
    // #region Instance Variables
    private Scanner scanner;
    // #endregion

    /**
     * Constructor taking an InputStream and creating a new Reader if one with given
     * InputStream does not already exist.
     * 
     * @param input InputStream to create reader for.
     */
    public Reader(InputStream input) {
        if (!checkForExistingStream(input)) {
            scanner = new Scanner(input);
            inputStreams.add(input);
        } else {
            throw new IllegalStateException("Error: Instance of Obj Reader with given InputStream already exists.");
        }
    }

    /**
     * Constructor for InputStream System.in.
     */
    public Reader() {
        this(System.in);
    }

    /**
     * Checks whether given inputstream is already open.
     * 
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
     * 
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
     * 
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
     * 
     * @param prompt Prompt before line to read.
     * @return Read String.
     */
    private String readString(String prompt) {
        String text;

        System.out.print(prompt + "?>");
        text = nameCheck(scanner.nextLine());
        // text = emptyStringCheck(text, prompt);

        return text;
    }

    /**
     * Takes a prompt and reads a given String after.
     * 
     * @param prompt     Prompt before line to read.
     * @param keepAsking if true will keep asking until non-empty String is entered.
     * @return Read String.
     */
    public String readString(String prompt, boolean keepAsking) {
        String text = readString(prompt);
        if (keepAsking) {
            text = emptyStringCheck(text, prompt);
        }
        return text;
    }

    /**
     * Formats a string, making all characters except the first one lower case and
     * removing spaces at beginning and end.
     * 
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

    /**
     * Checks whether a given string is empty or only consists of whitespace.
     * If this is the case, will keep asking until non-empty string is entered.
     * 
     * @param s      String to check.
     * @param prompt Prompt to ask if string is empty (Error message printed from
     *               method).
     * @return Non-empty String.
     */
    private String emptyStringCheck(String s, String prompt) {
        while (s == null || s.equals("")) {
            System.out.println("Error: This string cannot be empty");
            s = readString(prompt);
        }

        return s;
    }
}
