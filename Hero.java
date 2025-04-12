// I worked on the homework assignment alone, using only course materials.
/**
 * This is the abstract subclass Hero, of parent class entity.
 *
 * @author farinazzahiri
 * @version 1.0
 */
public abstract class Hero extends Entity {
    private int damage;

    /**
     * Constructor that takes in initName, initHealth, and initDamage.
     *
     * @param initName of type String
     * @param initHealth of type int
     * @param initDamage of type int
     */

    public Hero(String initName, int initHealth, int initDamage) {
        super(initName, initHealth);
        if (initDamage < 0) {
            damage = 0;
        } else {
            damage = initDamage;
        }
    }

    /**
     * Constructor that takes in initName and initHealth with a default value for initDamage.
     *
     * @param initName of type String
     * @param initHealth of type int
     */

    public Hero(String initName, int initHealth) {
        this(initName, initHealth, 1);
    }

    /**
     * Returns damage value.
     *
     * @return type int
     */

    public int getDamage() {
        return damage;
    }

    /**
     * Protected Method that increases damage.
     *
     * @param moreDamage of type int
     */

    protected void increaseDamage(int moreDamage) {
        if (isAlive()) {
            damage += moreDamage;
        }
    }

    /**
     * Abstract method that has heros train.
     *
     * @param placeToTrain type TrainingGround
     */

    public abstract void train(TrainingGround placeToTrain); // Undefined abstract method

    /**
     * Abstract method that determines if the Hero has armor.
     *
     * @return type boolean
     */

    public abstract boolean hasArmor();


    /**
     * Method that attacks the Enemy entity.
     *
     * @param enemyOpponent of type enemy
     */

    public void attack(Enemy enemyOpponent) {
        if (isAlive()) {
            enemyOpponent.takeDamage(damage);
        }
    }
    /**
     * Method to return entity description.
     *
     * @return a String
     */

    public String toString() {
        if (isAlive()) {
            return super.toString() + ". I deal " + damage + " damage";
        }
        return super.toString();
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
        Hero otherHero = (Hero) other;
        if (super.equals(otherHero) && damage == otherHero.damage) {
            return true;
        }
        return false;
    }
}
