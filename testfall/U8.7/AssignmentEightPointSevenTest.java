// JUnit-testfallen i denna fil testar funktionen för att ta bort en ägare U8.7
// För mer information se README.txt-filen
// 
// import static org.junit.jupiter.api.Assertions.*;
// 
// import java.util.ArrayList;
// import java.util.List;
// 
// import org.junit.jupiter.api.Test;
// 
// 
// public class AssignmentEightPointSevenTest extends AssignmentEightIOBaseTest<AssignmentEightPointSeven> {
// 
// 	// Ej static för att testerna inte ska störa varandra
// 	private final Dog SIGGE = new Dog("Sigge", "Pudel", 4, 6);
// 	private final Dog LASSIE = new Dog("Lassie", "Dachshund", 8, 6);
// 	private final Dog CHARLIE = new Dog("Charlie", "Golden retriever", 2, 12);
// 	private final Dog LUDDE = new Dog("Ludde", "Vinthund", 11, 6);
// 	private final Dog DORIS = new Dog("Doris", "Tax", 16, 9);
// 
// 	private final Dog[] PREPARED_DOGS = { SIGGE, LASSIE, CHARLIE, LUDDE, DORIS };
// 
// 	private final Owner NIKE = new Owner("Nike");
// 	private final Owner BERTIL = new Owner("Bertil");
// 	private final Owner JOZEF = new Owner("Jozef");
// 	private final Owner PATRICK = new Owner("Patrick");
// 	private final Owner ERIK = new Owner("Erik");
// 
// 	private final Owner[] PREPARED_OWNERS = { NIKE, BERTIL, JOZEF, PATRICK, ERIK };
// 
// 	public AssignmentEightPointSevenTest() {
// 		super(AssignmentEightPointSeven.class, "U8.7");
// 	}
// 
// 	// TODO: fler test med olika mängd ägare och hundar
// 	// TODO: namn skrivna i olika format
// 
// 	@Test
// 	public void removeOwnerDoesNotGiveError() {
// 		setIn("Patrick\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removeOwnerDoesRemovesOwner() {
// 		setIn("Bertil\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		callMethodUnderTest(sut);
// 
// 		var owners = accessOwnerList();
// 		assertEquals(PREPARED_OWNERS.length - 1, owners.size());
// 		assertDoesNotContains(owners, BERTIL, "Ägare som inte borde finnas hittad");
// 	}
// 
// 	@Test
// 	public void removeOwnerDoesRetainsOthers() {
// 		setIn("Erik\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		callMethodUnderTest(sut);
// 
// 		var owners = accessOwnerList();
// 		assertEquals(PREPARED_OWNERS.length - 1, owners.size());
// 		assertContains(owners, NIKE, "Ägare saknas");
// 		assertContains(owners, BERTIL, "Ägare saknas");
// 		assertContains(owners, JOZEF, "Ägare saknas");
// 		assertContains(owners, PATRICK, "Ägare saknas");
// 	}
// 
// 	@Test
// 	public void removeNonexistingOwnerGivesError() {
// 		setIn("Nobody\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		callMethodUnderTest(sut);
// 		
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removeNonexistingOwnerDoesNotChangeList() {
// 		setIn("Nobody\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		List<Owner> expected = new ArrayList<>(accessOwnerList());
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(expected, accessOwnerList(), "Listan av ägare har ändrats när den inte borde ha gjort det");
// 	}
// 
// 	@Test
// 	public void removeOwnerAlsoRemovesOwnedDogs() {
// 		setIn("Jozef\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 		addDogToOwner(JOZEF, LUDDE);
// 		addDogToOwner(JOZEF, DORIS);
// 		addDogToOwner(NIKE, SIGGE);
// 
// 		callMethodUnderTest(sut);
// 
// 		var dogs = accessDogList();
// 		assertEquals(PREPARED_DOGS.length - 2, dogs.size());
// 		assertDoesNotContains(dogs, LUDDE, "Hund som inte borde finnas hittad");
// 		assertDoesNotContains(dogs, DORIS, "Hund som inte borde finnas hittad");
// 	}
// 
// }
// //COMMENT
