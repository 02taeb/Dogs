import java.util.ArrayList;

/**
 * AssignmentSevenPointTwo on iLearn PROG1.
 * 
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointTwo {
    // #region Instance Variables
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Reader reader = new Reader();
    private double tailLengthMin;
    // #endregion

    /**
     * Asks for a tail length and outputs dogs with given tail length in local
     * ArrayList<Dog>.
     */
    @UnderTest(id = "U7.2")
    public void handleInput() {
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
}
