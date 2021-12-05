// JUnit-testfallen i denna fil testar metoden för att öka en hunds ålder U7.4 
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;


public class AssignmentSevenPointFourTest extends IOBaseTest {

// 	private final Dog BELLA = new Dog("Bella", "Labrador", 3, 12);
// 	private final Dog RATATA = new Dog("Ratata", "Tax", 15, 7);
// 	private final Dog DORIS = new Dog("Doris", "Cocker spaniel", 7, 7);
// 	private final Dog LASSIE = new Dog("Lassie", "Mops", 11, 11);
// 	private final Dog CHARLIE = new Dog("Charlie", "Puli", 9, 12);
// 
// 	private final Dog[] PREPARED_DOGS = { BELLA, RATATA, DORIS, LASSIE, CHARLIE };
// 
// 	public AssignmentSevenPointFourTest() {
// 		super(AssignmentSevenPointFour.class, "U7.4");
// 	}
// 
// 	@Test
// 	public void increaseAgeOfOnlyDog() {
// 		setIn("Ratata\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.add(RATATA);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(16, RATATA.getAge());
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 	@Test
// 	public void increaseAgeOfFirstDog() {
// 		setIn("Bella\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(4, BELLA.getAge());
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void increaseAgeOfMiddleDog() {
// 		setIn("Doris\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(8, DORIS.getAge());
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void increaseAgeOfLastDog() {
// 		setIn("Charlie\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(10, CHARLIE.getAge());
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void increaseAgeOfDogWithNameInDifferentCase() {
// 		setIn("RAtaTa\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(16, RATATA.getAge());
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void increaseAgeOfDogNonexistingDogGivesErrorMessage() {
// 		setIn("Ingen hund\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void increaseAgeOfDogWithNoDogsInListGivesErrorMessage() {
// 		setIn("Ingen hund\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void increaseAgeOfDogDoesNotAffectOtherDogs() {
// 		setIn("Doris\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(3, BELLA.getAge());
// 		assertEquals(15, RATATA.getAge());
// 		assertEquals(11, LASSIE.getAge());
// 		assertEquals(9, CHARLIE.getAge());
// 	}
// 
// 	@Test
// 	public void increaseAgeOfDogUpdatesTailLength() {
// 		setIn("Charlie\n");
// 
// 		AssignmentSevenPointFour sut = new AssignmentSevenPointFour();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(12.0, CHARLIE.getTailLength(), 0.01);
// 	}

}
