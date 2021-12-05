// JUnit-testfallen i denna fil testar metoden för att hitta en hund given namnet U7.3
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.jupiter.api.*;


public class AssignmentSevenPointThreeTest extends FunctionBaseTest {

// 	private AssignmentSevenPointThree sut = new AssignmentSevenPointThree();
// 
// 	public AssignmentSevenPointThreeTest() {
// 		super(AssignmentSevenPointThree.class, "U7.3");
// 	}
// 
// 	private Dog callMethodUnderTest(String name) {
// 		if (mut.getReturnType() == Dog.class) {
// 			return (Dog) callMethodUnderTest(sut, name);
// 		}
// 		if (mut.getReturnType() == Optional.class) {
// 			@SuppressWarnings("unchecked")
// 			Optional<Dog> od = (Optional<Dog>) callMethodUnderTest(sut, name);
// 			return od.orElse(null);
// 		}
// 		fail("Returtypen på metoden är inte någon av de förväntade (Dog eller Optional<Dog>)");
// 		// Kan inte hända på grund av fail ovan, men krävs av kompilatorn
// 		return null;
// 	}
// 
// 	@Test
// 	void searchingForDogThatExistsGivesDog() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
// 		final Dog KARO = new Dog("Karo", "Rottweiler", 3, 9);
// 		final Dog LASSIE = new Dog("Lassie", "Dachshund", 4, 16);
// 		final Dog FIDO = new Dog("Fido", "Golden retriever", 5, 13);
// 		final Dog RATATA = new Dog("Ratata", "Labrador", 12, 18);
// 		final Dog DORIS = new Dog("Doris", "Dachshund", 7, 1);
// 
// 		Collection<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(new Dog[] { KARO, LASSIE, FIDO, RATATA, DORIS }));
// 
// 		assertEquals(KARO, callMethodUnderTest("Karo"));
// 		assertEquals(FIDO, callMethodUnderTest("FIDO"));
// 		assertEquals(DORIS, callMethodUnderTest("doris"));
// 	}
// 
// 	@Test
// 	void searchingForDogThatDoesNotExistsYealdsNothing() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
// 		final Dog KARO = new Dog("Karo", "Rottweiler", 3, 9);
// 		final Dog LASSIE = new Dog("Lassie", "Dachshund", 4, 16);
// 		final Dog FIDO = new Dog("Fido", "Golden retriever", 5, 13);
// 		final Dog RATATA = new Dog("Ratata", "Labrador", 12, 18);
// 		final Dog DORIS = new Dog("Doris", "Dachshund", 7, 1);
// 
// 		Collection<Dog> dogs = accessDogList(sut);
// 		dogs.addAll(Arrays.asList(new Dog[] { KARO, LASSIE, FIDO, RATATA, DORIS }));
// 
// 		assertNull(callMethodUnderTest("Karolina"));
// 		assertNull(callMethodUnderTest("Devil"));
// 		assertNull(callMethodUnderTest("Rat"));
// 	}
// 
// 	@Test
// 	void searchingInEmptyListYealdsNothing() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
// 		assertNull(callMethodUnderTest("Anyone"));
// 	}

	// TODO: fler test

}
