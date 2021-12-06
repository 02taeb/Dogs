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

    /**
     * Runs a selection sort algorithm on local ArrayList<Dog>.
     * @return int Number of swaps.
     */
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
    
    /**
     * Switches place of two dogs in local ArrayList<Dog>. Will not swap if index is the same.
     * @param indexFirstDog Index of first dog.
     * @param indexSecondDog Index of second dog.
     * @return boolean true if swap happened. Else false if swap did not happen.
     */
    @UnderTest(id="U7.6.1.1")
    private boolean exchangePlacesTwoDogs(int indexFirstDog, int indexSecondDog) {
        if (indexFirstDog != indexSecondDog) {
            Dog firstDogRemember = dogs.get(indexFirstDog);
        
            dogs.set(indexFirstDog, dogs.get(indexSecondDog));
            dogs.set(indexSecondDog, firstDogRemember);

            // Indicates if swap happened.
            // This because swap should not happen and be counted by selectionSort() if it just swaps a dog for itself.
            return true;
        }

        return false;
    }

    /**
     * Switches place of two dogs in local ArrayList<Dog> using Collections.swap(List<>, int, int). Will not swap if index is the same.
     * @param indexFirstDog Index of first dog.
     * @param indexSecondDog Index of second dog.
     * @return boolean true if swap happened. Else false if swap did not happen.
     */
    @UnderTest(id="U7.6.1.2")
    private boolean collectionsSwapTwoDogs(int indexFirstDog, int indexSecondDog) {
        if (indexFirstDog != indexSecondDog) {
            Collections.swap(dogs, indexFirstDog, indexSecondDog);
            
            // Indicates if swap happened.
            // This because swap should not happen and be counted by selectionSort() if it just swaps a dog for itself.
            return true;
        }

        return false;
    }

    /**
     * Compare two dogs according to tail length and returns index of dog with smallest tail length in local ArrayList<Dog>.
     * If dogs have same tail length will instead compare names and return the earliest alphabetically.
     * Uses local compareBySize(firstDog, secondDog) and compareByName(firstDog, secondDog)
     * @param firstDog First Dog to compare.
     * @param secondDog Second Dog to compare.
     * @return int index of "smallest" dog.
     */
    @UnderTest(id="U7.6.2")
    private int compareTwoDogs(Dog firstDog, Dog secondDog) {
        int indexOfEarlierDog = compareBySize(firstDog, secondDog);
        if (indexOfEarlierDog == -1) {
            indexOfEarlierDog = compareByName(firstDog, secondDog);
        }

        return indexOfEarlierDog;
    }

    /**
     * Compares two dogs according to tail length.
     * @param firstDog First Dog to compare.
     * @param secondDog Second Dog to compare.
     * @return int index of dog with smaller tail in local ArrayList<Dog> or -1 if same tail length.
     */
    private int compareBySize(Dog firstDog, Dog secondDog) {
        if (firstDog.getTailLength() < secondDog.getTailLength()) {
            return dogs.indexOf(firstDog);
        } else if (secondDog.getTailLength() < firstDog.getTailLength()) {
            return dogs.indexOf(secondDog);
        } else {
            return -1;
        }
    }

    /**
     * Compares two dogs according to name.
     * @param firstDog First Dog to compare.
     * @param secondDog Second Dog to compare.
     * @return int index of dog with earlier name alphabetically. Will return index of firstDog if dogs have same name.
     */
    private int compareByName(Dog firstDog, Dog secondDog) {
        for (int i = 0; i < firstDog.getName().length(); i++) {
            if (firstDog.getName().charAt(i) < secondDog.getName().charAt(i)) {
                return dogs.indexOf(firstDog);
            } else if (firstDog.getName().charAt(i) > secondDog.getName().charAt(i)) {
                return dogs.indexOf(secondDog);
            }
        }

        // Dogs have same name or firstDog name is shorter than secondDog with same characters.
        // Both result in firstDog being chosen as the one with earlier name.
        return dogs.indexOf(firstDog);
    }

    /**
     * Finds the remaining smallest Dog in local ArrayList<Dog>.
     * @param indexToStartAt Index to start searching in ArrayList<Dog> from, 0 to search entire ArrayList<Dog>.
     * @return int index of "smallest" Dog.
     */
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
