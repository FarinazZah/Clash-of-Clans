// I worked on the homework assignment alone, using only course materials.

/**
 * This is the abstract parent class for Hero and Enemy subclasses.
 *
 * @author farinazzahiri
 * @version 1.0
 */
public abstract class Entity {
    private String name;
    private int health;

    /**
     * This is a constructor that takes in name and initHealth.
     *
     * @param name name of entity
     * @param initHealth health level of entity
     */
    public Entity(String name, int initHealth) {
        this.name = name;
        if (initHealth < 0) {
            health = 0;
        } else {
            health = initHealth;
        }
    }

    /**
     * Returns name.
     *
     * @return a String
     */
    public String getName() {
        return name;
    }

    /**
     * Returns health.
     *
     * @return an int
     */
    public int getHealth() {
        return health;
    }

    /**
     * Changes/Set the name.
     *
     * @param newName name to set
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Change/Set the health value.
     *
     * @param newHealth health value to be set to
     */
    private void setHealth(int newHealth) {
        if (newHealth < 0) {
            health = 0;
        } else {
            health = newHealth;
        }
    }

    /**
     * Method to check if entity is alive.
     *
     * @return boolean that represents if the entity is alive
     */
    public boolean isAlive() {
        return health != 0; // 1 is alive, 0 is dead
    }

    /**
     * Method for entity to take the damage.
     *
     * @param damage int amount of damage recieved
     */
    public void takeDamage(int damage) {
        setHealth(health - damage);
    }

    /**
     * Method to heal an entity.
     *
     * @param healing int to add to the health of the entity
     */
    public void heal(int healing) {
        if (isAlive() && healing > 0) {
            setHealth(health + healing);
        }
    }

    /**
     * Method to return entity description.
     *
     * @return a String
     */
    public String toString() {
        if (isAlive()) {
            return String.format("I am %s, and I have %d health", name, health);
        } else {
            return String.format("I was %s", name);
        }
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
        Entity otherEntity = (Entity) other;
        if (health == otherEntity.health && name.equals(otherEntity.name)) {
            return true;
        }
        return false;
    }
}
