// JUnit-testfallen i denna fil testar lista ägare och hundar 
// För mer information se README.txt-filen
// 
// import org.junit.jupiter.api.Test;
// 
// 
// public class AssignmentEightPointFourTest extends AssignmentEightIOBaseTest<AssignmentEightPointFour> {
// 
// 	// Ej static för att testerna inte ska störa varandra
// 	private final Dog DORIS = new Dog("Doris", "Yorkshireterrier", 1, 12);
// 	private final Dog RONJA = new Dog("Ronja", "Tax", 12, 18);
// 	private final Dog CHARLIE = new Dog("Charlie", "Golden retriever", 10, 19);
// 
// 	private final Dog[] PREPARED_DOGS = { DORIS, RONJA, CHARLIE };
// 
// 	private final Owner FILIPPA = new Owner("Filippa");
// 	private final Owner ERIK = new Owner("Erik");
// 	private final Owner MARTIN = new Owner("Martin");
// 
// 	private final Owner[] PREPARED_OWNERS = { FILIPPA, ERIK, MARTIN };
// 
// 	public AssignmentEightPointFourTest() {
// 		super(AssignmentEightPointFour.class, "U8.4");
// 	}
// 
// 	@Test
// 	public void listSingleOwnerWithNoDogs() {
// 		// Används inte, men nödvändig för att input-
// 		// klassen inte ska kasta ett undantag
// 		setIn("");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(FILIPPA);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainIgnoreCase("Filippa");
// 		assertOutDoesNotContainIgnoreCase("Doris");
// 		assertOutDoesNotContainIgnoreCase("Ronja");
// 		assertOutDoesNotContainIgnoreCase("Charlie");
// 	}
// 
// 	@Test
// 	public void listSingleOwnerWithSingleDog() {
// 		// Används inte, men nödvändig för att input-
// 		// klassen inte ska kasta ett undantag
// 		setIn("");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(ERIK);
// 		addDogToOwner(ERIK, RONJA);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainIgnoreCase("Erik");
// 		assertOutContainIgnoreCase("Ronja");
// 		assertOutDoesNotContainIgnoreCase("Doris");
// 		assertOutDoesNotContainIgnoreCase("Charlie");
// 	}
// 
// 	@Test
// 	public void listSingleOwnerWithMultipleDogs() {
// 		// Används inte, men nödvändig för att input-
// 		// klassen inte ska kasta ett undantag
// 		setIn("");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(MARTIN);
// 		addDogToOwner(MARTIN, DORIS);
// 		addDogToOwner(MARTIN, CHARLIE);
// 		addDogToOwner(MARTIN, RONJA);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainIgnoreCase("Martin");
// 		assertOutContainIgnoreCase("Ronja");
// 		assertOutContainIgnoreCase("Doris");
// 		assertOutContainIgnoreCase("Charlie");
// 	}
// 
// 	@Test
// 	public void listMultipleOwners() {
// 		// Används inte, men nödvändig för att input-
// 		// klassen inte ska kasta ett undantag
// 		setIn("");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 		addDogToOwner(ERIK, RONJA);
// 		addDogToOwner(FILIPPA, CHARLIE);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainIgnoreCase("Filippa");
// 		assertOutContainIgnoreCase("Charlie");
// 		assertOutContainIgnoreCase("Erik");
// 		assertOutContainIgnoreCase("Ronja");
// 		assertOutContainIgnoreCase("Martin");
// 		assertOutDoesNotContainIgnoreCase("Doris");
// 	}
// 
// 	@Test
// 	public void listDogWithNoOwner() {
// 		setIn("0\n");
// 		createSut();
// 
// 		addDogs(DORIS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		// List dogs
// 		callMethodById(sut, "U7.2");
// 
// 		assertOutContainIgnoreCase("Doris");
// 
// 		assertOutDoesNotContainIgnoreCase("Filippa");
// 		assertOutDoesNotContainIgnoreCase("Erik");
// 		assertOutDoesNotContainIgnoreCase("Martin");
// 	}
// 
// 	@Test
// 	public void listDogWithOwner() {
// 		setIn("0\n");
// 		createSut();
// 
// 		addDogs(RONJA);
// 		addOwners(PREPARED_OWNERS);
// 		addDogToOwner(ERIK, RONJA);
// 
// 		// List dogs
// 		callMethodById(sut, "U7.2");
// 
// 		assertOutContainIgnoreCase("Ronja");
// 		assertOutContainIgnoreCase("Erik");
// 
// 		assertOutDoesNotContainIgnoreCase("Filippa");
// 		assertOutDoesNotContainIgnoreCase("Martin");
// 	}
// 
// 	@Test
// 	public void listOnlyDogsWithLongEnoughTail() {
// 		setIn("2\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 
// 		// Ronja och Charlie
// 		// List dogs
// 		callMethodById(sut, "U7.2");
// 
// 		assertOutDoesNotContainIgnoreCase("Doris");
// 		assertOutContainIgnoreCase("Ronja");
// 		assertOutContainIgnoreCase("Charlie");
// 
// 		assertOutDoesNotContainIgnoreCase("Filippa");
// 		assertOutDoesNotContainIgnoreCase("Erik");
// 		assertOutDoesNotContainIgnoreCase("Martin");
// 	}
// 
// 	@Test
// 	public void listMultipelDogsSomeWithOwners() {
// 		setIn("0\n");
// 		createSut();
// 
// 		addDogs(PREPARED_DOGS);
// 		addOwners(PREPARED_OWNERS);
// 		addDogToOwner(FILIPPA, CHARLIE);
// 		addDogToOwner(ERIK, RONJA);
// 
// 		// List dogs
// 		callMethodById(sut, "U7.2");
// 
// 		assertOutContainIgnoreCase("Doris");
// 		assertOutContainIgnoreCase("Ronja");
// 		assertOutContainIgnoreCase("Doris");
// 
// 		assertOutContainIgnoreCase("Filippa");
// 		assertOutContainIgnoreCase("Erik");
// 		assertOutDoesNotContainIgnoreCase("Martin");
// 	}
// 
// }
