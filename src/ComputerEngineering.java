/**
 * Class for Computer Engineering major
 * Extends Electrical Engineering class, which itself extends the Major class.
 * Adds the variable that states whether Computer Design is needed.
 */
public class ComputerEngineering extends ElectricalEngineering{
    /**
     *  Class Variables
     */

    private boolean requiresComputerDesign;
    /**
     *  Constructor
     */
    public ComputerEngineering(String newMajorName,
                               Double newMinimumGPA,
                               int newAverageSalary,
                               boolean newRequiresCalculus,
                               boolean newRequiresFieldsAndWaves,
                               boolean newRequiresComputerDesign) {
        super(newMajorName,
                newMinimumGPA,
                newAverageSalary,
                newRequiresCalculus,
                newRequiresFieldsAndWaves);
        setRequiresComputerDesign(newRequiresComputerDesign);
    }

    /**
     * Getters and Setters
     */

    public boolean doesItRequireComputerDesign() {
        return requiresComputerDesign;
    }

    public void setRequiresComputerDesign(boolean newRequiresComputerDesign) {
        requiresComputerDesign = newRequiresComputerDesign;
    }

    /**
     *  Overridden equality checker
     *  Adds Computer Design check to Major's checks.
     */

    @Override
    public boolean equals(Object potentialMajor) {
        if (super.equals(potentialMajor)){
            ComputerEngineering major = (ComputerEngineering) potentialMajor;
            return doesItRequireComputerDesign() == major.doesItRequireComputerDesign();
        }
        return false;
    }

    /**
     *  Overridden toString function
     *  Adds Computer Design description to Major's toString function
     */

    @Override
    public String toString() {
        return super.toString() + " Also, it is " + doesItRequireComputerDesign() +
                " that this major also requires Computer Design";
    }
}
