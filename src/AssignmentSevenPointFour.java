import java.util.ArrayList;

/**
 * AssignmentSevenPointFour on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointFour {
    //#region Instance variables from AssignmentSevenPointFour
    @UnderTest(id="dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Reader reader = new Reader();
    //#endregion
    //#region Instance variables from AssignmentSevenPointThree
    private Dog nullDog;
    //#endregion

    @UnderTest(id="U7.4")
    public void increaseAge() {
        String dogName = reader.readString("Vad heter hunden");
        Dog dog = findDog(dogName);

        if (dog == null) {
            System.out.println("Error: No such dog in register");
        } else {
            dog.increaseAge(1);
            System.out.println(dog.getName() + " är nu ett år äldre.");
        }
    }
    
    // #region LOC from AssignmentSevenPointThree
    // findDog(dogName) changed from public to private in this Assignment.

    /**
     * Tries to find a dog with given name in local ArrayList.
     * @param dogName String with dogs name.
     * @return Dog with given name or if none exists Dog with value null.
     */
    @UnderTest(id="U7.3")
    private Dog findDog(String dogName) {
        nullDog = null;
        
        for (Dog dog : dogs) {
            if (dog.getName().equals(nameCheck(dogName))) {
                return dog;
            }
        }
        
        return nullDog;
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
    //#endregion
}
