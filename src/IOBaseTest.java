
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;

public abstract class IOBaseTest extends BaseTest {

	private ByteArrayOutputStream out = new ByteArrayOutputStream();

	/*
	 * Denna konstruktor är nödvändig för testkompilering
	 * av filerna som läggs upp i ilearn där allt är 
	 * utkommenterat. Den ska inte användas!
	 */
	public IOBaseTest(){
		super();
	}

	public IOBaseTest(Class<?> cut) {
		super(cut);
	}

	public IOBaseTest(Class<?> cut, String mutId) {
		super(cut, mutId);
	}

	protected void setIn(String format, Object... args) {
		setIn(String.format(format, args));
	}

	@BeforeEach
	public void setOutput() {
		System.setOut(new PrintStream(out));
	}

	protected String getOut() {
		return out.toString();
	}

	protected void assertOutIs(String expected) {
		assertEquals(expected, getOut(), "Fel text på System.out");
	}

	protected void assertOutIsIgnoreCase(String expected) {
		assertEqualsIgnoreCase(expected, getOut(), "Fel text på System.out");
	}

	protected void assertOutContain(String expected) {
		assertTrue(getOut().contains(expected), //
				String.format("Fel text på System.out, \"%s\" innehåller inte \"%s\"", getOut(), expected));
	}

	protected void assertOutDoesNotContain(String expected) {
		assertFalse(getOut().contains(expected), //
				String.format("Fel text på System.out, \"%s\" innehåller \"%s\" som inte borde finnas", getOut(), expected));
	}

	protected void assertOutContainIgnoreCase(String expected) {
		assertTrue(getOut().toLowerCase().contains(expected.toLowerCase()),
				String.format("Fel text på System.out, \"%s\" innehåller inte \"%s\"", getOut(), expected));
	}

	protected void assertOutDoesNotContainIgnoreCase(String expected) {
		assertFalse(getOut().toLowerCase().contains(expected.toLowerCase()),
				String.format("Fel text på System.out, \"%s\" innehåller \"%s\" som inte borde finnas", getOut(), expected));
	}

	protected void assertOutContainErrorMessage() {
		String s = getOut().toLowerCase();
		boolean swedishError = s.contains("fel");
		boolean englishError = s.contains("error");
		assertTrue(swedishError || englishError, String.format("%s innehåller inget markerat felmeddelande", s));
	}

	protected void assertOutDoesNotContainErrorMessage() {
		String s = getOut().toLowerCase();
		boolean swedishError = s.contains("fel");
		boolean englishError = s.contains("error");
		assertFalse(swedishError || englishError, String.format("%s innehåller ett markerat felmeddelande", s));
	}
}
