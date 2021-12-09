import java.util.ArrayList;

/**
 * AssignmentSevenPointFour on iLearn PROG1.
 * 
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointFour {
    // #region Instance variables U7.4
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Reader reader = new Reader();
    // #endregion
    // #region Instance variables U7.3
    private Dog nullDog;
    // #endregion

    /**
     * Increases the age of Dog with name asked for.
     * Prints error if no Dog with name is found.
     * Uses findDog(dogName) from AssignmentSevenPointThree.
     */
    @UnderTest(id = "U7.4")
    public void increaseAge() {
        String dogName = reader.readString("Vad heter hunden", false);
        Dog dog = findDog(dogName);

        if (dog == null) {
            System.out.println("Error: No such dog in register");
        } else {
            dog.increaseAge(1);
            System.out.println(dog.getName() + " är nu ett år äldre.");
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
