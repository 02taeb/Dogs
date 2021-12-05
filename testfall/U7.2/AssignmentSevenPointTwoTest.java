// JUnit-testfallen i denna fil testar metoden för att lista alla hundar med en given svanslängd U7.2
// För mer information se README.txt-filen

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;


public class AssignmentSevenPointTwoTest extends IOBaseTest {

// 	private static final Dog SMALL = new Dog("SmallDog", "Terrier", 3, 7);
// 	private static final Dog MEDIUM = new Dog("MediumDog", "Cross-breed", 5, 11);
// 	private static final Dog BIG = new Dog("BigDog", "Great dane", 10, 12);
// 
// 	public AssignmentSevenPointTwoTest() {
// 		super(AssignmentSevenPointTwo.class, "U7.2");
// 	}
// 
// 	private void testSearchMethod(Dog[] dogsInList, double minTailLength, Dog... expected) {
// 		setIn("%f%n", minTailLength);
// 
// 		AssignmentSevenPointTwo sut = new AssignmentSevenPointTwo();
// 
// 		List<Dog> dogs = accessDogList(sut); 
// 		dogs.addAll(Arrays.asList(dogsInList));
// 
// 		callMethodUnderTest(sut);
// 
// 		for (Dog dog : expected) {
// 			assertOutContainIgnoreCase(dog.getName());
// 		}
// 
// 		dogs.removeAll(Arrays.asList(expected));
// 
// 		for (Dog dog : dogs) {
// 			assertOutDoesNotContainIgnoreCase(dog.getName());
// 		}
// 	}
// 
// 	@Test
// 	void noDogs() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
// 		testSearchMethod(new Dog[] {}, 0.0);
// 	}
// 
// 	@Test
// 	void noDogsMatches() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
// 		testSearchMethod(new Dog[] { SMALL, MEDIUM, BIG }, 100.0);
// 	}
// 
// 	@Test
// 	void someDogsMatch() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
// 		testSearchMethod(new Dog[] { MEDIUM, SMALL, BIG }, 5.0, MEDIUM, BIG);
// 	}
// 
// 	@Test
// 	void allDogsMatch() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
// 		testSearchMethod(new Dog[] { BIG, MEDIUM, SMALL }, 0.0, SMALL, MEDIUM, BIG);
// 	}

	// TODO: fler test ska läggas till
	// TODO: kontrollera att felmeddelanden kommer

}
