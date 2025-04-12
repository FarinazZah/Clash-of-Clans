// I worked on the homework assignment alone, using only course materials.
/**
 * This is the Enemy class and it is a subclass of the Entity class.
 *
 * @author farinazzahiri
 * @version 1.0
 */
public class Enemy extends Entity {
    private boolean canPierceArmor;

    /**
     * Constructor that takes in initName, initHealth, initCanPierceArmor.
     *
     * @param initName of type String
     * @param initHealth of type int
     * @param initCanPierceArmor of type boolean
     */

    public Enemy(String initName, int initHealth, boolean initCanPierceArmor) {
        super(initName, initHealth);
        canPierceArmor = initCanPierceArmor;
    }

    /**
     * Constructor with initName and initHealth as parameters and defualt value for initCanPierceArmor.
     *
     * @param initName of type String
     * @param initHealth of type int
     */

    public Enemy(String initName, int initHealth) {
        this(initName, initHealth, false);
    }

    /**
     * Method that returns canPierceArmor.
     *
     * @return of type boolean
     */

    public boolean canPierceArmor() {
        return canPierceArmor;
    }

    /**
     * Method that attacks hero entity.
     *
     * @param heroOpponent of type Hero
     */
    public void attack(Hero heroOpponent) {
        if (isAlive() && (!heroOpponent.hasArmor() || canPierceArmor)) {
            heroOpponent.takeDamage(3);
        } else if (isAlive()) {
            heroOpponent.takeDamage(1);
        }
    }
    /**
     * Method to return entity description.
     *
     * @return a String
     */

    public String toString() {
        if (isAlive() && canPierceArmor) {
            return super.toString() + ". I am an enemy that can pierce armor";
        } else if (isAlive()) {
            return super.toString() + ". I am an enemy that cannot pierce armor";
        }
        return super.toString() + ". I was an enemy";
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
        Enemy otherEnemy = (Enemy) other;
        if (super.equals(otherEnemy)) {
            return true;
        }
        return false;
    }


}
