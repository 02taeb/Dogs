import java.util.ArrayList;

/**
 * AssignmentSevenPointOne on iLearn PROG1.
 * 
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointOne {
    // #region Instance Variables U7.1
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Reader reader = new Reader();
    // #endregion

    /**
     * Adds dog to local ArrayList. Utilizes createdog() from U6.4
     */
    @UnderTest(id = "U7.1")
    public void saveDogToArrayList() {
        Dog dogToAdd = createDog();
        dogs.add(dogToAdd);
        System.out.println(dogToAdd.getName() + " tillagd i registret.");
    }

    // #region LOC from U6.4
    /**
     * Creates a dog.
     * 
     * @return instance of class Dog.
     */
    @UnderTest(id = "U6.4")
    public Dog createDog() {
        String name = reader.readString("Vad heter hunden", true);
        String breed = reader.readString("Vilken ras är hunden", true);
        int age = enterAge();
        int weight = enterWeight();
        Dog dog = new Dog(name, breed, age, weight);
        return dog;
    }

    /**
     * Reads the age for the dog.
     */
    private int enterAge() {
        int age;

        do {
            age = reader.readInt("Hur gammal är hunden");
            if (!isIntegerPositive(age)) {
                printErrorNegativeInt();
            }
        } while (!isIntegerPositive(age));

        return age;
    }

    /**
     * Reads the weight for the dog.
     */
    private int enterWeight() {
        int weight;
        
        do {
            weight = reader.readInt("Hur mycket väger hunden");
            if (!isIntegerPositive(weight)) {
                printErrorNegativeInt();
            }
        } while (!isIntegerPositive(weight));

        return weight;
    }

    /**
     * Checks whether given Integer is negative.
     * 
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
     * Prints an error message saying that given Integer cannot be negative.
     */
    private void printErrorNegativeInt() {
        System.out.println("Error: This Integer cannot be negative");
    }
    // #endregion
}