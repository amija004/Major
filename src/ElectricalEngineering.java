/**
 * Class for Electrical Engineering major
 * Extends Major class, and adds the variable that states whether Fields and Waves is needed.
 */
public class ElectricalEngineering extends Major{
    /**
     *  Class Variables
     */
    private boolean requiresFieldsAndWaves;
    /**
     *  Constructor
     */
    public ElectricalEngineering(String newMajorName,
                                 Double newMinimumGPA,
                                 int newAverageSalary,
                                 boolean newRequiresCalculus,
                                 boolean newRequiresFieldsAndWaves) {
        super(newMajorName,
                newMinimumGPA,
                newAverageSalary,
                newRequiresCalculus);
        setRequiresFieldsAndWaves(newRequiresFieldsAndWaves);
    }

    /**
     * Getters and Setters
     */

    public boolean doesItRequireFieldsAndWaves() {
        return requiresFieldsAndWaves;
    }

    public void setRequiresFieldsAndWaves(boolean newRequiresFieldsAndWaves) {
        requiresFieldsAndWaves = newRequiresFieldsAndWaves;
    }

    /**
     *  Overridden equality checker
     *  Adds Fields and Waves check to Major's checks.
     */

    @Override
    public boolean equals(Object potentialMajor) {
        if (super.equals(potentialMajor)){
            ElectricalEngineering major = (ElectricalEngineering) potentialMajor;
            return doesItRequireFieldsAndWaves() == major.doesItRequireFieldsAndWaves();
        }
        return false;
    }

    /**
     *  Overridden toString function
     *  Adds Fields and Waves description to Major's toString function
     */

    @Override
    public String toString() {
        return super.toString() + " It is " + doesItRequireFieldsAndWaves() +
                " that this major also requires Fields and Waves";
    }
}
