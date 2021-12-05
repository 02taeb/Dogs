// JUnit-testfallen i denna fil testar metoden för att ta bort en given hund U7.5 
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;


public class AssignmentSevenPointFiveTest extends IOBaseTest {

// 	private final Dog BELLA = new Dog("Bella", "Labrador", 3, 12);
// 	private final Dog RATATA = new Dog("Ratata", "Tax", 15, 7);
// 	private final Dog DORIS = new Dog("Doris", "Cocker spaniel", 7, 7);
// 	private final Dog LASSIE = new Dog("Lassie", "Mops", 11, 11);
// 	private final Dog CHARLIE = new Dog("Charlie", "Puli", 9, 12);
// 
// 	private final Dog[] PREPARED_DOGS = { BELLA, RATATA, DORIS, LASSIE, CHARLIE };
// 
// 	public AssignmentSevenPointFiveTest() {
// 		super(AssignmentSevenPointFive.class, "U7.5");
// 	}
// 
// 	@Test
// 	public void removingOnlyDog() {
// 		setIn("Lassie\n");
// 
// 		AssignmentSevenPointFive sut = new AssignmentSevenPointFive();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.add(LASSIE);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertTrue(dogs.isEmpty(), String.format("Listan av hundar borde vara tom: %s", dogs));
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removingFirstDog() {
// 		setIn("Bella\n");
// 
// 		AssignmentSevenPointFive sut = new AssignmentSevenPointFive();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(4, dogs.size(), "Storleken på hundlistan är fel");
// 		assertEquals(Arrays.asList(RATATA, DORIS, LASSIE, CHARLIE), dogs, "Hundlistan innehåller fel hundar");
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removingMiddleDog() {
// 		setIn("Doris\n");
// 
// 		AssignmentSevenPointFive sut = new AssignmentSevenPointFive();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(4, dogs.size(), "Storleken på hundlistan är fel");
// 		assertEquals(Arrays.asList(BELLA, RATATA, LASSIE, CHARLIE), dogs, "Hundlistan innehåller fel hundar");
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removingLastDog() {
// 		setIn("Charlie\n");
// 
// 		AssignmentSevenPointFive sut = new AssignmentSevenPointFive();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(4, dogs.size(), "Storleken på hundlistan är fel");
// 		assertEquals(Arrays.asList(BELLA, RATATA, DORIS, LASSIE), dogs, "Hundlistan innehåller fel hundar");
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removingDogWithNameInDifferentCase() {
// 		setIn("RAtaTa\n");
// 
// 		AssignmentSevenPointFive sut = new AssignmentSevenPointFive();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(4, dogs.size(), "Storleken på hundlistan är fel");
// 		assertEquals(Arrays.asList(BELLA, DORIS, LASSIE, CHARLIE), dogs, "Hundlistan innehåller fel hundar");
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removingNonexistingDogGivesErrorMessage() {
// 		setIn("Ingen hund\n");
// 
// 		AssignmentSevenPointFive sut = new AssignmentSevenPointFive();
// 		List<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(PREPARED_DOGS));
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(5, dogs.size(), "Storleken på hundlistan är fel");
// 		assertEquals(Arrays.asList(BELLA, RATATA, DORIS, LASSIE, CHARLIE), dogs, "Hundlistan innehåller fel hundar");
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void removingDogWithNoDogsInListGivesErrorMessage() {
// 		setIn("Ingen hund\n");
// 
// 		AssignmentSevenPointFive sut = new AssignmentSevenPointFive();
// 		List<Dog> dogs = accessDogList(sut);
// 
// 		callMethodUnderTest(sut);
// 
// 		assertEquals(0, dogs.size(), "Storleken på hundlistan är fel");
// 		assertOutContainErrorMessage();
// 	}

}
