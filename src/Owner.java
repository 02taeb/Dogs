import java.util.ArrayList;

/**
 * Owner class according to AssignmentEightPointOne on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class Owner {
    //#region Instance Variables
    private ArrayList<Dog> ownedDogs = new ArrayList<>();
    private String name;
    //#endregion

    /**
     * Constructor. Takes String ownerName and sets this.name = ownerName.
     * @param ownerName
     */
    public Owner(String ownerName) {
        name = ownerName;
    }

    /**
     * Getter for this.name
     * @return String name.
     */
    public String getName() {
        return name;
    }

    /**
     * &#064;Override toString.
     * @return String name.
     */
    @Override
    public String toString() {
        return name;
    }
}
