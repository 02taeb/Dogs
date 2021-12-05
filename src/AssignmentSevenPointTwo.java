import java.util.ArrayList;

/**
 * AssignmentSevenPointTwo on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
 public class AssignmentSevenPointTwo {
    @UnderTest(id="dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Reader reader = new Reader();
    private double tailLengthMin;

    @UnderTest(id="U7.2")
    public void handleInput() {
        if (!dogs.isEmpty()) {
            tailLengthMin = reader.readDouble("Kortast svanslängd att visa");
            ArrayList<Dog> dogsWithTailLength = searchForDogsByTailSize(tailLengthMin);
            if (dogsWithTailLength.isEmpty()) {
                System.out.println("Error: No dogs with given tail length in register");
            }
            for (Dog dog : dogsWithTailLength) {
                // System.out.println("* " + dog.getName() + "(" + dog.getBreed() + ", " + dog.getAge() + " år, " + dog.getWeight() + " kilo, " + dog.getTailLength() + " cm svans)");
                System.out.printf("* %s (%s, %s år, %s kilo, %s cm svans.)%n", dog.getName(), dog.getBreed(), dog.getAge(), dog.getWeight(), dog.getTailLength());
            }
        } else {
            System.out.println("Error: No dogs in register");
        }
    }

    @UnderTest(id="U7.2-extra")
    private ArrayList<Dog> searchForDogsByTailSize(double tailLengthCheck) {
        ArrayList<Dog> dogsWithTailLength = new ArrayList<>();

        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getTailLength() >= tailLengthCheck) {
                dogsWithTailLength.add(dogs.get(i));
            }
        }

        return dogsWithTailLength;
    }
}
