/*
 * Test för en hjälpmetod som hittar alla 
 * hundar med en viss svanslängd eller längre.
 * 
 * Denna metod är inget krav, men gör det enklare
 * att implementera U7.2, och är en bra övning
 * på parametrar och returvärden.
 * 
 * Testen kräver att metoden är markerad med 
 * @UnderTest(id="U7.2-extra") och listan med 
 * @UnderTest(id="dogs")
 */

// JUnit-testfallen i denna fil testar U7.2-extra
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.jupiter.api.*;


public class AssignmentSevenPointTwoExtraTest extends FunctionBaseTest {

// 	private static final Dog SMALL = new Dog("Small", "Terrier", 3, 7);
// 	private static final Dog MEDIUM = new Dog("Medium", "Cross-breed", 5, 10);
// 	private static final Dog BIG = new Dog("Big", "Great dane", 10, 12);
// 
// 	public AssignmentSevenPointTwoExtraTest() {
// 		super(AssignmentSevenPointTwo.class, "U7.2-extra");
// 	}
// 
// 	private void testSearchMethod(Dog[] dogsInList, double minTailLength, Dog... expected) {
// 		// Metoden ska inte läsa från System. in, men vi måste 
// 		// ändå skapa en ny inputström för att inte få problem 
// 		// med inläsningsklassen
// 		setIn("");
// 
// 		AssignmentSevenPointTwo sut = new AssignmentSevenPointTwo();
// 
// 		List<Dog> dogs = accessDogList(sut); 
// 		dogs.addAll(Arrays.asList(dogsInList));
// 
// 		@SuppressWarnings("unchecked")
// 		Collection<Dog> actual = (Collection<Dog>) callMethodUnderTest(sut, minTailLength);
// 
// 		assertEquals(expected.length, actual.size(), "Fel antal hundar returnerades av sökmetoden");
// 		assertTrue(actual.containsAll(Arrays.asList(expected)),
// 				"Listan av hundar som returneras innehåller inte alla förväntade hundar");
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

}
