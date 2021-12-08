import java.util.ArrayList;

/**
 * AssignmentEightPointSeven on iLearn PROG1.
 * 
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentEightPointSeven {
    // #region Instance Variables U8.7
    @UnderTest(id = "owners")
    private ArrayList<Owner> owners = new ArrayList<>();
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    // #endregion
    // #region Instance Variables U8.3
    private Reader reader = new Reader();
    private String nameOfDog;
    private String nameOfOwner;
    private Owner owner;
    private Dog dog;
    private boolean runDog = true;
    private boolean runOwner = true;
    // #endregion

    @UnderTest(id = "U8.7")
    public void removeOwner() {
        String ownerName = reader.readString("Namn på ägare att ta bort");
        if (ownerName == null || ownerName.equals("")) {
            System.out.println("Error: This String cannot be empty");
        } else {
            for (int i = 0; i < owners.size(); i++) {
                if (ownerName.equalsIgnoreCase(owners.get(i).getName())) {
                    removeOwnedDogs(i);
                    System.out.printf("%s är nu borttagen från systemet.", owners.get(i).getName());
                    owners.remove(i);
                    return;
                }
            }

            System.out.println("Error: No such owner registered.");
        }
    }

    private void removeOwnedDogs(int i) {
        ArrayList<Dog> dogsToRemove = new ArrayList<>();
        for (int j = 0; j < dogs.size(); j++) {
            if (dogs.get(j).getOwner() == owners.get(i)) {
                dogsToRemove.add(dogs.get(j));
            }
        }
        for (int j = 0; j < dogsToRemove.size(); j++) {
            for (int k = 0; k < dogs.size(); k++) {
                if (dogs.get(k) == dogsToRemove.get(j)) {
                    dogs.remove(k);
                }
            }
        }
    }

    // #region LOC from U8.3
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
    // #endregion
}
