import java.util.ArrayList;

/**
 * AssignmentEightPointThree on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentEightPointThree {
    //#region Instance Variables
    @UnderTest(id="owners")
    private ArrayList<Owner> owners = new ArrayList<>();
    @UnderTest(id="dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Reader reader = new Reader();
    private String nameOfDog;
    private String nameOfOwner;
    private Owner owner;
    private Dog dog;
    private boolean runDog = true;
    private boolean runOwner = true;
    //#endregion

    @UnderTest(id="U8.3")
    public void addDogToOwner() {
        setDogName();
        initialiseDog();
        if (runDog) {
            setOwnerName();
            initialiseOwner();
        }
        
        if (!runDog || !runOwner) {
            System.out.println("Error: Operation Failed. Please see earlier error messages.");
        } else if (!owner.hasDog(dog) && !dog.isOwned()) {
            owner.addDogToOwner(dog);
        } else {
            System.out.println("Error: This dog is already owned by this owner.");
        }
    }

    private void initialiseOwner() {
        if (runOwner) {
            runOwner = findOwner();
        } else {
            System.out.println("Error: No owner entered.");
        }
    }

    private void initialiseDog() {
        if (runDog) {
            runDog = findDog();
        } else {
            System.out.println("Error: No dog entered.");
        }
    }

    private void setDogName() {
        nameOfDog = reader.readString("Namn på hunden");
        if (nameOfDog == null || nameOfDog.equals("")) {
            runDog = false;
        }
        // nameOfDog = emptyStringCheck(nameOfDog, "Namn på hunden");
    }

    /**
     * Sets the name of owner.
     */
    private void setOwnerName() {
        nameOfOwner = reader.readString("Namn på ägaren");
        if (nameOfOwner == null || nameOfDog.equals("")) {
            runOwner = false;
        }
        // nameOfOwner = emptyStringCheck(nameOfOwner, "Namn på ägare");
    }

    /**
     * Finds an owner in local ArrayList<Owner>. 
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

    /**
     * Checks whether given string is empty.
     * @param s String to check.
     * @param prompt Prompt to ask again if string is empty.
     * @return Non-null and Non-whitespace string.
     */
    private String emptyStringCheck(String s, String prompt) {
        while (s == null || s.equals("")) {
            System.out.println("Error: This string cannot be empty");
            s = reader.readString(prompt);
        }

        return s;
    }
}
