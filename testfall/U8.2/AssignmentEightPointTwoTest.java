// JUnit-testfallen i denna fil testar funktionen för att hitta en ägare U8.2
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.jupiter.api.*;


public class AssignmentEightPointTwoTest extends FunctionBaseTest {

// 	private AssignmentEightPointTwo sut = new AssignmentEightPointTwo();
// 
// 	public AssignmentEightPointTwoTest() {
// 		super(AssignmentEightPointTwo.class, "U8.2");
// 	}
// 
// 	@SuppressWarnings("unchecked")
// 	private List<Owner> accessOwnerList(Object obj) {
// 		return (List<Owner>) accessFieldUnderTest(obj, OWNERS_FIELD_ID);
// 	}
// 
// 	private Owner callMethodUnderTest(String name) {
// 		if (mut.getReturnType() == Owner.class) {
// 			return (Owner) callMethodUnderTest(sut, name);
// 		}
// 		if (mut.getReturnType() == Optional.class) {
// 			@SuppressWarnings("unchecked")
// 			Optional<Owner> od = (Optional<Owner>) callMethodUnderTest(sut, name);
// 			return od.orElse(null);
// 		}
// 		fail("Returtypen på metoden är inte någon av de förväntade (Owner eller Optional<Owner>)");
// 		// Kan inte hända på grund av fail ovan, men krävs av kompilatorn
// 		return null;
// 	}
// 
// 	@Test
// 	void searchingForOwnerThatExistsGivesOwner()
// 			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
// 		final Owner JENNY = new Owner("Jenny");
// 		final Owner JOHANNA = new Owner("Johanna");
// 		final Owner ULLA = new Owner("Ulla");
// 		final Owner IRIS = new Owner("Iris");
// 		final Owner IVAR = new Owner("Ivar");
// 
// 		Collection<Owner> owners = accessOwnerList(sut);
// 		owners.addAll(Arrays.asList(new Owner[] { JENNY, JOHANNA, ULLA, IRIS, IVAR }));
// 
// 		assertEquals(JENNY, callMethodUnderTest("Jenny"), "Fel användare hittad");
// 		assertEquals(ULLA, callMethodUnderTest("ULLA"), "Fel användare hittad");
// 		assertEquals(IVAR, callMethodUnderTest("ivar"), "Fel användare hittad");
// 	}
// 
// 	@Test
// 	void searchingForOwnerThatDoesNotExistsYealdsNothing()
// 			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
// 		final Owner JENNY = new Owner("Jenny");
// 		final Owner JOHANNA = new Owner("Johanna");
// 		final Owner ULLA = new Owner("Ulla");
// 		final Owner IRIS = new Owner("Iris");
// 		final Owner IVAR = new Owner("Ivar");
// 
// 		Collection<Owner> owners = accessOwnerList(sut);
// 		owners.addAll(Arrays.asList(new Owner[] { JENNY, JOHANNA, ULLA, IRIS, IVAR }));
// 
// 		assertNull(callMethodUnderTest("Karolina"), "Hittade en användare som inte borde hittats");
// 		assertNull(callMethodUnderTest("Jen"), "Hittade en användare som inte borde hittats");
// 		assertNull(callMethodUnderTest("Ulla-Bella"), "Hittade en användare som inte borde hittats");
// 	}
// 
// 	@Test
// 	void searchingInEmptyListYealdsNothing()
// 			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
// 		assertNull(callMethodUnderTest("Anyone"), "Hittade en användare som inte borde hittats");
// 	}

	// TODO: fler test
}
