// JUnit-testfallen i denna fil testar att ta bort en hund från en ägare U8.6
// För mer information se README.txt-filen
// 
// import org.junit.jupiter.api.Test;
// 
// 
// public class AssignmentEightPointSixTest extends AssignmentEightIOBaseTest<AssignmentEightPointSix> {
// 
// 	// Ej static för att testerna inte ska störa varandra
// 	private final Dog BAMSE = new Dog("Bamse", "Dobermann", 13, 17);
// 	private final Dog CHARLIE = new Dog("Charlie", "Tax", 20, 3);
// 	private final Dog LUDDE = new Dog("Ludde", "Grand danois", 14, 15);
// 	private final Dog BELLA = new Dog("Bella", "Yorkshireterrier", 2, 13);
// 	private final Dog SIGGE = new Dog("Sigge", "Tax", 11, 12);
// 
// 	private final Dog[] PREPARED_DOGS = { BAMSE, CHARLIE, LUDDE, BELLA, SIGGE };
// 
// 	private final Owner OLLE = new Owner("Olle");
// 	private final Owner SVEA = new Owner("Svea");
// 	private final Owner STEFAN = new Owner("Stefan");
// 	private final Owner GUSTAV = new Owner("Gustav");
// 	private final Owner HENRIK = new Owner("Henrik");
// 
// 	private final Owner[] PREPARED_OWNERS = { OLLE, SVEA, STEFAN, GUSTAV, HENRIK };
// 
// 	public AssignmentEightPointSixTest() {
// 		super(AssignmentEightPointSix.class, "U8.6");
// 	}
// 
// 	// TODO: Fler test med olika mängd ägda hundar och ägare
// 	// TODO: Namnen skrivna på olika sätt
// 
// 	@Test
// 	public void removingOwnedDogGivesNoError() {
// 		setIn("Bella\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 		addDogToOwner(GUSTAV, BELLA);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removingOwnedDogRemovesItFromTheOwner() {
// 		setIn("SIGGE\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 		addDogToOwner(GUSTAV, SIGGE);
// 		assertOwnDog(GUSTAV, SIGGE);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertDoesNotOwnDog(GUSTAV, SIGGE);
// 	}
// 
// 	@Test
// 	public void removingOwnedDogRemovesTheOwnerFromTheDog() {
// 		setIn("Ludde\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 		addDogToOwner(SVEA, LUDDE);
// 		assertIsOwnedBy(LUDDE, SVEA);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertIsOwnedBy(LUDDE, null);
// 	}
// 
// 	@Test
// 	public void removingDogWithNoOwnerGivesError() {
// 		setIn("Bamse\n");
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
// 	public void removingDogThatDoesNotExistsGivesError() {
// 		setIn("Nodog\n");
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
// }
// //COMMENT
