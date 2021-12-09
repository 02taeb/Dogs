import java.util.ArrayList;

/**
 * AssignmentSevenPointFive on iLearn PROG1.
 * 
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointFive {
    // #region Instance variables U7.5
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Reader reader = new Reader();
    // #endregion
    // #region Instance variables U7.3
    private Dog nullDog;
    // #endregion

    /**
     * Removes dog with name given when prompted.
     * Prints error if no dog with name is found.
     * Uses findDog(dogName) from AssignmentSevenPointThree.
     */
    @UnderTest(id = "U7.5")
    public void removeDog() {
        String dogName = reader.readString("Vad heter hunden", false);
        Dog dog = findDog(dogName);

        if (dog == null) {
            System.out.println("Error: No such dog in register");
        } else {
            dogs.remove(dog);
            System.out.println(dog.getName() + " är nu borttagen från registret.");
        }
    }

    // #region LOC from AssignmentSevenPointThree
    /**
     * Tries to find a dog with given name in local ArrayList.
     * 
     * @param dogName String with dogs name.
     * @return Dog with given name or if none exists Dog with value null.
     */
    @UnderTest(id = "U7.3")
    private Dog findDog(String dogName) {
        nullDog = null;

        for (Dog dog : dogs) {
            if (dog.getName().equalsIgnoreCase(dogName.trim())) {
                return dog;
            }
        }

        return nullDog;
    }
    // #endregion
}
