
/*
 * Klassen i denna fil innehåller funktionalitet
 * som är gemensam för många av testen, till exempel 
 * funktionalitet för att hitta klassen eller metoden
 * som ska testas. För att dessa test ska fungera måste
 * denna fil finnas i samma katalog.
 */

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.lang.reflect.*;

import org.junit.jupiter.api.Test;

public abstract class BaseTest extends CUTTest {

	/*
	 * Denna konstruktor är nödvändig för testkompilering av filerna som läggs upp i
	 * ilearn där allt är utkommenterat. Den ska inte användas!
	 */
	protected BaseTest() {
		throw new IllegalStateException("No cut set");
	}

	public BaseTest(Class<?> cut) {
		super(cut);
	}

	public BaseTest(Class<?> cut, String mutId) {
		super(cut, mutId);
	}

	// TODO: sortera metoderna i denna klass i mer logiska grupper

	protected void setIn(String input) {
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}


	/**
	 * Kontrollerara att ett fält av en viss typ och ett visst värde finns hos
	 * objektet.
	 * 
	 * @param obj      Objektet som ska ha fältet.
	 * @param type     Den förväntade typen.
	 * @param expected Det förväntade värdet.
	 */
	protected void assertHasFieldSetTo(Object obj, Class<?> type, Object expected) {
		for (Field f : obj.getClass().getDeclaredFields()) {
			if (f.getType() == type) {
				f.setAccessible(true);
				Object actual = accessFieldUnderTest(obj, f);
				if (actual == expected)
					return; // Done, field found
			}
		}

		fail(String.format("Kunde inte hitta ett fält i %s med typen %s och värdet %s", obj, type, expected));
	}

	protected void assertDoesNotHasFieldSetTo(Object obj, Class<?> type, Object unexpected) {
		for (Field f : obj.getClass().getDeclaredFields()) {
			if (f.getType() == type) {
				f.setAccessible(true);
				Object actual = accessFieldUnderTest(obj, f);
				if (actual == unexpected)
					fail(String.format("Hittade ett fält i %s med typen %s och värdet %s som inte borde finnas", obj,
							type, unexpected));
			}
		}
		// Klara, inget att göra här
	}

	private void checkProtectionLevel(Member[] members, boolean publicOk) {
		for (Member m : members) {
			if (publicOk) {
				assertTrue(isPublic(m) || isPrivate(m), String
						.format("%s har fel skyddsnivå. Enbart public och private är tillåtna enligt uppgiften.", m));
			} else {
				assertTrue(isPrivate(m),
						String.format("%s har fel skyddsnivå. Enbart private är tillåtet enligt uppgiften.", m));
			}
		}
	}

	protected void assertEqualsIgnoreCase(String expected, String actual, String msg) {
		assertEquals(expected.toLowerCase(), actual.toLowerCase(),
				String.format(msg + ",var \"%s\", men borde varit \"%s\" (utan hänsyn till stora och små bokstäver)",
						actual, expected));
	}

	protected void assertContains(Iterable<?> collection, Object target, String msg) {
		for (Object o : collection) {
			if (o == target)
				return; // Klart, inget att göra här
		}

		fail(msg + ", kunde inte hitta det förväntade värdet " + target + " i " + collection);
	}

	protected void assertDoesNotContains(Iterable<?> collection, Object target, String msg) {
		for (Object o : collection) {
			if (o == target)
				fail(msg + ", hittade " + target + " som inte borde finnas i " + collection);
		}
		// Klart, inget att göra här
	}

	@Test
	public void protectionLevelSetOnClass() {
		assertTrue(Modifier.isPublic(cut.getModifiers()),
				"Klassen " + cut.getName() + " är inte publik, detta kan leda till problem med andra test");
	}

	@Test
	public void protectionLevelSetOnAllConstructors() {
		checkProtectionLevel(cut.getDeclaredConstructors(), true);
	}

	@Test
	public void protectionLevelSetOnAllMethods() {
		checkProtectionLevel(cut.getDeclaredMethods(), true);
	}

	@Test
	public void protectionLevelSetOnAllVariables() {
		checkProtectionLevel(cut.getDeclaredFields(), false);
	}
}
