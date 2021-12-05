// JUnit-testfallen i denna fil testar metoden för att lägga till en ägare U8.1 
// För mer information se README.txt-filen
// 
// import static org.junit.jupiter.api.Assertions.*;
// 
// import java.util.*;
// 
// import org.junit.jupiter.api.*;
// 
// 
// public class AssignmentEightPointOneTest extends AssignmentEightIOBaseTest<AssignmentEightPointOne> {
// 
// 	public AssignmentEightPointOneTest() {
// 		super(AssignmentEightPointOne.class, "U8.1");
// 	}
// 
// 	@Test
// 	public void addingOneOwner() {
// 		setIn("Jozef\n");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 
// 		List<Owner> owners = accessOwnerList();
// 		assertEquals(1, owners.size(), "Listan av ägare innehåller fel antal");
// 		assertEqualsIgnoreCase("Jozef", owners.get(0).getName(), "Fel namn på ägaren");
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void addingTwoOwners() {
// 		setIn("Olle\nHenrik\n");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 		callMethodUnderTest(sut);
// 
// 		List<Owner> owners = accessOwnerList();
// 		assertEquals(2, owners.size(), "Listan av ägare innehåller fel antal");
// 
// 		// Det finns inget som kräver att ägarna ligger i någon speciell
// 		// ordning, så vi får mickla lite för att kolla var de finns
// 		final int[] olleFirst = { 0, 1 };
// 		final int[] henrikFirst = { 1, 0 };
// 
// 		int[] index = owners.get(0).getName().equalsIgnoreCase("Olle") ? olleFirst : henrikFirst;
// 
// 		assertEqualsIgnoreCase("Olle", owners.get(index[0]).getName(), "Fel namn på ägaren");
// 		assertEqualsIgnoreCase("Henrik", owners.get(index[1]).getName(), "Fel namn på ägaren");
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void extraWhitespaceRemovedAroundName() {
// 		setIn(" \t Patrick\t \n");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 
// 		List<Owner> owners = accessOwnerList();
// 		assertEquals(1, owners.size(), "Listan av ägare innehåller fel antal");
// 		assertEqualsIgnoreCase("Patrick", owners.get(0).getName(), "Fel namn på ägaren");
// 		assertOutDoesNotContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void emptyNameAskedForAgain() {
// 		setIn("\nJenny\n");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 
// 		List<Owner> owners = accessOwnerList();
// 		assertEquals(1, owners.size(), "Listan av ägare innehåller fel antal");
// 		assertEqualsIgnoreCase("Jenny", owners.get(0).getName(), "Fel namn på ägaren");
// 	}
// 
// 	@Test
// 	public void whitespaceOnlyNameAskedForAgain() {
// 		setIn(" \t \nAnita\n");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 
// 		List<Owner> owners = accessOwnerList();
// 		assertEquals(1, owners.size(), "Listan av ägare innehåller fel antal");
// 		assertEqualsIgnoreCase("Anita", owners.get(0).getName(), "Fel namn på ägaren");
// 	}
// 
// 	@Test
// 	public void multipleEmptyAndWhitespaceOnlyNamesHandled() {
// 		setIn("\n \n\n\t\nMarie");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 
// 		List<Owner> owners = accessOwnerList();
// 		assertEquals(1, owners.size(), "Listan av ägare innehåller fel antal");
// 		assertEquals("Marie", owners.get(0).getName());
// 	}
// 
// 	@Test
// 	void emptyNameGivesErrorMessage() {
// 		setIn("\nMel");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	void whitespaceOnlyNameGivesErrorMessage() {
// 		setIn("\t\t  \nBrooks");
// 		createSut();
// 
// 		callMethodUnderTest(sut);
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// }
// //COMMENT
