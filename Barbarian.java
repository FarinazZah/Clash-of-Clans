// I worked on the homework assignment alone, using only course materials.
/**
 * Barbarian class.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class Barbarian extends Troop implements Treatable {
    private final boolean isElite;

    /**
     * constructor for barb.
     *
     * @param name String
     * @param experienceLevel int
     * @param health int
     * @param isElite boolean
     */
    public Barbarian(String name, int experienceLevel, int health, boolean isElite) {
        super(name, experienceLevel, health);
        this.isElite = isElite;
    }
    /**
    * one arg constructor.
    *
    * @param isElite boolean
    */

    public Barbarian(boolean isElite) {
        this("Buzz", 1, 25, isElite);
    }

    /**
     * getter for is elite.
     *
     * @return boolean
     */
    public boolean isElite() {
        return isElite;
    }

    /**
     * train with method for barbarian.
     *
     * @param trooper of type troop
     */
    public void trainWith(Troop trooper) {
        if (trooper.getHealth() < 10 || trooper.getHealth() == 100
                || !(trooper instanceof Barbarian) && !(trooper instanceof Archer)
                    || trooper.getExperienceLevel() == 50 || this.getExperienceLevel() == 50 || this.getHealth() < 10
                        || this.getHealth() == 100) {
            return;
        }
        if (!(trooper instanceof Archer)) {
            int ourOldHealth = this.getHealth();
            trooper.setHealth((int) (trooper.getHealth() - this.getExperienceLevel() * .1));
            this.setHealth((int) (this.getHealth() - trooper.getExperienceLevel() * .1));
            System.out.printf("AAAARGH! I just trained with a level %d barbarian, "
                            + "and my health went from %d to %d\n", trooper.getExperienceLevel(),
                                ourOldHealth, this.getHealth());
            if (this.isElite || ((Barbarian) trooper).isElite) {
                this.setExperienceLevel(this.getExperienceLevel() + 8);
                trooper.setExperienceLevel(trooper.getExperienceLevel() + 8);
            } else {
                this.setExperienceLevel(this.getExperienceLevel() + 5);
                trooper.setExperienceLevel(trooper.getExperienceLevel() + 5);
            }
        } else {
            if (((Archer) trooper).getHairColor().equals("purple")) {
                int ourOldHealth = this.getHealth();
                this.setHealth(this.getHealth() + 10);
                System.out.printf("YAAARG. My health increased from %d to %d\n",
                        ourOldHealth, this.getHealth());
                this.setExperienceLevel(this.getExperienceLevel() + 1);
                trooper.setExperienceLevel(trooper.getExperienceLevel() + 1);
            } else {
                this.setHealth(this.getHealth() - 15);
                System.out.println("AAAARGH! I hate that color!");
            }
        }
    }

    /**
     * treat method.
     */
    public void treat() {
        this.setHealth(this.getHealth() + 5);
    }

    /**
     * needs treatment.
     *
     * @return boolean
     */
    public boolean needsTreatment() {
        return this.getHealth() != 100;
    }

    /**
     * makes barb scream.
     */
    public void scream() {
        System.out.println("AAAARGH!");
    }

    /**
     * barbs to string method.
     *
     * @return String
     */
    public String toString() {
        if (this.isElite) {
            return super.toString() + ". I am an elite barbarian";
        } else {
            return super.toString() + ". I am a regular barbarian";
        }
    }

    /**
     * equals method.
     *
     * @param otherOne object type
     * @return boolean
     */
    public boolean equals(Object otherOne) {
        if (!(otherOne instanceof Barbarian)) {
            return false;
        }
        Barbarian otherBarb = (Barbarian) otherOne;
        return super.equals(otherOne) && this.isElite == otherBarb.isElite;
    }

}
