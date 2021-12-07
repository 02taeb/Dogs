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

    public Owner(String ownerName) {
        name = ownerName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
