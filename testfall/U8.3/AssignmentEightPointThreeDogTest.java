// JUnit-testfallen i denna fil testar hundarnas ägare U8.3
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class AssignmentEightPointThreeDogTest extends AssignmentEightFunctionBaseTest {

// 	private Dog dog = new Dog("Karo", "Basset", 1, 2);
// 	private Owner owner = new Owner("Columbine");
// 
// 	public AssignmentEightPointThreeDogTest() {
// 		super(Dog.class, "U8.3");
// 	}
// 
// 	@Test
// 	public void settingOwnerOfDogDoesSetOwner() {
// 		callMethodUnderTest(dog, owner);
// 		assertHasFieldSetTo(dog, Owner.class, owner);
// 	}
// 
// 	@Test
// 	public void settingOwnerOfDogAlsoAddsDogToOwner() {
// 		callMethodUnderTest(dog, owner);
// 		assertOwnDog(owner, dog);
// 	}
// 
// 	@Test
// 	public void settingOwnerOfAlreadyOwnedDogDoesNotChangeOwner() {
// 		callMethodUnderTest(dog, owner);
// 
// 		Owner anotherOwner = new Owner("Charles");
// 		callMethodUnderTest(dog, anotherOwner);
// 
// 		assertHasFieldSetTo(dog, Owner.class, owner);
// 		assertDoesNotHasFieldSetTo(dog, Owner.class, anotherOwner);
// 	}
// 
// 	@Test
// 	public void settingOwnerOfAlreadyOwnedDogDoesNotAddDogToOwner() {
// 		callMethodUnderTest(dog, owner);
// 
// 		Owner anotherOwner = new Owner("Charles");
// 		callMethodUnderTest(dog, anotherOwner);
// 
// 		assertDoesNotOwnDog(anotherOwner, dog);
// 	}
// 
// 	@Test
// 	public void settingOwnerOfAlreadyOwnedDogDoesNotAddRemoveDogFromCurrentOwner() {
// 		callMethodUnderTest(dog, owner);
// 
// 		Owner anotherOwner = new Owner("Charles");
// 		callMethodUnderTest(dog, anotherOwner);
// 
// 		assertOwnDog(owner, dog);
// 	}
// 
// 	@Test
// 	public void settingOwnerOfAlreadyOwnedDogToSameOwnerDoesNothing() {
// 		callMethodUnderTest(dog, owner);
// 		callMethodUnderTest(dog, owner);
// 
// 		Dog[] dogs = accessOwnDogs(owner);
// 		int count = 0;
// 
// 		for (Dog d : dogs) {
// 			if (d == dog)
// 				count++;
// 		}
// 
// 		assertHasFieldSetTo(dog, Owner.class, owner);
// 		assertOwnDog(owner, dog);
// 		assertEquals(1, count, String.format("Fel antal av hunden %s hos %s", dog, owner));
// 	}

}
