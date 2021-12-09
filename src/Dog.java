/**
 * Dog class on iLearn PROG1.
 * 
 * @author Lucas Ilstedt, luil7872
 */
public class Dog {
    // #region Class Variables
    // Stores the translations for "dachshund" in all languages.
    private static final String[] DACHSHUND_IN_ALL_LANGUAGES = { "dachshund", "tax", "mäyräkoira", "teckel" };
    // Stores the tail length for any dachshund.
    private static final double DACHSHUND_TAIL_LENGTH = 3.7;
    // #endregion
    // #region Instance Variables
    private String name;
    private String breed;
    private int age;
    private int weight;
    private double tailLength;
    private boolean isOwned;
    private Owner owner;
    // #endregion

    /**
     * Constructor for class Dog.
     * 
     * @param dogName   Name of dog.
     * @param dogBreed  Breed of dog.
     * @param dogAge    Age of dog.
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
     * 
     * @return String with name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the breed of this Dog.
     * 
     * @return String with breed.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Gets the age of this Dog.
     * 
     * @return Int with age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the weight of this Dog.
     * 
     * @return Int with weight.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets the tail length of this Dog.
     * 
     * @return Double with tail length.
     */
    public double getTailLength() {
        return tailLength;
    }

    /**
     * Gets whether this Dog is owned or not.
     * 
     * @return boolean, true if owned, false if not.
     */
    public boolean isOwned() {
        return isOwned;
    }

    /**
     * Gets the owner for this Dog.
     * 
     * @return Owner if owned, Owner with name "This dog not owned" if not owned.
     *         Cannot return null since that will throw a NullPointerException when
     *         calling Owner.getName() from this.
     */
    public Owner getOwner() {
        Owner noOwner = new Owner(String.format("%s ägs inte av någon.", name));
        if (isOwned) {
            return owner;
        } else {
            return noOwner;
        }
    }

    /**
     * Returns string with attributes of this Dog and Owner if owned.
     * 
     * @return Formatted String with attributes.
     */
    @Override
    public String toString() {
        if (isOwned) {
            return String.format("%s, (%s, %s år, %s kilo, %s cm svans) ägd av %s.", name, breed, age, weight, tailLength, owner.toString());
        } else {
            return String.format("%s, (%s, %s år, %s kilo, %s cm svans).", name, breed, age, weight, tailLength);
        }
    }

    /**
     * Increases the age of this Dog.
     * 
     * @param ageToAdd Number of years to add.
     */
    public void increaseAge(int ageToAdd) {
        if (ageToAdd > 0) {
            age += ageToAdd;
            setTailLength();
        }
    }

    /**
     * Sets the tail length of this Dog.
     */
    private void setTailLength() {
        boolean isDachshund = false;
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
     * Sets the owner for this Dog.
     * 
     * @param owner Owner to set.
     * @return boolean, true if set, false if already owned.
     */
    @UnderTest(id = "U8.3")
    public boolean setOwner(Owner owner) {
        if (!isOwned) {
            this.owner = owner;
            owner.addDogToOwner(this);
            isOwned = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes the owner of this Dog.
     * 
     * @return boolean true if owner removed, false if dog already had no owner.
     */
    @UnderTest(id = "U8.6")
    public boolean removeOwner() {
        if (isOwned) {
            isOwned = false;
            owner.removeDogFromOwner(this);
            owner = null;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Formats a string, making all characters except the first one lower case and
     * removing spaces at beginning and end.
     * 
     * @param uneditedString String to format.
     * @return Formatted String.
     */
    private String nameCheck(String uneditedString) {
        String editedString = uneditedString.toLowerCase();
        editedString = editedString.trim();

        if (editedString.equalsIgnoreCase("") || editedString.equalsIgnoreCase(null)) {
            return "";
        }

        editedString = String.valueOf(editedString.charAt(0)).toUpperCase() + editedString.substring(1);
        return editedString;
    }
}
