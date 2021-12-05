// JUnit-testfallen i denna fil testar metoden för att läsa in data om en hund i U6.4
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;

import org.junit.jupiter.api.*;


public class AssignmentSixPointFourTest extends IOBaseTest {

// 	private static final String DOG_NAME = "Devil";
// 	private static final String DOG_BREED = "Not a dog";
// 	private static final int DOG_AGE = 7;
// 	private static final int DOG_WEIGHT = 9;
// 	private static final double DOG_TAIL = 6.3;
// 
// 	public AssignmentSixPointFourTest() {
// 		super(AssignmentSixPointFour.class, "U6.4");
// 	}
// 
// 	@Test
// 	public void noStaticFieldsExceptPossibyConstants() {
// 		for (Field f : cut.getDeclaredFields()) {
// 			if (isConstant(f, String.class))
// 				continue;
// 			assertFalse(isStatic(f),
// 					"Det borde inte finnas någon anledning att använda en statisk variabel på denna uppgift, förutom möjligen någon konstant");
// 		}
// 	}
// 
// 	@Test
// 	public void noStaticMethods() {
// 		for (Method f : cut.getDeclaredMethods()) {
// 			assertFalse(isStatic(f),
// 					"Det borde inte finnas någon anledning att använda statiska metoder på denna uppgift");
// 		}
// 	}
// 
// 	@Test
// 	public void readDataForOneDog() {
// 		setIn("%s%n%s%n%d%n%d%n", DOG_NAME, DOG_BREED, DOG_AGE, DOG_WEIGHT);
// 
// 		Dog dog = (Dog) callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertEqualsIgnoreCase(DOG_NAME, dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase(DOG_BREED, dog.getBreed(), "Fel namn rasen");
// 		assertEquals(DOG_AGE, dog.getAge());
// 		assertEquals(DOG_WEIGHT, dog.getWeight());
// 		assertEquals(DOG_TAIL, dog.getTailLength(), 0.001);
// 	}
// 
// 	@Test
// 	public void readDataForMultipleDogs() {
// 		setIn("Fido\nBlandras\n1\n2\nKaro\nTax\n3\n4\n");
// 		AssignmentSixPointFour sut = new AssignmentSixPointFour();
// 
// 		Dog dog = (Dog) callMethodUnderTest(sut);
// 
// 		assertEqualsIgnoreCase("Fido", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Blandras", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(1, dog.getAge());
// 		assertEquals(2, dog.getWeight());
// 
// 		dog = (Dog) callMethodUnderTest(sut);
// 
// 		assertEqualsIgnoreCase("Karo", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Tax", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(3, dog.getAge());
// 		assertEquals(4, dog.getWeight());
// 	}
// 
// 	@Test
// 	public void fourPromptsPrintedToSystemOutWhenReadingData() {
// 		setIn("Fido\nBlandras\n1\n2\n");
// 		callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		String out = getOut();
// 		String promptsRemoved = out.replaceAll("\\?>", "");
// 
// 		int prompts = (out.length() - promptsRemoved.length()) / 2;
// 
// 		assertEquals(4, prompts, "Ledtexterna innehåller inte rätt antal ?>");
// 	}
// 
// 	@Test
// 	public void extraWhitespaceRemovedAroundName() {
// 		setIn(" \tFido\t  \nBlandras\n1\n2\n");
// 		Dog dog = (Dog) callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertEqualsIgnoreCase("Fido", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Blandras", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(1, dog.getAge());
// 		assertEquals(2, dog.getWeight());
// 	}
// 
// 	@Test
// 	public void extraWhitespaceRemovedAroundBreed() {
// 		setIn("Fido\n  \t Blandras\t\t  \n1\n2\n");
// 		Dog dog = (Dog) callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertEqualsIgnoreCase("Fido", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Blandras", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(1, dog.getAge());
// 		assertEquals(2, dog.getWeight());
// 	}
// 
// 	@Test
// 	public void emptyNameAskedForAgain() {
// 		setIn("\nFido\nBlandras\n1\n2\n");
// 		Dog dog = (Dog) callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertEqualsIgnoreCase("Fido", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Blandras", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(1, dog.getAge());
// 		assertEquals(2, dog.getWeight());
// 	}
// 
// 	@Test
// 	public void emptyBreedAskedForAgain() {
// 		setIn("Fido\n\nBlandras\n1\n2\n");
// 		Dog dog = (Dog) callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertEqualsIgnoreCase("Fido", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Blandras", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(1, dog.getAge());
// 		assertEquals(2, dog.getWeight());
// 	}
// 
// 	@Test
// 	public void whitespaceOnlyNameAskedForAgain() {
// 		setIn(" \t\t  \nFido\nBlandras\n1\n2\n");
// 		Dog dog = (Dog) callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertEqualsIgnoreCase("Fido", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Blandras", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(1, dog.getAge());
// 		assertEquals(2, dog.getWeight());
// 	}
// 
// 	@Test
// 	public void whiteSpaceOnlyBreedAskedForAgain() {
// 		setIn("Fido\n\t \t\nBlandras\n1\n2\n");
// 		Dog dog = (Dog) callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertEqualsIgnoreCase("Fido", dog.getName(), "Fel namn på hunden");
// 		assertEqualsIgnoreCase("Blandras", dog.getBreed(), "Fel namn rasen");
// 		assertEquals(1, dog.getAge());
// 		assertEquals(2, dog.getWeight());
// 	}
// 
// 	@Test
// 	public void emptyspaceOnlyNameGivesErrorMessage() {
// 		setIn("\nFido\nBlandras\n1\n2\n");
// 		callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void emptySpaceOnlyBreedGivesErrorMessage() {
// 		setIn("Fido\n\nBlandras\n1\n2\n");
// 		callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void whitespaceOnlyNameGivesErrorMessage() {
// 		setIn("  \nFido\nBlandras\n1\n2\n");
// 		callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertOutContainErrorMessage();
// 	}
// 
// 	@Test
// 	public void whiteSpaceOnlyBreedGivesErrorMessage() {
// 		setIn("Fido\n   \nBlandras\n1\n2\n");
// 		callMethodUnderTest(new AssignmentSixPointFour());
// 
// 		assertOutContainErrorMessage();
// 	}

	// VPL-testerna i ilearn innehåller mer avancerade scenarier för felhantering
}
