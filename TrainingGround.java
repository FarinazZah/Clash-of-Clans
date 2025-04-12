// I worked on the homework assignment alone, using only course materials.
/**
 * This is the concrete class for TrainingGround.
 *
 * @author farinazzahiri
 * @version 1.0
 */
public class TrainingGround {
    private String name;
    private double trainingMultiplier;
    private boolean isOutdoors;

    /**
     * This is a constructor that takes in name, initTrainingMultiplier, and isOutdoors.
     *
     * @param name String type input
     * @param initTrainingMultiplier double type input
     * @param isOutdoors boolean type input
     */

    public TrainingGround(String name, double initTrainingMultiplier, boolean isOutdoors) {
        this.name = name;
        this.isOutdoors = isOutdoors;
        if (initTrainingMultiplier < 0) {
            trainingMultiplier = 0;
        } else {
            trainingMultiplier = initTrainingMultiplier;
        }
    }

    /**
     * This is a constructor that has one input arguement and two default values.
     *
     * @param name String input
     */

    public TrainingGround(String name) {
        this(name, 1, false);
    }

    /**
     * Returns the training multiplier.
     *
     * @return type is double
     */

    public double getTrainingMultiplier() {
        return trainingMultiplier;
    }

    /**
     * Returns the name of the entity.
     *
     * @return type String
     */

    public String getName() {
        return name;
    }

    /**
     * Returns if the training ground is outdoors.
     *
     * @return boolean type
     */

    public boolean isOutdoors() {
        return isOutdoors;
    }

    /**
     * Change/Set the value of training multiplier.
     *
     * @param newTrainingMultiplier of type double
     */

    public void setTrainingMultiplier(double newTrainingMultiplier) {
        if (trainingMultiplier < 0) {
            trainingMultiplier = 0;
        } else {
            trainingMultiplier = newTrainingMultiplier;
        }
    }
    /**
     * Method to return entity description.
     *
     * @return a String
     */

    public String toString() {
        String location = isOutdoors ? "Outdoors" : "Indoors";
        return String.format("%s Training Ground: %s. It has training multiplier %.2f", location,
                name, trainingMultiplier);
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
        TrainingGround otherTG = (TrainingGround) other;
        if (name.equals(otherTG.name) && isOutdoors == otherTG.isOutdoors && trainingMultiplier
                == otherTG.trainingMultiplier) {
            return true;
        }
        return false;
    }

}
