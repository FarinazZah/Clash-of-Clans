// I worked on the homework assignment alone, using only course materials.
/**
 * Archer class.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class Archer extends Troop implements Treatable {
    private String hairColor;

    /**
     * 4 arg constructor for archer.
     *
     * @param name String
     * @param experienceLevel int
     * @param health int
     * @param hairColor String
     */
    public Archer(String name, int experienceLevel, int health, String hairColor) {
        super(name, experienceLevel, health);
        this.hairColor = hairColor;
    }

    /**
     * one arg constructor for archer.
     *
     * @param hairColor String
     */
    public Archer(String hairColor) {
        this("Sally", 10, 15, hairColor);
    }

    /**
     * getter for hair color.
     *
     * @return String
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     * setter for hair color.
     *
     * @param newHairColor String
     */
    public void setHairColor(String newHairColor) {
        hairColor = newHairColor;
    }

    /**
     * train with method for archer.
     *
     * @param trooper of type troop
     */
    public void trainWith(Troop trooper) {
        if (trooper.getHealth() < 5 || trooper.getHealth() == 100
                || !(trooper instanceof Barbarian) && !(trooper instanceof Archer)
                    || trooper.getExperienceLevel() == 50 || this.getExperienceLevel() == 50 || this.getHealth() == 100
                        || this.getHealth() < 5) {
            return;
        }
        if (trooper instanceof Archer) { // If archer is fighting another archer
            // If the archers have different hair colors...
            if (!(this.hairColor.equals(((Archer) trooper).hairColor))) {
                trooper.setExperienceLevel(trooper.getExperienceLevel() + 2);
                this.setExperienceLevel(this.getExperienceLevel() + 2);
                System.out.println("Oof! I prefer training with other archers with the same"
                        + " hair color as me");
            } else { // If they have the same hair color, increase experience level and print
                trooper.setExperienceLevel(trooper.getExperienceLevel() + 4);
                this.setExperienceLevel(this.getExperienceLevel() + 4);
                System.out.println("I like training with other archers with the same hair color as me");
            }
            // Decrease both archers health by 5
            trooper.setHealth(trooper.getHealth() - 5);
            this.setHealth(this.getHealth() - 5);
        } else { // If our archer is fighting a trooper that is a barbarian,
            this.setHealth(this.getHealth() - 10);
            System.out.printf("Gross. Go away %s! I hate training with Barbarians!\n", trooper.getName());
        }
    }

    /**
     * How we treat an archer.
     */
    public void treat() {
        this.setHealth(this.getHealth() + 3);
    }

    /**
     * if an archer needs treatment.
     *
     * @return boolean
     */
    public boolean needsTreatment() {
        return this.getHealth() < 80;
    }

    /**
     * to string method.
     *
     * @return String
     */
    public String toString() {
        return super.toString() + String.format(". I am an archer with %s hair", hairColor);
    }

    /**
     * equals method.
     *
     * @param otherOne object type
     * @return boolean
     */
    public boolean equals(Object otherOne) {
        if (!(otherOne instanceof Archer)) {
            return false;
        }
        Archer otherArcher = (Archer) otherOne;
        return super.equals(otherOne) && this.hairColor.equals(otherArcher.hairColor);
    }


}
