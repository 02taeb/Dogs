import java.util.ArrayList;

/**
 * AssignmentEightPointOne on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentEightPointOne {
    //#region Instance variables
    @UnderTest(id="owners")
    private ArrayList<Owner> owners = new ArrayList<>();
    private Reader reader = new Reader();
    //#endregion

    /**
     * Creates and adds instance of Class Owner to local ArrayList<Owner>.
     */
    @UnderTest(id="U8.1")
    public void addOwner() {
        String name = reader.readString("Name");
        
        while (name == null || name.equals("")) {
            System.out.println("Error: Name cannot be empty");
            name = reader.readString("Name");
        }

        owners.add(new Owner(name));
    }
}
