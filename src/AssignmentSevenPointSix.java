import java.util.ArrayList;
import java.util.Collections;

/**
 * AssignmentSevenPointSix on iLearn PROG1.
 * @author Lucas Ilstedt, luil7872
 */
public class AssignmentSevenPointSix {
    //#region Instance Variables
    @UnderTest(id="dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    //#endregion

    @UnderTest(id="U7.6.4")
    public int selectionSort() {
        int counter = 0;
        for (int i = 0; i < dogs.size() - 1; i++) {
            if (collectionsSwapTwoDogs(i, findRemainingSmallestDog(i))) {
                counter++;
            }
        }

        return counter;
    }
    
    @UnderTest(id="U7.6.1.1")
    private boolean exchangePlacesTwoDogs(int indexDog1, int indexDog2) {
        if (indexDog1 != indexDog2) {
            Dog dog1Remember = dogs.get(indexDog1);
        
            dogs.set(indexDog1, dogs.get(indexDog2));
            dogs.set(indexDog2, dog1Remember);

            // Indicates if swap happened.
            // This because swap should not happen and be counted by selectionSort() if it just swaps a dog for itself.
            return true;
        }

        return false;
    }

    @UnderTest(id="U7.6.1.2")
    private boolean collectionsSwapTwoDogs(int indexDog1, int indexDog2) {
        if (indexDog1 != indexDog2) {
            Collections.swap(dogs, indexDog1, indexDog2);
            
            // Indicates if swap happened.
            // This because swap should not happen and be counted by selectionSort() if it just swaps a dog for itself.
            return true;
        }

        return false;
    }

    @UnderTest(id="U7.6.2")
    private int compareTwoDogs(Dog dog1, Dog dog2) {
        int indexOfEarlierDog = compareBySize(dog1, dog2);
        if (indexOfEarlierDog == -1) {
            indexOfEarlierDog = compareByName(dog1, dog2);
        }

        return indexOfEarlierDog;
    }

    private int compareBySize(Dog dog1, Dog dog2) {
        if (dog1.getTailLength() < dog2.getTailLength()) {
            return dogs.indexOf(dog1);
        } else if (dog2.getTailLength() < dog1.getTailLength()) {
            return dogs.indexOf(dog2);
        } else {
            return -1;
        }
    }

    private int compareByName(Dog dog1, Dog dog2) {
        for (int i = 0; i < dog1.getName().length(); i++) {
            if (dog1.getName().charAt(i) < dog2.getName().charAt(i)) {
                return dogs.indexOf(dog1);
            } else if (dog1.getName().charAt(i) > dog2.getName().charAt(i)) {
                return dogs.indexOf(dog2);
            }
        }

        // Dogs have same name or dog1 name is shorter than dog2.
        // Both result in dog1 being chosen as the one with earlier name.
        return dogs.indexOf(dog1);
    }

    @UnderTest(id="U7.6.3")
    private int findRemainingSmallestDog(int indexToStartAt) {
        int indexOfSmallestDog = -1;
        Dog smallestDog = dogs.get(indexToStartAt);

        for (int i = indexToStartAt + 1; i < dogs.size(); i++) {
            indexOfSmallestDog = compareTwoDogs(smallestDog, dogs.get(i));
            smallestDog = dogs.get(indexOfSmallestDog);
        }

        return indexOfSmallestDog;
    }
}
