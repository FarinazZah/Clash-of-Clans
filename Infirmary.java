// I worked on the homework assignment alone, using only course materials.
/**
 * infirmary class.
 *
 * @author farinaz zahiri
 * @version 1.0
 */
public class Infirmary {
    private String infirmaryName;
    private static int numberOfInfirmaries;

    /**
     * getter for number of infirmiries.
     *
     * @return type int
     */
    public static int getNumberOfInfirmaries() {
        return numberOfInfirmaries;
    }

    /**
     * Single arguement constructor for Infirmary.
     *
     * @param infirmaryName type String
     */
    public Infirmary(String infirmaryName) {
        this.infirmaryName = infirmaryName;
        numberOfInfirmaries++;
    }

    // did not do inspectTroop & doTreatment

    /**
     * toString() method for this class.
     *
     * @return type String
     */
    public String toString() {
        return String.format("%s infirmary", infirmaryName);
    }

    /**
     * equals() method for infirmary.
     *
     * @param otherOne of object type
     * @return of boolean
     */
    public boolean equals(Object otherOne) {
        if (!(otherOne instanceof Infirmary)) {
            return false;
        }
        Infirmary otherInfirmary = (Infirmary) otherOne;
        return this.infirmaryName.equals(otherInfirmary.infirmaryName);
    }

    /**
     * inspecting a troop.
     *
     * @param trooper type Troop
     */
    public void inspectTroop(Troop trooper) {
        System.out.println(trooper.toString());
        if (trooper instanceof Barbarian) {
            ((Barbarian) trooper).scream();
        }
    }

    /**
     * performing the treatment.
     *
     * @param trooper implementing treatable
     */
    public void doTreatment(Treatable trooper) {
        if (!trooper.needsTreatment()) {
            System.out.println(String.format("You are fine. You will not receive treatment at %s infirmary",
                    infirmaryName));
        } else {
            trooper.treat();
        }
    }
}
