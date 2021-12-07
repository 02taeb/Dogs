import java.util.ArrayList;

/**
 * AssignmentEightPointTwo on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentEightPointTwo {
    //#region Instance Variables
    @UnderTest(id="owners")
    private ArrayList<Owner> owners = new ArrayList<>();
    //#endregion

    @UnderTest(id="U8.2")
    public Owner findOwner(String nameOfOwner) {
        Owner nullOwner = null;
        
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getName().equalsIgnoreCase(nameOfOwner)) {
                return owners.get(i);
            }
        }

        return nullOwner;
    }
}
