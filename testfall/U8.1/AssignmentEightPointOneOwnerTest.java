// JUnit-testfallen i denna fil testar ägarklassen i U8.1
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.lang.reflect.*;

import org.junit.jupiter.api.*;


@DisplayName(value = "JUnit-testfall för ägarklassen i U8.1 version 1.0")
public class AssignmentEightPointOneOwnerTest extends FunctionBaseTest {

// 	public AssignmentEightPointOneOwnerTest() {
// 		super(Owner.class);
// 	}
// 
// 	@Test
// 	public void onlyOneConstructor() {
// 		assertEquals(1, Owner.class.getDeclaredConstructors().length, "Ägarklassen ska bara ha en konstruktor");
// 	}
// 
// 	@Test
// 	public void constructorAcceptsName() {
// 		assumeTrue(Owner.class.getDeclaredConstructors().length == 1, "Fel antal konstruktorer, testet kan inte köras");
// 		assertDoesNotThrow(() -> Owner.class.getConstructor(String.class),
// 				"Konstruktorn accepterar inte namnet på ägaren");
// 	}
// 
// 	@Test
// 	public void hasMethodToAccessName() throws NoSuchMethodException, SecurityException {
// 		Method m = Owner.class.getDeclaredMethod("getName");
// 		assertEquals(String.class, m.getReturnType());
// 	}
// 
// 	@Test
// 	@DisplayName(value = "Sätter konstruktorn namnet på ägaren?")
// 	public void constructorSetsName() {
// 		Owner o = new Owner("Stefan");
// 		assertEqualsIgnoreCase("Stefan", o.getName(), "Fel namn på ägaren");
// 	}
// 
// 	@Test
// 	public void toStringContainsName() {
// 		String result = new Owner("Olle").toString();
// 		assertTrue(result.toLowerCase().contains("olle"),
// 				String.format("toString innehåller inte namnet Olle: \"%s\"", result));
// 	}
// 
// 	@Test
// 	public void noStaticMethods() {
// 		for (Method m : Owner.class.getMethods()) {
// 			if (Modifier.isStatic(m.getModifiers()))
// 				fail("Ägarklassen ska inte innehålla några statiska metoder");
// 		}
// 	}
// 
// 	@Test
// 	public void reasonableNumberOfPublicMethods() {
// 		int methods = 0;
// 		for (Method m : Owner.class.getMethods()) {
// 			if (m.getDeclaringClass() == Owner.class && isPublic(m)) {
// 				methods++;
// 			}
// 		}
// 
// 		assertTrue(methods <= 6,
// 				"Det finns (antagligen) för många publika metoder i ägarklassen. Detta test kan ha fel, och i så fall får du höra av dig till handledningsforumet för att få det uppdaterat, men, inte ens om du implementerat klart hela systemet borde det behövas så här många publika metoder. Gränsen är ganska generöst satt.");
// 	}

}
