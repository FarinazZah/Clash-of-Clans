// I worked on the homework assignment alone, using only course materials.
/**
 * This is the Archer class and it is a subclass of the Hero class.
 *
 * @author farinazzahiri
 * @version 1.0
 */
public class Archer extends Hero {
    private boolean hasArmorEquipped;

    /**
     * Constructor that takes in initName, initHealth, initDamage, and initHasArmoEquipped.
     *
     * @param initName of type String
     * @param initHealth of type int
     * @param initDamage of type int
     * @param initHasArmorEquipped of type boolean
     */
    public Archer(String initName, int initHealth, int initDamage, boolean initHasArmorEquipped) {
        super(initName, initHealth, initDamage);
        hasArmorEquipped = initHasArmorEquipped;
    }

    /**
     * Constructor that takes in initName and initHealth.
     *
     * @param initName of type String
     * @param initHealth of type int
     */

    public Archer(String initName, int initHealth) {
        this(initName, initHealth, 4, false);
    }

    /**
     * Constructor that takes in initName.
     *
     * @param initName of type String
     */

    public Archer(String initName) {
        this(initName, 20);
    }

    /**
     * Method to equip armor.
     */

    public void equipArmor() {
        if (isAlive()) {
            hasArmorEquipped = true;
        }
    }

    /**
     * Method to unequip armor.
     */

    public void unequipArmor() {
        if (isAlive()) {
            hasArmorEquipped = false;
        }
    }

    /**
     * Method to train archer.
     *
     * @param placeToTrain type TrainingGround
     */

    public void train(TrainingGround placeToTrain) {
        if (placeToTrain.isOutdoors()) {
            double tm = placeToTrain.getTrainingMultiplier();
            int damageIncrease = (int) (tm * 3);
            increaseDamage(damageIncrease);
        }

    }

    /**
     * Method that returns hasArmorEquipped.
     *
     * @return type boolean
     */

    public boolean hasArmor() {
        return hasArmorEquipped;
    }
    /**
     * Method to return entity description.
     *
     * @return a String
     */

    public String toString() {
        if (isAlive() && hasArmorEquipped) {
            return super.toString() + ". I am an archer with my armor equipped";
        } else if (isAlive() && !hasArmorEquipped) {
            return super.toString() + ". I am an archer with my armor unequipped";
        }
        return super.toString() + ". I was an archer";
    }
    /**
     * Method to check if two objects are equal.
     *
     * @param other object type input
     * @return boolean stating if the objects are equal
     */

    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Archer otherArcher = (Archer) other;
        if (super.equals(otherArcher)) {
            return true;
        }
        return false;
    }
}
