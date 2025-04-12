// I worked on the homework assignment alone, using only course materials.
/**
 * Troop class.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public abstract class Troop {
    private String name;
    private int experienceLevel;
    private int health;

    /**
     * 4 arg constructor for Troop class.
     *
     * @param newName String
     * @param newExpLvl int
     * @param newHealth int
     */
    public Troop(String newName, int newExpLvl, int newHealth) {
        name = newName;
        setExperienceLevel(newExpLvl);
        setHealth(newHealth);
    }

    /**
     * abstract training method.
     *
     * @param p of type troop
     */
    public abstract void trainWith(Troop p);

    /**
     * toString() method for Troop class.
     *
     * @return a string
     */
    public String toString() {
        return String.format("My name is %s, my experience level is %d, "
                + "and my health is %d", name, experienceLevel, health);
    }

    /**
     * equals method for this class.
     *
     * @param otherOne object type
     * @return a boolean
     */
    public boolean equals(Object otherOne) {
        if (!(otherOne instanceof Troop)) {
            return false;
        }
        Troop otherTroop = (Troop) otherOne;
        return this.name.equals(otherTroop.name) && this.health == otherTroop.health
                && this.experienceLevel == otherTroop.experienceLevel;
    }

    /**
     * setting the experience level.
     *
     * @param newExpLvl int
     */
    public void setExperienceLevel(int newExpLvl) {
        if (newExpLvl < 1) {
            experienceLevel = 1;
        } else if (newExpLvl > 50) {
            experienceLevel = 50;
        } else {
            experienceLevel = newExpLvl;
        }
    }

    /**
     * getter for experience level.
     *
     * @return int
     */
    public int getExperienceLevel() {
        return experienceLevel;
    }

    /**
     * setter for health.
     *
     * @param newHealth type int
     */
    public void setHealth(int newHealth) {
        if (newHealth < 1) {
            health = 1;
        } else if (newHealth > 100) {
            health = 100;
        } else {
            health = newHealth;
        }
    }

    /**
     * getter for health.
     *
     * @return an int
     */
    public int getHealth() {
        return health;
    }

    /**
     * setter for name.
     *
     * @param newName of type String
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * getter for name.
     *
     * @return String
     */
    public String getName() {
        return name;
    }

}
