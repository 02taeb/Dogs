// JUnit-testfallen i denna fil testar inläsningsklassen i U6.3
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;


public class AssignmentSixPointThreeInputClassTest extends BaseTest {

	private static final Class<Object> DEFAULT_CLASS_WITHOUT_ANNOTATION = Object.class;

	private static final File WORKING_DIR = new File("");
	private static final File[] POSSIBLE_ROOTS = { WORKING_DIR.getAbsoluteFile(),
			WORKING_DIR.getAbsoluteFile().getParentFile() };

	// Detta test behöver hitta din inläsningsklass. Den gör det genom att söka
	// igenom filsystemet efter en klass med märkningen @UnderTest(id="U6.3").
	// Beroende på utvecklingsmiljö och var man valt att lägga filerna kan den
	// misslyckas med detta, även om klassen är korrekt markerad. I sådana fall
	// kommer inget av testfallen att köras, och du kommer att få ett felmeddelande
	// som säger något i stil med: org.opentest4j.AssertionFailedError:
	//
	// Kunde inte hitta en kompilerad klass märkt med @UnderTest(id="U6.3") ==>
	// expected: not <null>
	//
	// Kontrollera först att märkningen verkligen är korrekt, det är till exempel
	// lätt att skriva 6.3 istället för U6.3, eller att sätta märkningen på något
	// annat än klassen. Om märkningen är korrekt och inläsningsklassen ändå inte
	// hittas kan du hårdkoda namnet på raden nedan. Du kan också göra detta om
	// det tar alltför lång tid att hitta klassen.
	//
	// För att göra detta byter du ut
	// private static Class<?> inputClass;
	// mot
	// private static Class<?> inputClass = NamnetPåDinKlass.class;
	// Obs! att .class måste stå efter klassnamnet, och att eventuella paket också
	// ingår i namnet på klassen. Namnet på Scanner-klassen är, till exempel, inte
	// Scanner, utan java.util.Scanner.
	private static Class<?> inputClass;
	private static Method textInputMethod;
	private static Method integerInputMethod;
	private static Method decimalInputMethod;

	private ByteArrayOutputStream out = new ByteArrayOutputStream();

	public AssignmentSixPointThreeInputClassTest() {
		super(inputClass);
	}

	@BeforeEach
	public void setOutput() {
		System.setOut(new PrintStream(out));
	}

	@BeforeAll
	public static void identifyInputClassAndMethods() {
		if (inputClass == null) {
			inputClass = identifyInputClass();
		}
		assertNotNull(inputClass, "Kunde inte hitta en kompilerad klass märkt med @UnderTest(id=\"U6.3\")");

		for (Method m : inputClass.getDeclaredMethods()) {
			if (isPublic(m)) {
				saveInputMethod(m);
			}
		}

		assertNotNull(textInputMethod, "Kunde inte hitta någon publik metod för att läsa in text");
		assertNotNull(integerInputMethod, "Kunde inte hitta någon publik metod för att läsa in heltal");
		assertNotNull(decimalInputMethod, "Kunde inte hitta någon publik metod för att läsa in decimaltal");
	}

	private static Class<?> identifyInputClass() {
		for (File root : POSSIBLE_ROOTS) {
			if (root == null)
				continue;

			Class<?> c = identifyInputClass(root);
			if (c != null)
				return c;
		}

		return null;
	}

	private static Class<?> identifyInputClass(File dir) {
		assertTrue(dir.isDirectory(), dir + " är inte en katalog");

		File[] files = dir.listFiles();

		// Hanterar kataloger som inte är läsbara, .listFiles() returnerar null vid
		// IOException
		if (files == null)
			return null;

		for (File f : files) {
			if (f.isDirectory()) {
				Class<?> c = identifyInputClass(f);
				if (c != null)
					return c;
			} else {
				if (isClassContainingFile(f)) {
					Class<?> c = loadClass(f);
					if (hasUnderTestAnnotation(c, "U6.3"))
						return c;
				}
			}
		}

		return null;
	}

	private static boolean isClassContainingFile(File f) {
		return f.getName().endsWith(".java") || f.getName().endsWith(".class");
	}

	private static Class<?> loadClass(File f) {
		String name = f.getName();
		name = name.replace(".java", "");
		name = name.replace(".class", "");

		Class<?> c = loadClass(name);
		String packageName = "";
		while (c == DEFAULT_CLASS_WITHOUT_ANNOTATION && f.getParentFile() != null) {
			f = f.getParentFile();
			packageName = f.getName() + "." + packageName;
			c = loadClass(packageName + name);
		}

		return c;
	}

	private static Class<?> loadClass(String className) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		assertNotNull(loader, "Could not access class loader");

		try {
			return loader.loadClass(className);
		} catch (ClassNotFoundException e) {
			// Vid fel returnerar vi en klass som garanterat inte har den sökta markeringen
			return DEFAULT_CLASS_WITHOUT_ANNOTATION;
		}
	}

	private static void saveInputMethod(Method m) {
		assertEquals(1, m.getParameterCount(), "Fel antal parametrar till publik metod");
		assertEquals(String.class, m.getParameters()[0].getType(), "Fel parametertyp till publik metod");

		switch (m.getReturnType().getName()) {
		case "java.lang.String":
			assertNull(textInputMethod, "Flera publika metoder för text");
			textInputMethod = m;
			break;
		case "int":
		case "long":
			assertNull(integerInputMethod, "Flera publika metoder för heltal");
			integerInputMethod = m;
			break;
		case "float":
		case "double":
			assertNull(decimalInputMethod, "Flera publika metoder för decimaltal");
			decimalInputMethod = m;
			break;
		default:
			fail("Oväntad publik metod funnen i klassen: " + m);
		}
	}

// 	@Test
// 	public void checkNameOfClassForObviousProblems() {
// 		assertFalse(inputClass.getName().equals("Scanner"),
// 				"Scanner är inte ett bra namn på klassen, det går inte att skilja från java.util.Scanner");
// 		assertFalse(inputClass.getName().equals("Input"),
// 				"Input är inte ett bra namn på klassen, det är för allmänt i sig självt");
// 		assertFalse(inputClass.getName().contains("Class"),
// 				"Klassnamn ska inte innehålla ordet Class, det är onödigt och klottrar ner namnet");
// 		// Detta test kan misslyckas om namnet i singular slutar på s.
// 		// Har du ett sådant namn hör av dig till handledningsforumet
// 		// så uppdaterar vi testet.
// 		assertFalse(inputClass.getName().endsWith("s"),
// 				"Klassnamn är normalt i singular, om klassen inte representerar en samling av objekt vilket inte är fallet här. Även i fallet med samlingar är det vanlig att namnet på klassen är i singular, och istället visar att det är en samling genom att heta något som innehåller Collection, List, edyl.");
// 	}
// 
// 	private void checkNameOfMethodForObviousProblems(Method m) {
// 		assertFalse(m.getName().contains("Method"),
// 				"Metodnamn ska inte innehålla ordet Method, det är helt onödigt och klottrar ner namnet");
// 	}
// 
// 	@Test
// 	public void checkNameOfMethodsForObviousProblems() {
// 		checkNameOfMethodForObviousProblems(textInputMethod);
// 		checkNameOfMethodForObviousProblems(integerInputMethod);
// 		checkNameOfMethodForObviousProblems(decimalInputMethod);
// 	}
// 
// 	@Test
// 	public void classHasTwoConstructors() {
// 		assertEquals(2, inputClass.getConstructors().length);
// 	}
// 
// 	@Test
// 	public void classHasConstructorWithNoParameters() {
// 		assertDoesNotThrow(() -> inputClass.getConstructor());
// 	}
// 
// 	@Test
// 	public void classHasConstructorWithOneParameters() {
// 		assertDoesNotThrow(() -> inputClass.getConstructor(InputStream.class));
// 	}
// 
// 	private Object getNewAdapterForSystemIn() {
// 		try {
// 			return inputClass.getConstructor().newInstance();
// 		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException
// 				| SecurityException e) {
// 			fail("Kunde inte skapa en ny instans av inläsningsklassen", e);
// 			// Kan inte inträffa på grund av fail ovan
// 			return null;
// 		} catch (InvocationTargetException e) {
// 			// Förväntat fel om man försöker skapa flera instanser
// 			// som ska läsa från samma källa
// 			if (e.getCause().getClass() == IllegalStateException.class)
// 				throw (IllegalStateException) e.getCause();
// 			fail("Kunde inte skapa en ny instans av inläsningsklassen", e);
// 			// Kan inte inträffa på grund av fail ovan
// 			return null;
// 		}
// 	}
// 
// 	private Object getNewAdapter(InputStream in) {
// 		try {
// 			return inputClass.getConstructor(InputStream.class).newInstance(in);
// 		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException
// 				| SecurityException e) {
// 			fail("Kunde inte skapa en ny instans av inläsningsklassen", e);
// 			// Kan inte inträffa på grund av fail ovan
// 			return null;
// 		} catch (InvocationTargetException e) {
// 			// Förväntat fel om man försöker skapa flera instanser
// 			// som ska läsa från samma källa
// 			if (e.getCause().getClass() == IllegalStateException.class)
// 				throw (IllegalStateException) e.getCause();
// 			fail("Kunde inte skapa en ny instans av inläsningsklassen", e);
// 			// Kan inte inträffa på grund av fail ovan
// 			return null;
// 		}
// 	}
// 
// 	private Object getNewAdapter(String input) {
// 		return getNewAdapter(new ByteArrayInputStream((input + "\n").getBytes()));
// 	}
// 
// 	private void assertPromptWas(String expected) {
// 		String sysOut = out.toString().trim();
// 		assertTrue(sysOut.startsWith(expected), String.format(
// 				"Text written to System.out does not match the expected. Was '%s', but expected something like '%s ?>'",
// 				sysOut, expected));
// 		assertTrue(sysOut.endsWith("?>"), String.format(
// 				"Text written to System.out does not match the expected. Was '%s', but expected something like '%s ?>'",
// 				sysOut, expected));
// 	}
// 
// 	private Object callInputMethod(Object adapter, Method m, String prompt) {
// 		try {
// 			return m.invoke(adapter, prompt);
// 		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
// 			fail("Kunde inte anropa inläsningsmetoden " + m, e);
// 			// Kan inte inträffa på grund av fail ovan
// 			return null;
// 		}
// 	}
// 
// 	private Object callInputMethod(Method m, String input, String prompt) {
// 		return callInputMethod(getNewAdapter(input), m, prompt);
// 	}
// 
// 	@Test
// 	public void testMethodToReadText() {
// 		var result = callInputMethod(textInputMethod, "input text", "prompt text");
// 		assertPromptWas("prompt text");
// 		assertEquals("input text", result);
// 	}
// 
// 	@Test
// 	public void testMethodToReadInt() {
// 		var result = callInputMethod(integerInputMethod, "123", "prompt integer");
// 		assertPromptWas("prompt integer");
// 		assertEquals(123, result);
// 	}
// 
// 	@ParameterizedTest
// 	@CsvSource({ "en,GB", "sv,SE" }) // Testar både engelska och svenska landsinställningar
// 	public void testMethodReadDouble(String language, String country) {
// 		Locale defaultLocale = Locale.getDefault();
// 
// 		try {
// 			Locale.setDefault(new Locale(language, country));
// 			// String.format för att landsinställningarna ska användas
// 			var result = callInputMethod(decimalInputMethod, String.format("%f", 1.23), "prompt decimal");
// 			assertPromptWas("prompt decimal");
// 			assertEquals(1.23, result);
// 		} finally {
// 			Locale.setDefault(defaultLocale);
// 		}
// 	}
// 
// 	@Test
// 	public void readingIntegerClearsBuffer() {
// 		Object adapter = getNewAdapter("1\ntext");
// 		Object result = callInputMethod(adapter, integerInputMethod, "prompt");
// 		assertEquals(1, result);
// 		result = callInputMethod(adapter, textInputMethod, "prompt");
// 		assertEquals("text", result);
// 	}
// 
// 	@Test
// 	public void readingDecimalClearsBuffer() {
// 		Object adapter = getNewAdapter(String.format("%.1f%ntext", 1.2));
// 		Object result = callInputMethod(adapter, decimalInputMethod, "prompt");
// 		assertEquals(1.2, result);
// 		result = callInputMethod(adapter, textInputMethod, "prompt");
// 		assertEquals("text", result);
// 	}
// 
// 	@Test
// 	public void readingDifferentThingsDoesNotCauseProblemsWithBuffering() {
// 		Object adapter = getNewAdapter(String.format("%s%n%d%n%f%n%d%n%s%n%f%n", "first", 2, 3.0, 4, "fifth", 6.0));
// 		Object result;
// 		result = callInputMethod(adapter, textInputMethod, "prompt");
// 		assertEquals("first", result);
// 		result = callInputMethod(adapter, integerInputMethod, "prompt");
// 		assertEquals(2, result);
// 		result = callInputMethod(adapter, decimalInputMethod, "prompt");
// 		assertEquals(3.0, result);
// 		result = callInputMethod(adapter, integerInputMethod, "prompt");
// 		assertEquals(4, result);
// 		result = callInputMethod(adapter, textInputMethod, "prompt");
// 		assertEquals("fifth", result);
// 		result = callInputMethod(adapter, decimalInputMethod, "prompt");
// 		assertEquals(6.0, result);
// 	}
// 
// 	@Test
// 	public void creatingMultipleAdaptersThrowsException() {
// 		getNewAdapterForSystemIn();
// 		assertThrows(IllegalStateException.class, () -> {
// 			getNewAdapterForSystemIn();
// 		});
// 	}
// 
// 	@ParameterizedTest(name = "InputStream nr {0} upprepas")
// 	@ValueSource(ints = { 1, 2, 5, 10 })
// 	public void creatingMultipleAdaptersThrowsException(int i) {
// 		final InputStream[] repeated = { null };
// 		for (int n = 1; n <= i * 3; n++) {
// 			InputStream in = new ByteArrayInputStream("".getBytes());
// 			getNewAdapter(in);
// 			if (n == i)
// 				repeated[0] = in;
// 		}
// 
// 		assertThrows(IllegalStateException.class, () -> {
// 			getNewAdapter(repeated[0]);
// 		});
// 	}

//	private static class RootDirSet {
//
//		private List<File> roots = new ArrayList<>();
//
//		public RootDirSet(String... roots) {
//			for (String path : roots) {
//				addRoot(new File(path));
//			}
//		}
//
//		protected void addRoot(File dir) {
//			if (dir.exists() && dir.isDirectory()) {
//				roots.add(dir);
//			}
//		}
//
//		public List<File> asList() {
//			return Collections.unmodifiableList(roots);
//		}
//
//	}
//
//	private static class IntelliJRootDirSet extends RootDirSet {
//
//		public IntelliJRootDirSet() {
//			addPossibleProductionRoot(new File("out/production"));
//			addPossibleProductionRoot(new File("../out/production")); // Om moduler används
//		}
//
//		private void addPossibleProductionRoot(File production) {
//			if (production.exists()) {
//				for (File dir : production.listFiles()) {
//					addRoot(dir);
//				}
//			}
//		}
//
//	}

}
