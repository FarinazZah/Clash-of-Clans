// I worked on the homework assignment alone, using only course materials.
/**
 * Golem class.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class Golem extends Troop {
    private int weight;

    /**
     * 4 arguement constructor for golem.
     *
     * @param name String
     * @param experienceLevel int
     * @param health int
     * @param weight int
     */
    public Golem(String name, int experienceLevel, int health, int weight) {
        super(name, experienceLevel, health);
        this.weight = weight;
    }

    /**
     * 0 arg constructor.
     */
    public Golem() {
        this("Nelly", 19, 80, 10);
    }

    /**
     * Setter for weight.
     *
     * @param newWeight int
     */
    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    /**
     * getter for weight.
     *
     * @return int
     */
    public int getWeight() {
        return weight;
    }

    /**
     * toString method for golem.
     *
     * @return String type
     */
    public String toString() {
        return super.toString() + String.format(". I am a golem that weighs %d tons", weight);
    }

    /**
     * equals method.
     *
     * @param otherOne object type
     * @return boolean type
     */
    public boolean equals(Object otherOne) {
        if (!(otherOne instanceof Golem)) {
            return false;
        }
        Golem otherGolem = (Golem) otherOne;
        return super.equals(otherOne) && this.weight == otherGolem.weight;
    }

    /**
     * who they are training with.
     *
     * @param trooper of type troop
     */
    public void trainWith(Troop trooper) {
        if (trooper.getHealth() < 15 || trooper.getHealth() == 100 || !(trooper instanceof Golem
                || trooper.getExperienceLevel() == 50) || this.getHealth() < 15 || this.getHealth() == 100
                    || this.getExperienceLevel() == 50) {
            return;
        } else {
            trooper.setExperienceLevel(trooper.getExperienceLevel() + 3);
            trooper.setHealth(trooper.getHealth() - 12);
            this.setExperienceLevel(this.getExperienceLevel() + 3);
            this.setHealth(this.getHealth() - 12);
        }
    }
}
