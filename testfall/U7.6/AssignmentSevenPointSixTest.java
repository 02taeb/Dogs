/*
 * Denna klass ingår i alla testfallen till U7.6 olika delar.
 * Den innehåller gemensamma delar så att dessa inte behöver
 * upprepas i varje testklass.
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;


public abstract class AssignmentSevenPointSixTest extends FunctionBaseTest {

// 	static final Dog BAMSE = new Dog("Bamse", "Vinthund", 3, 7);
// 	static final Dog RONJA = new Dog("Ronja", "Dachshund", 9, 15);
// 	static final Dog MOLLY = new Dog("Molly", "Cocker spaniel", 19, 3);
// 	static final Dog LUDDE = new Dog("Ludde", "Golden retriever", 1, 4);
// 	static final Dog FIDO = new Dog("Fido", "Labrador", 6, 16);
// 	static final Dog BELLA = new Dog("Bella", "Boxer", 15, 18);
// 	static final Dog LASSIE = new Dog("Lassie", "Dachshund", 1, 4);
// 	static final Dog KARO = new Dog("Karo", "Yorkshireterrier", 5, 7);
// 	static final Dog CHARLIE = new Dog("Charlie", "Dachshund", 14, 20);
// 	static final Dog DORIS = new Dog("Doris", "Golden retriever", 19, 3);
// 
// 	static final Dog[] ORIGINAL_ORDER_OF_PREPARED_DOGS = { //
// 			BAMSE, RONJA, MOLLY, LUDDE, FIDO, BELLA, LASSIE, KARO, CHARLIE, DORIS };
// 	static final Dog[] SORTED_ORDER_OF_PREPARED_DOGS = { //
// 			LUDDE, BAMSE, KARO, CHARLIE, LASSIE, RONJA, DORIS, MOLLY, FIDO, BELLA };
// 
// 	/**
// 	 * sut = Software Under Test, en standardförkortning inom testning.
// 	 */
// 	protected final AssignmentSevenPointSix sut;
// 	protected final List<Dog> dogs;
// 
// 	protected AssignmentSevenPointSixTest(String id) {
// 		super(AssignmentSevenPointSix.class, id);
// 		this.sut = new AssignmentSevenPointSix();
// 		this.dogs = accessDogList(sut);
// 	}
// 
// 	// Används inte i testerna, men kan vara nyttig vid debugging.
// 	// Glöm inte att plocka bort anrop till den innan du skickar
// 	// in i ilearn bara.
// 	protected void printDogs() {
// 		for (int n = 0; n < dogs.size(); n++) {
// 			System.err.printf("%2d: %-7s %5.1f%n", n, dogs.get(n).getName(), dogs.get(n).getTailLength());
// 		}
// 	}
// 
// 	protected void addDog(Dog d) {
// 		dogs.add(d);
// 	}
// 
// 	protected void addDog(String name, String breed, int age, int weight) {
// 		addDog(new Dog(name, breed, age, weight));
// 	}
// 
// 	protected void addDogs(Dog... newDogs) {
// 		dogs.addAll(Arrays.asList(newDogs));
// 	}
// 
// 	protected void addAllPreparedDogs() {
// 		addDogs(ORIGINAL_ORDER_OF_PREPARED_DOGS);
// 	}
// 
// 	protected void assertDogsAre(String msg, Dog... expected) {
// 		assertEquals(Arrays.asList(expected), dogs, msg);
// 	}

}
