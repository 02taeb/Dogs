// JUnit-testfallen i denna fil testar hundklassen i U6.2
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.regex.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;


// TODO: @DisplayName(value = "JUnit-testfall för U6.2 version 2.0")
public class AssignmentSixPointTwoDogTest extends FunctionBaseTest {

// 	public AssignmentSixPointTwoDogTest() {
// 		super(Dog.class);
// 	}
// 
// 	private static final String DEFAULT_NAME = "karo";
// 	private static final String DEFAULT_NONE_DACHSHUND_BREED = "bulldog";
// 	private static final int DEFAULT_AGE = 3;
// 	private static final int DEFAULT_WEIGHT = 7;
// 
// 	private static final double MAX_DIFFERENCE_ALLOWED_FOR_TAIL_LENGHT = 0.001;
// 
// 	private final Dog defaultDog = new Dog(DEFAULT_NAME, DEFAULT_NONE_DACHSHUND_BREED, DEFAULT_AGE, DEFAULT_WEIGHT);
// 
// 	@Test
// 	// TODO: @DisplayName(value = "Sätter konstruktorn namnet på hunden?")
// 	public void constructorSetsName() {
// 		assertEqualsIgnoreCase(DEFAULT_NAME, defaultDog.getName(), "Fel namn på hunden");
// 	}
// 
// 	@Test
// 	public void constructorSetsBreed() {
// 		assertEqualsIgnoreCase(DEFAULT_NONE_DACHSHUND_BREED, defaultDog.getBreed(), "Fel ras på hunden");
// 	}
// 
// 	@Test
// 	public void constructorSetsAge() {
// 		assertEquals(DEFAULT_AGE, defaultDog.getAge(), "Fel ålder på hunden");
// 	}
// 
// 	@Test
// 	public void constructorSetsWeight() {
// 		assertEquals(DEFAULT_WEIGHT, defaultDog.getWeight(), "Fel vikt på hunden");
// 	}
// 
// 	@Test
// 	public void tailLengthCalculatedForNonDachshund() {
// 		assertEquals(2.1, defaultDog.getTailLength(), MAX_DIFFERENCE_ALLOWED_FOR_TAIL_LENGHT,
// 				"Fel svanslängd på hunden");
// 	}
// 
// 	@Test
// 	public void tailLengthCalculatedForDachshund() {
// 		Dog dog = new Dog(DEFAULT_NAME, "Dachshund", DEFAULT_AGE, DEFAULT_WEIGHT);
// 		assertEquals(3.7, dog.getTailLength(), MAX_DIFFERENCE_ALLOWED_FOR_TAIL_LENGHT,
// 				"Fel svanslängd för en (engelsk) tax");
// 	}
// 
// 	@Test
// 	public void tailLengthCalculatedForTax() {
// 		Dog dog = new Dog(DEFAULT_NAME, "Tax", DEFAULT_AGE, DEFAULT_WEIGHT);
// 		assertEquals(3.7, dog.getTailLength(), MAX_DIFFERENCE_ALLOWED_FOR_TAIL_LENGHT,
// 				"Fel svanslängd för en (svensk) tax");
// 	}
// 
// 	@ParameterizedTest
// 	@CsvSource({ "getName, java.lang.String", "getBreed, java.lang.String", "getAge, int", "getWeight, int",
// 			"getTailLength, double" })
// 	public void correctReturnTypeForGetMethods(String methodName, String expectedType)
// 			throws NoSuchMethodException, SecurityException {
// 		Method m = Dog.class.getMethod(methodName);
// 		assertEquals(expectedType, m.getReturnType().getName(),
// 				String.format("Metoden %s har fel returtyp", methodName));
// 	}
// 
// 	@ParameterizedTest
// 	@CsvSource({ "Karo", "fido", "Milou", "REX", "Fluffy destroyer of worlds" })
// 	public void constructorAcceptsNameInDifferentFormats(String name) {
// 		Dog dog = new Dog(name, DEFAULT_NONE_DACHSHUND_BREED, DEFAULT_AGE, DEFAULT_WEIGHT);
// 		assertEqualsIgnoreCase(name, dog.getName(), "Fel namn på hunden");
// 	}
// 
// 	@ParameterizedTest
// 	@CsvSource({ "Schäfer", "PULI", "golden retriever" })
// 	public void constructorAcceptBreedInDifferentFormats(String breed) {
// 		Dog dog = new Dog(DEFAULT_NAME, breed, DEFAULT_AGE, DEFAULT_WEIGHT);
// 		assertEqualsIgnoreCase(breed, dog.getBreed(), "Fel ras på hunden");
// 	}
// 
// 	@ParameterizedTest
// 	@CsvSource({ "Dachshund", "DACHSHUND", "dachshund", "Tax", "TAX", "tax" })
// 	public void constructorAcceptDacshundsInDifferentFormats(String breed) {
// 		Dog dog = new Dog(DEFAULT_NAME, breed, DEFAULT_AGE, DEFAULT_WEIGHT);
// 		assertEqualsIgnoreCase(breed, dog.getBreed(), "Fel ras på hunden");
// 		assertEquals(3.7, dog.getTailLength(), "Fel svanslängd för taxen");
// 	}
// 
// 	@Test
// 	public void toStringContainsName() {
// 		String result = defaultDog.toString();
// 		assertTrue(result.toLowerCase().contains(DEFAULT_NAME.toLowerCase()),
// 				String.format("toString innehåller inte namnet %s: \"%s\"", DEFAULT_NAME, result));
// 	}
// 
// 	@Test
// 	public void toStringContainsBreed() {
// 		String result = defaultDog.toString();
// 		assertTrue(result.toLowerCase().contains(DEFAULT_NONE_DACHSHUND_BREED.toLowerCase()),
// 				String.format("toString innehåller inte rasen %s: \"%s\"", DEFAULT_NONE_DACHSHUND_BREED, result));
// 	}
// 
// 	@Test
// 	public void toStringContainsAge() {
// 		String result = defaultDog.toString();
// 		assertTrue(result.toLowerCase().contains("" + DEFAULT_AGE),
// 				String.format("toString innehåller inte åldern %d: \"%s\"", DEFAULT_AGE, result));
// 	}
// 
// 	@Test
// 	public void toStringContainsWeight() {
// 		String result = defaultDog.toString();
// 		assertTrue(result.toLowerCase().contains("" + DEFAULT_WEIGHT),
// 				String.format("toString innehåller inte vikten %d: \"%s\"", DEFAULT_WEIGHT, result));
// 	}
// 
// 	@Test
// 	public void toStringContainsNewLine(){
// 		String result = defaultDog.toString();
// 		assertFalse(result.contains("\n"), "toString innehåller \\n vilket kan ställa till med problem för andra test längre fram, och indikerar att metoden används för formatering vilket inte riktigt är syftet");
// 		assertFalse(result.contains("\r"), "toString innehåller \\r vilket kan ställa till med problem för andra test längre fram, och indikerar att metoden används för formatering vilket inte riktigt är syftet");
// 	}
// 	
// 	@Test
// 	public void toStringContainsTailLength() {
// 		String result = defaultDog.toString().replaceAll("\n", "");
// 		Pattern p = Pattern.compile(".*2[.,](1|09).*");
// 		Matcher m = p.matcher(result);
// 
// 		assertTrue(m.matches(), String
// 				.format("toString innehåller inte svanslängden 2.1 eller 2,1 (med lite felmarginal): \"%s\"", result));
// 	}
// 
// 	/*
// 	 * Detta test är hårdare än ovanstående och kräver att det inte blir ett
// 	 * avrundningsfel i första decimalen. Det är inte ett absolut krav att detta
// 	 * test fungerar, det är avslaget i ilearn, men det borde göra det. Om du får en
// 	 * svanslängd som är 2.0999... så gör du beräkningen i fel ordning, och
// 	 * troligtvis har du en parentes på fel ställe.
// 	 * 
// 	 * Kursboken på IDSV (som många av er gått) tar upp problemet med flyttals
// 	 * precision.
// 	 */
// //	@Test
// //	public void toStringContainsStrictTailLength() {
// //		String result = defaultDog.toString().replaceAll("\n", "");
// //		Pattern p = Pattern.compile(".*2[.,]1.*");
// //		Matcher m = p.matcher(result);
// //
// //		assertTrue(m.matches(), String.format("toString innehåller inte svanslängden 2.1 eller 2,1: \"%s\"", result));
// //	}
// 
// 	@Test
// 	public void toStringContainsSeparators() {
// 		// Detta test är väldigt svagt. Syftet är att kontrollera att de olika
// 		// delarna i toString kan skiljas från varandra, men det enda som kontrolleras
// 		// är att längden på strängen är tillräckligt lång för att detta ska vara
// 		// möjligt. Anledningen till detta svaga test är att formatet på strängen
// 		// bestäms av dig.
// 		int minLength = DEFAULT_NAME.length() + DEFAULT_NONE_DACHSHUND_BREED.length() + 1/* age */ + 1/* weight */
// 				+ 3/* tail length */ + 4/* separators */;
// 		assertTrue(defaultDog.toString().length() >= minLength,
// 				"toString ger en för kort sträng för att kunna innehålla separatorer mellan attributen");
// 	}
// 
// 	private Method identifyAgeingMethod() {
// 		for (Method m : Dog.class.getMethods()) {
// 			if (m.getDeclaringClass() == Dog.class) {
// 				switch (m.getName()) {
// 				case "getName":
// 				case "getBreed":
// 				case "getAge":
// 				case "getWeight":
// 				case "getTailLength":
// 				case "toString":
// 					// Ignore all these
// 					break;
// 				default:
// 					if (isPublic(m) && (m.getName().startsWith("age") || m.getName().contains("Age"))
// 							&& m.getParameterCount() <= 1)
// 						return m;
// 				}
// 			}
// 		}
// 
// 		fail("Kunde inte hitta någon metod för att öka åldern. Eftersom metoden inte är specificerad i klassdiagrammet i uppgiften försöker detta test gissa sig till vilken metod det rör sig om genom att titta på skydddsnivån, namnet och antalet parametrar.");
// 		return null; // Kan inte inträffa på grund av fail ovan
// 
// 	}
// 
// 	public void ageDogOneYear(Dog dog) {
// 		ageDog(dog, 1);
// 	}
// 
// 	public void ageDog(Dog dog, int years) {
// 		try {
// 			Method m = identifyAgeingMethod();
// 
// 			if (m.getParameterCount() == 0) {
// 				for (int n = 0; n < years; n++) {
// 					m.invoke(dog);
// 				}
// 			} else {
// 				m.invoke(dog, years);
// 			}
// 		} catch (NullPointerException | IllegalAccessException | IllegalArgumentException
// 				| InvocationTargetException e) {
// 			throw new RuntimeException("Kunde inte anropa metoden för att öka hundens ålder", e);
// 		}
// 	}
// 
// 	@ParameterizedTest
// 	@ValueSource(ints = { 1, 2, 3 })
// 	public void ageAttributeUpdatedOnAgeing(int years)
// 			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
// 		ageDog(defaultDog, years);
// 		assertEquals(DEFAULT_AGE + years, defaultDog.getAge(), "Fel ålder efter ökning med 1");
// 	}
// 
// 	@Test
// 	public void ageAttributeUnchangedWhenTryingToDecreaseAge() {
// 		ageDog(defaultDog, -2);
// 		assertEquals(DEFAULT_AGE, defaultDog.getAge(), "Fel ålder vid försök att minska åldern");
// 	}
// 
// 	@Test
// 	public void toStringContainsNewAgeAfterAgeing() {
// 		ageDogOneYear(defaultDog);
// 
// 		String result = defaultDog.toString();
// 		int expectedAge = DEFAULT_AGE + 1;
// 		assertTrue(result.toLowerCase().contains("" + expectedAge),
// 				String.format("toString innehåller inte åldern %d: \"%s\"", expectedAge, result));
// 	}
// 
// 	@Test
// 	public void toStringContainsNewTailLengthAfterAgeing() {
// 		ageDogOneYear(defaultDog);
// 
// 		String result = defaultDog.toString().replaceAll("\n", "");
// 		Pattern p = Pattern.compile(".*2[.,]8.*");
// 		Matcher m = p.matcher(result);
// 
// 		assertTrue(m.matches(), String.format("toString innehåller inte svanslängden 2.8 eller 2,8: \"%s\"", result));
// 	}
// 
// 	@Test
// 	public void noSetAgeMethod() throws NoSuchMethodException, SecurityException {
// 		// Inga parametrar
// 		assertThrows(NoSuchMethodException.class, () -> Dog.class.getMethod("setAge"),
// 				"Metoden som saknas i klassdiagrammet ska öka åldern, inte sätta den till ett visst värde som namnet antyder");
// 		// En parameter
// 		assertThrows(NoSuchMethodException.class, () -> Dog.class.getMethod("setAge", Integer.TYPE),
// 				"Metoden som saknas i klassdiagrammet ska öka åldern, inte sätta den till ett visst värde som namnet antyder");
// 	}
// 
// 	@Test
// 	public void noStaticMethods() {
// 		for (Method m : Dog.class.getMethods()) {
// 			if (Modifier.isStatic(m.getModifiers()))
// 				fail("Hundklassen ska inte innehålla några statiska metoder.");
// 		}
// 	}
// 
// 	@Test
// 	public void onlyOneConstructor() {
// 		assertEquals(1, Dog.class.getDeclaredConstructors().length,
// 				"Hundklassen ska bara ha en konstruktor, den som finns i klassdiagrammet till U6.2");
// 	}
// 
// 	@Test
// 	public void reasonableNumberOfPublicMethods() {
// 		int methods = 0;
// 		for (Method m : Dog.class.getMethods()) {
// 			if (m.getDeclaringClass() == Dog.class && isPublic(m)) {
// 				methods++;
// 			}
// 		}
// 
// 		assertTrue(methods >= 7,
// 				"Det finns för få publika metoder i hundklassen för att den ska kunna stämma med klassdiagrammet. Det måste minst finnas minst 7. De sex som syns i diagrammet och en extra för att öka åldern enligt uppgiften.");
// 		assertTrue(methods <= 14,
// 				"Det finns (antagligen) för många publika metoder i hundklassen. Detta test kan ha fel, och i så fall får du höra av dig till handledningsforumet för att få det uppdaterat, men, inte ens om du implementerat klart hela systemet borde det behövas så här många publika metoder. Gränsen är ganska generöst satt.");
// 	}

}
