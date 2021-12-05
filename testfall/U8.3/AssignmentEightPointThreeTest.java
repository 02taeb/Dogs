// JUnit-testfallen i denna fil testar att lägga till en hund till en ägare U8.3
// För mer information se README.txt-filen
// 
// import org.junit.jupiter.api.*;
// 
// 
// public class AssignmentEightPointThreeTest extends AssignmentEightIOBaseTest<AssignmentEightPointThree> {
// 
// 	// Inte statiska för att testen inte ska störa varandra
// 	private final Dog CHARLIE = new Dog("Charlie", "Mops", 12, 3);
// 	private final Dog FIDO = new Dog("Fido", "Dachshund", 14, 12);
// 	private final Dog LASSIE = new Dog("Lassie", "Golden retriever", 11, 19);
// 	private final Dog BAMSE = new Dog("Bamse", "Puli", 5, 5);
// 	private final Dog RONJA = new Dog("Ronja", "Tax", 19, 8);
// 
// 	private final Dog[] PREPARED_DOGS = { CHARLIE, FIDO, LASSIE, BAMSE, RONJA };
// 
// 	private final Owner STEFAN = new Owner("Stefan");
// 	private final Owner ULLA = new Owner("Ulla");
// 	private final Owner HELGA = new Owner("Helga");
// 	private final Owner KALLE = new Owner("Kalle");
// 	private final Owner PATRICK = new Owner("Patrick");
// 
// 	private final Owner[] PREPARED_OWNERS={ STEFAN, ULLA, HELGA, KALLE, PATRICK };
// 
// 	public AssignmentEightPointThreeTest() {
// 		super(AssignmentEightPointThree.class, "U8.3");
// 	}
// 
// 	@Test
// 	public void giveDogGivesNoError() {
// 		setIn("Charlie\nStefan\n");
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
// 	public void giveDogDoesAddDogAndSetOwner() {
// 		setIn("Bamse\nHelga\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertHasFieldSetTo(BAMSE, Owner.class, HELGA);
// 		assertOwnDog(HELGA, BAMSE);
// 	}
// 
// 	// TODO: fler test som lägger till på olika ägare
// 	// TODO: fler test som anropar metoden flera gånger
// 	// TODO: fler test som kontrollerar att whitespace och tomma namn hanteras
// 
// 	@Test
// 	public void giveNonexistingDogGivesError() {
// 		setIn("NotADog\n");
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
// 	public void giveDogWithNoDogsRegisteredGivesError() {
// 		setIn("Anyone\n");
// 		createSut();
// 
// 		addOwners(PREPARED_OWNERS);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void giveAlreadyOwnedDogGivesError() {
// 		setIn("Charlie\nPatrick\nCharlie\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		callMethodUnderTest(sut);
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void giveDogToNonexistingOwnerGivesError() {
// 		setIn("Charlie\nNoone\n");
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
// 	public void giveDogWithNoOwnersRegisteredGivesError() {
// 		setIn("Ronja\nUlla\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// }
// //COMMENT
