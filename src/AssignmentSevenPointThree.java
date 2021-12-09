import java.util.ArrayList;

/**
 * AssignmentSevenPointThree on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointThree {
    @UnderTest(id="dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private Dog nullDog;
    
    /**
     * Tries to find a dog with given name in local ArrayList.
     * @param dogName String with dogs name.
     * @return Dog with given name or if none exists Dog with value null.
     */
    @UnderTest(id="U7.3")
    public Dog findDog(String dogName) {
        nullDog = null;
        
        for (Dog dog : dogs) {
            if (dog.getName().equalsIgnoreCase(dogName.trim())) {
                return dog;
            }
        }
        
        return nullDog;
    }
}
