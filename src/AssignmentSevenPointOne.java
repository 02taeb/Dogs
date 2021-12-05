import java.util.ArrayList;

/**
 * AssignmentSevenPointOne on iLearn PROG1. 
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointOne {
    //#region U7.1 Class variables
    //@UnderTest(id="dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Dog dogToAdd;
    //#endregion
    //#region U6.4 Class variables
    private Reader reader = new Reader();
    private String name;
    private String breed;
    private int age;
    private int weight;
    private Dog dog;
    //#endregion

    /**
     * Adds dog to local ArrayList. Utilizes createdog() from U6.4
     */
    //@UnderTest(id="U7.1")
    public void saveDogToArrayList() {
        dogToAdd = createDog();
        dogs.add(dogToAdd);
        System.out.println(dogToAdd.getName() + " tillagd i registret.");
    }

    //#region AssignmentSixPointFour
    // All LOC below are copied from AssignmentSixPointFour and should not be changed.    
    
    /**
     * Creates a dog.
     * @return instance of class Dog.
     */
    @UnderTest(id="U6.4")
    public Dog createDog() {
        enterName();
        enterBreed();
        enterAge();
        enterWeight();
        dog = new Dog(name, breed, age, weight);
        return dog;
    }

    /**
     * Checks whether given String is empty or null.
     * @param s String to check.
     * @return boolean.
     */
    private boolean isStringEmpty(String s) {
        if (s.equals("") || s.equals(null)) {
            return true;
        }

        return false;
    }

    /**
     * Checks whether given Integer is negative.
     * @param i Integer to check.
     * @return boolean.
     */
    private boolean isIntegerPositive(int i) {
        if (i >= 0) {
            return true;
        }

        return false;
    }

    /**
     * Prints an error message saying that given String cannot be empty.
     */
    private void printErrorEmptyString() {
        System.out.println("Error: This String cannot be empty");
    }

    /**
     * Prints an error message saying that given Integer cannot be negative.
     */
    private void printErrorNegativeInt() {
        System.out.println("Error: This Integer cannot be negative");
    }

    /**
     * Reads the name for the dog.
     */
    private void enterName() {
        do {
            name = reader.readString("Vad heter hunden");
            if (isStringEmpty(name)) {
                printErrorEmptyString();
            }
        } while (isStringEmpty(name));
    }

    /**
     * Reads the breed for the dog.
     */
    private void enterBreed() {
        do {
            breed = reader.readString("Vilken ras är hunden");
            if (isStringEmpty(breed)) {
                printErrorEmptyString();
            }
        } while (isStringEmpty(breed));
    }

    /**
     * Reads the age for the dog.
     */
    private void enterAge() {
        do {
            age = reader.readInt("Hur gammal är hunden");
            if (!isIntegerPositive(age)) {
                printErrorNegativeInt();
            }
        } while (!isIntegerPositive(age));
    }

    /**
     * Reads the weight for the dog.
     */
    private void enterWeight() {
        do {
            weight = reader.readInt("Hur mycket väger hunden");
            if (!isIntegerPositive(weight)) {
                printErrorNegativeInt();
            }
        } while (!isIntegerPositive(weight));
    }

    //#endregion
}