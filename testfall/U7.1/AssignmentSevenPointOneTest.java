// JUnit-testfallen i denna fil testar metoden för att lägga till en hund i listan U7.1
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.List;

import org.junit.jupiter.api.Test;


public class AssignmentSevenPointOneTest extends IOBaseTest {

// 	public AssignmentSevenPointOneTest() {
// 		super(AssignmentSevenPointOne.class, "U7.1");
// 	}
// 
// 	@Test
// 	public void hasListOfDogs() {
// 		// Ingen assert nödvändig, sökmetoden misslyckas om fältet inte finns
// 		Field f = locateFieldUnderTest(DOGS_FIELD_ID);
// 
// 		// Går tyvärr inte att kontrollera att listan faktiskt innehåller hundar,
// 		// så vi nöjer oss med att kontrollera att det är en lista
// 		assertTrue(List.class.isAssignableFrom(f.getType()));
// 	}
// 
// 	@Test
// 	public void hasInputMethodFromU6Point4() {
// 		// Ingen assert nödvändig, sökmetoden misslyckas om metoden inte finns
// 		locateMethodUnderTest("U6.4");
// 	}
// 
// 	@Test
// 	public void hasAddMethod() {
// 		// Ingen sökning nödvänding, har skett i superklassens konstruktor
// 		assertEquals(0, mut.getParameterCount(), "Fel antal parametrar till metoden för att lägga till en hund");
// 	}
// 
// 	private void assertDogIs(String expectedName, String expectedBreed, int expectedAge, int expectedWeight, Dog dog) {
// 		assertEquals(expectedName, dog.getName(), "Namnet är fel på hunden");
// 		assertEquals(expectedBreed, dog.getBreed(), "Rasen är fel på hunden");
// 		assertEquals(expectedAge, dog.getAge(), "Åldern är fel på hunden");
// 		assertEquals(expectedWeight, dog.getWeight(), "Vikten är fel på hunden");
// 	}
// 
// 	@Test
// 	public void addingOneDog() {
// 		setIn("A\nB\n1\n2\n");
// 
// 		AssignmentSevenPointOne sut = new AssignmentSevenPointOne();
// 		callMethodUnderTest(sut);
// 
// 		List<Dog> dogs = accessDogList(sut);
// 
// 		assertEquals(1, dogs.size(), "Fel antal hundar i listan");
// 		assertDogIs("A", "B", 1, 2, dogs.get(0));
// 	}
// 
// 	@Test
// 	public void addingTwoDogs() {
// 		setIn("A\nB\n1\n2\nC\nD\n3\n4\n");
// 
// 		AssignmentSevenPointOne sut = new AssignmentSevenPointOne();
// 
// 		callMethodUnderTest(sut);
// 		callMethodUnderTest(sut);
// 
// 		List<Dog> dogs = accessDogList(sut);
// 
// 		assertEquals(2, dogs.size(), "Fel antal hundar i listan");
// 
// 		// Det finns inget som kräver att hundarna ligger i någon speciell
// 		// ordning, så vi får mickla lite för att kolla var de finns
// 		final int[] aFirst = { 0, 1 };
// 		final int[] bFirst = { 1, 0 };
// 
// 		int[] index = dogs.get(0).getName().equalsIgnoreCase("A") ? aFirst : bFirst;
// 
// 		assertDogIs("A", "B", 1, 2, dogs.get(index[0]));
// 		assertDogIs("C", "D", 3, 4, dogs.get(index[1]));
// 	}

}
