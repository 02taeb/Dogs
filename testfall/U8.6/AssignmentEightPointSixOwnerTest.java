// JUnit-testfallen i denna fil testar ägarklassens array av hundar
// För mer information se README.txt-filen
// 
// import static org.junit.jupiter.api.Assertions.*;
// 
// import org.junit.jupiter.api.Test;
// 
// 
// public class AssignmentEightPointSixOwnerTest extends AssignmentEightFunctionBaseTest {
// 
// 	// Ej static för att testerna inte ska störa varandra
// 	private final Dog BELLA = new Dog("Bella", "Yorkshireterrier", 20, 3);
// 	private final Dog SIGGE = new Dog("Sigge", "Dachshund", 20, 18);
// 	private final Dog MOLLY = new Dog("Molly", "Bulldogg", 6, 10);
// 
// 	private final Owner NIKE = new Owner("Nike");
// 	private final Owner JOZEF = new Owner("Jozef");
// 
// 	public AssignmentEightPointSixOwnerTest() {
// 		super(Owner.class, "U8.6");
// 	}
// 
// 	@Test
// 	public void removingFirstDogRemovesItFromArray() {
// 		addDogToOwner(NIKE, BELLA);
// 		addDogToOwner(NIKE, SIGGE);
// 		addDogToOwner(NIKE, MOLLY);
// 		callMethodUnderTest(NIKE, BELLA);
// 		assertDoesNotOwnDog(NIKE, BELLA);
// 	}
// 
// 	@Test
// 	public void removingMiddleDogRemovesItFromArray() {
// 		addDogToOwner(NIKE, BELLA);
// 		addDogToOwner(NIKE, SIGGE);
// 		addDogToOwner(NIKE, MOLLY);
// 		callMethodUnderTest(NIKE, SIGGE);
// 		assertDoesNotOwnDog(NIKE, SIGGE);
// 	}
// 
// 	@Test
// 	public void removingLastDogRemovesItFromArray() {
// 		addDogToOwner(NIKE, BELLA);
// 		addDogToOwner(NIKE, SIGGE);
// 		addDogToOwner(NIKE, MOLLY);
// 		callMethodUnderTest(NIKE, MOLLY);
// 		assertDoesNotOwnDog(NIKE, MOLLY);
// 	}
// 
// 	@Test
// 	public void removingOneDogDoesNotRemovaAnyOther() {
// 		addDogToOwner(NIKE, BELLA);
// 		addDogToOwner(NIKE, SIGGE);
// 		addDogToOwner(NIKE, MOLLY);
// 		callMethodUnderTest(NIKE, SIGGE);
// 		assertOwnDog(NIKE, BELLA);
// 		assertOwnDog(NIKE, MOLLY);
// 	}
// 
// 	@Test
// 	public void removingDogFromOwnerAlsoRemovesItsOwner() {
// 		addDogToOwner(NIKE, BELLA);
// 		addDogToOwner(NIKE, SIGGE);
// 		addDogToOwner(NIKE, MOLLY);
// 		assertIsOwnedBy(BELLA, NIKE);
// 		callMethodUnderTest(NIKE, BELLA);
// 		assertIsOwnedBy(BELLA, null);
// 	}
// 
// 	@Test
// 	public void removingADogWithoutOwnerDoesNothing() {
// 		addDogToOwner(NIKE, BELLA);
// 		addDogToOwner(NIKE, SIGGE);
// 		Dog[] expected = accessOwnDogs(NIKE);
// 		callMethodUnderTest(NIKE, MOLLY);
// 		Dog[] actual = accessOwnDogs(NIKE);
// 		assertArrayEquals(expected, actual,
// 				"Nikes array av hundar har uppdaterats trots att ingen hund borde tagits bort");
// 	}
// 
// 	@Test
// 	public void removingAnotherOwnersDogDoesNothing() {
// 		addDogToOwner(NIKE, BELLA);
// 		addDogToOwner(JOZEF, SIGGE);
// 		addDogToOwner(NIKE, MOLLY);
// 		Dog[] expected = accessOwnDogs(NIKE);
// 		callMethodUnderTest(NIKE, SIGGE);
// 		Dog[] actual = accessOwnDogs(NIKE);
// 		assertArrayEquals(expected, actual,
// 				"Nikes array av hundar har uppdaterats trots att ingen hund borde tagits bort");
// 	}
// 
// 	private void addEnoughDogsToFillArray(Owner owner) {
// 		int count = 0;
// 		for (Dog dog : accessOwnDogs(owner)) {
// 			if (dog == null)
// 				count++;
// 		}
// 
// 		for (int i = 0; i < count; i++) {
// 			Dog dog = new Dog("Dog #" + i, "Breed", 1, 2);
// 			addDogToOwner(owner, dog);
// 		}
// 	}
// 
// 	private boolean arrayIsExactSize(Owner owner) {
// 		for (Dog dog : accessOwnDogs(owner)) {
// 			if (dog == null)
// 				return false;
// 		}
// 		return true;
// 	}
// 
// 	// Används inte än
// 	//	private boolean arrayIsNotExactSize(Owner owner) {
// 	//		return !arrayIsExactSize(owner);
// 	//	}
// 
// 	@Test
// 	public void spaceInArrayReused() {
// 		addDogToOwner(JOZEF, MOLLY);
// 		addDogToOwner(JOZEF, BELLA);
// 		addEnoughDogsToFillArray(JOZEF);
// 		assertTrue(arrayIsExactSize(JOZEF), "Jozefs array av hundar är inte helt full vilket den borde vara");
// 
// 		callMethodUnderTest(JOZEF, MOLLY);
// 
// 		addDogToOwner(JOZEF, SIGGE);
// 		assertTrue(arrayIsExactSize(JOZEF), "Jozefs array av hundar är inte helt full vilket den borde vara");
// 	}
// 
// 	// TODO: ta bort sista hunden och börja om igen
// 	// TODO: och att inget annat än arrayer används för att hantera hundarna
// }
// //COMMENT
