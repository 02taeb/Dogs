
import java.lang.reflect.*;
import java.util.List;


public abstract class CUTTest {

	protected static final String DOGS_FIELD_ID = "dogs";
	protected static final String OWNERS_FIELD_ID = "owners";

	/**
	 * cut = class under test
	 */
	protected final Class<?> cut;
	/**
	 * mut = method under test
	 */
	protected final Method mut;

	public CUTTest() {
		this(null, null);
	}

	public CUTTest(Class<?> cut) {
		this(cut, null);
	}

	public CUTTest(Class<?> cut, String mutId) {
		this.cut = cut;
		this.mut = mutId == null ? null : locateMethodUnderTest(cut, mutId);
	}

	protected final static boolean isPublic(Member m) {
		return Modifier.isPublic(m.getModifiers());
	}

	protected final static boolean isPrivate(Member m) {
		return Modifier.isPrivate(m.getModifiers());
	}

	protected final static boolean isStatic(Member m) {
		return Modifier.isStatic(m.getModifiers());
	}

	protected final static boolean isFinal(Member m) {
		return Modifier.isFinal(m.getModifiers());
	}

	protected final static boolean isConstant(Field f) {
		return isStatic(f) && isFinal(f) && f.getName().equals(f.getName().toUpperCase());
	}

	protected final static boolean isConstant(Field f, Class<?>... okTypes) {
		boolean okType = false;
		for (Class<?> type : okTypes) {
			okType = okType || f.getType() == type;
		}
		return okType && isConstant(f);
	}

	protected final static boolean hasUnderTestAnnotation(Class<?> c, String id) {
		var annotation = c.getAnnotation(UnderTest.class);
		return annotation != null && annotation.id().equalsIgnoreCase(id);
	}

	protected final static boolean hasUnderTestAnnotation(Field f, String id) {
		var annotation = f.getAnnotation(UnderTest.class);
		return annotation != null && annotation.id().equalsIgnoreCase(id);
	}

	protected final static boolean hasUnderTestAnnotation(Method m, String id) {
		var annotation = m.getAnnotation(UnderTest.class);
		return annotation != null && annotation.id().equalsIgnoreCase(id);
	}

	protected final static Field locateFieldUnderTest(Class<?> c, String id) {
		for (Field f : c.getDeclaredFields()) {
			if (hasUnderTestAnnotation(f, id)) {
				// Det ??r normalt en d??lig id?? att g??ra saker synligt bara
				// f??r testning, men n??dv??ndigt h??r eftersom vi vill att
				// ni v??njer er vid h??ga skyddsniv??er.
				f.setAccessible(true);
				return f;
			}
		}

		throw new RuntimeException(String.format(
				"Kunde inte hitta n??got f??lt i klassen %s med m??rkningen @UnderTest(id=\"%s\")", c.getName(), id));
	}

	protected final Field locateOnlyFieldOfType(Class<?> c, Class<?> type) {
		Field found = null;
		for (Field f : c.getDeclaredFields()) {
			if (f.getType() == type) {
				if (found == null) {
					found = f;
				} else {
					throw new RuntimeException(String.format("Hittade flera f??lt med typen %s i klassen %s", type, c));
				}
			}
		}

		if (found == null)
			throw new RuntimeException(String.format("Hittade inget f??lt av typen %s i klassen %s", type, c));

		found.setAccessible(true);
		return found;
	}

	protected final Object accessOnlyFieldOfType(Object obj, Class<?> type) {
		Field f = locateOnlyFieldOfType(obj.getClass(), type);
		return accessFieldUnderTest(obj, f);
	}

	protected final Field locateFieldUnderTest(String id) {
		return locateFieldUnderTest(cut, id);
	}

	protected final Field locateOnlyFieldOfType(Class<?> type) {
		return locateOnlyFieldOfType(cut, type);
	}

	protected final static Method locateMethodUnderTest(Class<?> c, String id) {
		for (Method m : c.getDeclaredMethods()) {
			if (hasUnderTestAnnotation(m, id)) {
				// Det ??r normalt en d??lig id?? att g??ra saker synligt bara
				// f??r testning, men n??dv??ndigt h??r eftersom vi vill att
				// ni v??njer er vid h??ga skyddsniv??er.
				m.setAccessible(true);
				return m;
			}
		}

		throw new RuntimeException(String.format(
				"Kunde inte hitta n??gon metod i klassen %s med m??rkningen @UnderTest(id=\"%s\")", c.getName(), id));
	}

	protected final Method locateMethodUnderTest(String id) {
		return locateMethodUnderTest(cut, id);
	}

	protected final Object accessFieldUnderTest(Object obj, Field f) {
		try {
			return f.get(obj);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(String.format("Fel vid access av dataf??ltet %s", f.getName()), e);
		}
	}

	@SuppressWarnings("unchecked")
	protected final List<Dog> accessDogList(Object obj) {
		return (List<Dog>) accessFieldUnderTest(obj, DOGS_FIELD_ID);
	}

	protected final Object accessFieldUnderTest(Object obj, String id) {
		Field f = locateFieldUnderTest(id);
		return accessFieldUnderTest(obj, f);
	}

	protected final Object callMethod(Object obj, Method m, Object... args) {
		try {
			return m.invoke(obj, args);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			Throwable cause = e.getCause() == null ? e : e.getCause();
			throw new RuntimeException(String.format("Fel vid anrop p?? metoden %s: %s", m.getName(), cause), e);
		}
	}

	protected final Object callMethodById(Object obj, String id, Object... args) {
		Method m = locateMethodUnderTest(obj.getClass(), id);
		return callMethod(obj, m, args);
	}

	protected final Object callMethodUnderTest(Object obj, Object... args) {
		return callMethod(obj, mut, args);
	}

}
