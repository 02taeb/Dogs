// JUnit-testfallen i denna fil testar Denna klass behövs för (nästan) alla test för föreläsning 8. Kommentarerna för hela klassen kan tas bort så fort ägarklassen är påbörjad, de ska INTE tas bort steg för steg  
// För mer information se README.txt-filen
// 
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.fail;
// 
// import java.lang.reflect.InvocationTargetException;
// import java.util.*;
// 
// 
// public abstract class AssignmentEightIOBaseTest<SUTType> extends IOBaseTest {
// 
// 	protected SUTType sut;
// 
// 	public AssignmentEightIOBaseTest() {
// 		super();
// 	}
// 
// 	public AssignmentEightIOBaseTest(Class<?> cut) {
// 		super(cut);
// 	}
// 
// 	public AssignmentEightIOBaseTest(Class<?> cut, String mutId) {
// 		super(cut, mutId);
// 	}
// 
// 	@SuppressWarnings("unchecked")
// 	protected void createSut() {
// 		try {
// 			sut = (SUTType) cut.getDeclaredConstructor().newInstance();
// 		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
// 				| NoSuchMethodException | SecurityException e) {
// 			fail("Kunde inte skapa ett objekt av klassen " + cut, e);
// 		}
// 	}
// 
// 	protected void addDogs(Dog... dogs) {
// 		accessDogList(sut).addAll(Arrays.asList(dogs));
// 	}
// 
// 	protected void addOwners(Owner... owners) {
// 		accessOwnerList().addAll(Arrays.asList(owners));
// 	}
// 
// 	protected void addDogToOwner(Owner owner, Dog dog) {
// 		callMethodById(owner, "U8.3", dog);
// 	}
// 
// 	protected List<Dog> accessDogList() {
// 		return accessDogList(sut);
// 	}
// 
// 	@SuppressWarnings("unchecked")
// 	protected List<Owner> accessOwnerList() {
// 		assertNotNull(sut);
// 		return (List<Owner>) accessFieldUnderTest(sut, OWNERS_FIELD_ID);
// 	}
// 
// 	protected void assertIsOwnedBy(Dog dog, Owner expectedOwner) {
// 		assertHasFieldSetTo(dog, Owner.class, expectedOwner);
// 	}
// 
// 	protected Dog[] accessOwnedDogs(Owner owner) {
// 		return (Dog[]) accessOnlyFieldOfType(owner, Dog[].class);
// 	}
// 
// 	protected void assertOwnDog(Owner owner, Dog expectedDog) {
// 		Dog[] dogs = accessOwnedDogs(owner);
// 		assertContains(Arrays.asList(dogs), expectedDog, owner+" äger inte den förväntade hunden");
// 	}
// 
// 	protected void assertDoesNotOwnDog(Owner owner, Dog unexpectedDog) {
// 		Dog[] dogs = accessOwnedDogs(owner);
// 		assertDoesNotContains(Arrays.asList(dogs), unexpectedDog, owner+" äger en hund som hen inte borde");
// 	}
// 
// 
// }
// //COMMENT
