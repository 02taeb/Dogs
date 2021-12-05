// JUnit-testfallen i denna fil testar funktionen för att avgöra om en ägare äger en hund
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class AssignmentEightPointFiveTest extends FunctionBaseTest {

// 	// Ej static för att testerna inte ska störa varandra
// 	private final Dog LUDDE = new Dog("Ludde", "Mops", 6, 15);
// 	private final Dog LASSIE = new Dog("Lassie", "Tax", 6, 6);
// 	private final Dog RATATA = new Dog("Ratata", "Grand danois", 17, 1);
// 	private final Dog KARO = new Dog("Karo", "Dobermann", 12, 9);
// 	private final Dog FIDO = new Dog("Fido", "Dachshund", 5, 14);
// 
// 	private final Owner PATRICK = new Owner("Patrick");
// 	private final Owner STEFAN = new Owner("Stefan");
// 	private final Owner JOZEF = new Owner("Jozef");
// 	private final Owner SVEA = new Owner("Svea");
// 	private final Owner CECILIA = new Owner("Cecilia");
// 
// 	public AssignmentEightPointFiveTest() {
// 		super(Owner.class, "U8.5");
// 	}
// 
// 	protected void addDogToOwner(Owner owner, Dog dog) {
// 		callMethodById(owner, "U8.3", dog);
// 	}
// 
// 	@Test
// 	public void singleDogOwnedMatches() {
// 		addDogToOwner(CECILIA, FIDO);
// 		boolean owns = (boolean) callMethodUnderTest(CECILIA, FIDO);
// 		assertTrue(owns, "Cecilia äger inte Fido som hon borde göra");
// 	}
// 
// 	@Test
// 	public void singleDogOwnedDoesNotMatch() {
// 		addDogToOwner(JOZEF, KARO);
// 		boolean owns = (boolean) callMethodUnderTest(JOZEF, RATATA);
// 		assertFalse(owns, "Jozef äger Ratata, vilket han inte borde göra");
// 	}
// 
// 	@Test
// 	public void firstDogOwnedMatches() {
// 		addDogToOwner(PATRICK, LUDDE);
// 		addDogToOwner(PATRICK, LASSIE);
// 		addDogToOwner(PATRICK, FIDO);
// 		boolean owns = (boolean) callMethodUnderTest(PATRICK, LUDDE);
// 		assertTrue(owns, "Patrick äger inte Ludde som han borde göra");
// 	}
// 
// 	@Test
// 	public void middleDogOwnedMatches() {
// 		addDogToOwner(SVEA, LUDDE);
// 		addDogToOwner(SVEA, LASSIE);
// 		addDogToOwner(SVEA, FIDO);
// 		boolean owns = (boolean) callMethodUnderTest(SVEA, LASSIE);
// 		assertTrue(owns, "Svea äger inte Lassie som hon borde göra");
// 	}
// 
// 	@Test
// 	public void lastDogOwnedMatches() {
// 		addDogToOwner(PATRICK, LUDDE);
// 		addDogToOwner(PATRICK, LASSIE);
// 		addDogToOwner(PATRICK, FIDO);
// 		boolean owns = (boolean) callMethodUnderTest(PATRICK, FIDO);
// 		assertTrue(owns, "Patrick äger inte Fido som han borde göra");
// 	}
// 
// 	@Test
// 	public void noDogOwedMatches() {
// 		addDogToOwner(PATRICK, LUDDE);
// 		addDogToOwner(PATRICK, LASSIE);
// 		addDogToOwner(PATRICK, FIDO);
// 		boolean owns = (boolean) callMethodUnderTest(PATRICK, KARO);
// 		assertFalse(owns, "Patrick äger Karo, vilket han inte borde göra");
// 	}
// 
// 	@Test
// 	public void noDogsOwed() {
// 		boolean owns = (boolean) callMethodUnderTest(STEFAN, RATATA);
// 		assertFalse(owns, "Stefan äger Ratata, vilket han inte borde göra");
// 	}
}
