// JUnit-testfallen i denna fil testar Denna klass behövs för vissa test för föreläsning 8. Kommentarerna för hela klassen kan tas bort så fort ägarklassen är påbörjad, de ska INTE tas bort steg för steg  
// För mer information se README.txt-filen

import java.util.Arrays;


public abstract class AssignmentEightFunctionBaseTest extends FunctionBaseTest {

// 	public AssignmentEightFunctionBaseTest() {
// 		super();
// 	}
// 
// 	public AssignmentEightFunctionBaseTest(Class<?> cut) {
// 		super(cut);
// 	}
// 
// 	public AssignmentEightFunctionBaseTest(Class<?> cut, String mutId) {
// 		super(cut, mutId);
// 	}
// 
// 	protected void addDogToOwner(Owner owner, Dog dog) {
// 		callMethodById(owner, "U8.3", dog);
// 	}
// 
// 	protected Dog[] accessOwnDogs(Owner owner) {
// 		return (Dog[]) accessOnlyFieldOfType(owner, Dog[].class);
// 	}
// 
// 	protected void assertIsOwnedBy(Dog dog, Owner expectedOwner) {
// 		assertHasFieldSetTo(dog, Owner.class, expectedOwner);
// 	}
// 
// 	protected void assertOwnDog(Owner owner, Dog expectedDog) {
// 		Dog[] dogs = accessOwnDogs(owner);
// 		assertContains(Arrays.asList(dogs), expectedDog, owner+" äger inte den förväntade hunden");
// 	}
// 
// 	protected void assertDoesNotOwnDog(Owner owner, Dog unexpectedDog) {
// 		Dog[] dogs = accessOwnDogs(owner);
// 		assertDoesNotContains(Arrays.asList(dogs), unexpectedDog, owner+" äger en hund som hen inte borde");
// 	}
}
