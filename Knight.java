// I worked on the homework assignment alone, using only course materials.
/**
 * This is the Knight class and it is a subclass of the Hero class.
 *
 * @author farinazzahiri
 * @version 1.0
 */
public class Knight extends Hero {
    /**
     * Constructor that takes in initName, initHealth, and initDamage.
     *
     * @param initName of type String
     * @param initHealth of type int
     * @param initDamage of type int
     */

    public Knight(String initName, int initHealth, int initDamage) {
        super(initName, initHealth, initDamage);
    }

    /**
     * Constructor that takes initName, initHealth, and default value for damage.
     *
     * @param initName of type String
     * @param initHealth of type int
     */

    public Knight(String initName, int initHealth) {
        this(initName, initHealth, 2);
    }

    /**
     * Constructor that takes in initName and default values for health and damage.
     *
     * @param initName of type String
     */

    public Knight(String initName) {
        this(initName, 40);
    }

    /**
     * Method to train entity.
     *
     * @param placeToTrain type TrainingGround
     */

    public void train(TrainingGround placeToTrain) {
        double tm = placeToTrain.getTrainingMultiplier();
        int damageIncrease = (int) (tm * 5);
        increaseDamage(damageIncrease);
    }

    /**
     * Method that checks if a Knight has armor.
     *
     * @return boolean
     */

    public boolean hasArmor() {
        return true; // A knight always wears his armor
    }
    /**
     * Method to return entity description.
     *
     * @return a String
     */

    public String toString() {
        if (isAlive()) {
            return super.toString() + ". I am a knight";
        }
        return super.toString() + ". I was a knight";
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
        Knight otherKnight = (Knight) other;
        if (super.equals(otherKnight)) {
            return true;
        }
        return false;
    }

}
