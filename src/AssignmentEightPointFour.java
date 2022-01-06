import java.util.ArrayList;

/**
 * AssignmentEightPointFour on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentEightPointFour {
    //#region Instance Variables U8.4
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    @UnderTest(id = "owners")
    private ArrayList<Owner> owners = new ArrayList<>();
    private Reader reader = new Reader();
    //#endregion
    //#region Instance Variables U8.3
    private String nameOfDog;
    private String nameOfOwner;
    private Owner owner;
    private Dog dog;
    private boolean runDog = true;
    private boolean runOwner = true;
    //#endregion
    //#region Instance Variables U7.2
    private double tailLengthMin;
    //#endregion

    /**
     * Returns all owners and the name of their dogs.
     */
    @UnderTest(id = "U8.4")
    public void listOwnersAndDogs() {
        if (owners.size() == 0) {
            System.out.println("Error: No owners registered.");
        }
        for (Owner owner : owners) {
            System.out.println(owner.toString());
            owner.listOwnedDogs();
        }
    }

    //#region LOC from U7.2
    /**
     * Asks for a tail length and outputs dogs with given tail length in local
     * ArrayList<Dog>.
     */
    @UnderTest(id = "U7.2")
    private void handleInput() {
        if (!dogs.isEmpty()) {
            tailLengthMin = reader.readDouble("Kortast svanslängd att visa");
            ArrayList<Dog> dogsWithTailLength = searchForDogsByTailSize(tailLengthMin);

            if (dogsWithTailLength.isEmpty()) {
                System.out.println("Error: No dogs with given tail length in register");
            }

            for (Dog dog : dogsWithTailLength) {
                System.out.println(dog.toString());
            }
        } else {
            System.out.println("Error: No dogs in register");
        }
    }

    /**
     * Gets all the dogs with given tail length in local ArrayList<Dog> and returns
     * them in new ArrayList<Dog>.
     * 
     * @param tailLengthCheck double, Tail length to check.
     * @return ArrayList<Dog> of Dogs with tail length.
     */
    @UnderTest(id = "U7.2-extra")
    private ArrayList<Dog> searchForDogsByTailSize(double tailLengthCheck) {
        ArrayList<Dog> dogsWithTailLength = new ArrayList<>();

        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getTailLength() >= tailLengthCheck) {
                dogsWithTailLength.add(dogs.get(i));
            }
        }

        return new ArrayList<Dog>(dogsWithTailLength);
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

        if (!runDog || !runOwner) {
            System.out.println("Error: Operation Failed. Please see earlier error messages.");
        } else if (!owner.hasDog(dog) && !dog.isOwned()) {
            owner.addDogToOwner(dog);
        } else {
            System.out.println("Error: This dog is already owned by this owner.");
        }
    }

    /**
     * Sets nameOfDog.
     * Will also set runDog = false if no name is entered.
     */
    private void setDogName() {
        nameOfDog = reader.readString("Namn på hunden", false);
        if (nameOfDog == null || nameOfDog.equalsIgnoreCase("")) {
            runDog = false;
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

    /**
     * Sets nameOfOwner.
     * Will also set runOwner = false if no name is entered.
     */
    private void setOwnerName() {
        nameOfOwner = reader.readString("Namn på ägaren", false);
        if (nameOfOwner == null || nameOfDog.equalsIgnoreCase("")) {
            runOwner = false;
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
    //#endregion
}
