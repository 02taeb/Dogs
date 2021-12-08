import java.util.ArrayList;

/**
 * AssignmentEightPointEight on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentEightPointEight {
    //#region Instance Variables U8.8
    @UnderTest(id = "owners")
    private ArrayList<Owner> owners = new ArrayList<>();
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    //#endregion
    // #region Instance Variables U8.3
    private Reader reader = new Reader();
    private String nameOfDog;
    private String nameOfOwner;
    private Owner owner;
    private Dog dog;
    private boolean runDog = true;
    private boolean runOwner = true;
    // #endregion
    //#region Instance variables from U7.3
    private Dog nullDog;
    //#endregion

    // TODO: Group overloading methods findDog().

    /**
     * Removes dog with name given when prompted.
     * Prints error if no dog with name is found.
     * Uses findDog(dogName) from AssignmentSevenPointThree.
     * Updated version of U7.5
     * Also now uses owner.removeDogFromOwner(Dog) and
     * findOwner() from U8.3. 
     */
    @UnderTest(id = "U8.8")
    public void removeDog() {
        String dogName = reader.readString("Vad heter hunden");
        Dog dog = findDog(dogName);

        if (dog == null) {
            System.out.println("Error: No such dog in register");
        } else {
            if (dog.isOwned()) {
                nameOfOwner = dog.getOwner().getName();
                findOwner();
                owner.removeDogFromOwner(dog);
            }
            dogs.remove(dog);
            System.out.println(dog.getName() + " är nu borttagen från registret.");
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

    //#region LOC from U8.3
    /**
     * Adds a dog to an owner. Both should exist in local ArrayList<>'s.
     */
    @UnderTest(id = "U8.3")
    private void addDogToOwner() {
        setDogName();
        initialiseDog();
        // Should only ask for owner if dog is processed correctly.
        if (runDog) {
            setOwnerName();
            initialiseOwner();
        }

        // Check if both dog and owner have been processed correctly.
        if (!runDog || !runOwner) {
            System.out.println("Error: Operation Failed. Please see earlier error messages.");
        } else if (!owner.hasDog(dog) && !dog.isOwned()) {
            owner.addDogToOwner(dog);
        } else {
            System.out.println("Error: This dog is already owned by this owner.");
        }
    }

    /**
     * Will run findOwner() if runOwner is true.
     * Else will print error.
     */
    private void initialiseOwner() {
        if (runOwner) {
            runOwner = findOwner();
        } else {
            System.out.println("Error: No owner entered.");
        }
    }

    /**
     * Will run findDog() if runDog is true.
     * Else will print error.
     */
    private void initialiseDog() {
        if (runDog) {
            runDog = findDog();
        } else {
            System.out.println("Error: No dog entered.");
        }
    }

    /**
     * Sets nameOfDog.
     * Will also set runDog = false if no name is entered.
     */
    private void setDogName() {
        nameOfDog = reader.readString("Namn på hunden");
        if (nameOfDog == null || nameOfDog.equals("")) {
            runDog = false;
        }
    }

    /**
     * Sets nameOfOwner.
     * Will also set runOwner = false if no name is entered.
     */
    private void setOwnerName() {
        nameOfOwner = reader.readString("Namn på ägaren");
        if (nameOfOwner == null || nameOfDog.equals("")) {
            runOwner = false;
        }
    }

    /**
     * Finds an owner in local ArrayList<Owner>.
     * 
     * @return boolean true if owner found, false if no owner found.
     */
    private boolean findOwner() {
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getName().equalsIgnoreCase(nameOfOwner)) {
                owner = owners.get(i);
                return true;
            }
        }

        System.out.println("Error: No such owner in registry.");
        return false;
    }

    /**
     * Finds a dog in local ArrayList<Dog>.
     * 
     * @return boolean true if dog with no owner found, false if dog already has
     *         owner or no dog found.
     */
    private boolean findDog() {
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getName().equalsIgnoreCase(nameOfDog)) {
                dog = dogs.get(i);
                if (!dog.isOwned()) {
                    return true;
                } else {
                    System.out.println("Error: Dog already owned");
                    return false;
                }
            }
        }

        System.out.println("Error: No such dog in registry.");
        return false;
    }
    //#endregion
}
