/**
 * @author Lucas Ilstedt luil7872
 */
public class Dog {
    //#region Class Variables
    // Stores the translations for "dachshund" in all languages.
    // Can't be bothered to add in all languages but I have implemented all the relevant code so all that's left is adding more names to the array.
    private static final String[] DACHSHUND_IN_ALL_LANGUAGES = {"dachshund", "tax", "mäyräkoira", "teckel"};
    // Stores the tail length for any dachshund.
    private static final double DACHSHUND_TAIL_LENGTH = 3.7;
    private String name;
    private String breed;
    private int age;
    private int weight;
    private double tailLength;
    //#endregion


    /**
     * Constructor for class Dog.
     * @param dogName Name of dog.
     * @param dogBreed Breed of dog.
     * @param dogAge Age of dog.
     * @param dogWeight Weight of dog.
     */
    public Dog(String dogName, String dogBreed, int dogAge, int dogWeight) {
        name = nameCheck(dogName);
        breed = nameCheck(dogBreed);
        age = dogAge;
        weight = dogWeight;
        setTailLength();
    }


    /**
     * Gets the name of this Dog.
     * @return String with name.
     */
    public String getName() {
        return name;
    }


    /**
     * Gets the breed of this Dog.
     * @return String with breed.
     */
    public String getBreed() {
        return breed;
    }


    /**
     * Gets the age of this Dog.
     * @return Int with age.
     */
    public int getAge() {
        return age;
    }


    /**
     * Gets the weight of this Dog.
     * @return Int with weight.
     */
    public int getWeight() {
        return weight;
    }


    /**
     * Gets the tail length of this Dog.
     * @return Double with tail length.
     */
    public double getTailLength() {
        return tailLength;
    }

    /**
     * Returns string with attributes of this Dog.
     * @return Formatted String with attributes.
     */
    @Override
    public String toString() {
        return String.format("name=%s, breed=%s, age=%s, weight=%s, tailLength=%s", name, breed, age, weight, tailLength);
    }


    /**
     * Sets the tail length of this Dog.
     */
    private void setTailLength() {
        boolean isDachshund = false;
        // Checks if this Dog is a dachshund.
        for (int i = 0; i < DACHSHUND_IN_ALL_LANGUAGES.length; i++) {
            if (nameCheck(DACHSHUND_IN_ALL_LANGUAGES[i]).equals(nameCheck(breed))) {
                isDachshund = true;
            }
        }
        if (!isDachshund) {
            tailLength = age * weight / 10.0;
        } else {
            tailLength = DACHSHUND_TAIL_LENGTH;
        }
    }


    /**
     * Increases the age of this Dog.
     * @param ageToAdd Number of years to add.
     */
    public void increaseAge(int ageToAdd) {
        if (ageToAdd > 0) {
            age += ageToAdd;
            // Updating tail length.
            setTailLength();
        }
    }


    /**
     * Formats a string, making all characters except the first one lower case and removing spaces at beginning and end.
     * @param uneditedString String to format.
     * @return Formatted String.
     */
    private String nameCheck(String uneditedString) { 
        String editedString = uneditedString.toLowerCase();
        editedString = editedString.trim();

        if (editedString.equals("") || editedString.equals(null)) {
            return "";
        }

        editedString = String.valueOf(editedString.charAt(0)).toUpperCase() + editedString.substring(1);
        return editedString;
    }
}
