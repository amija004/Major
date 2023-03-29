/**
 * Class for English major
 * Extends Major class, and adds the variable that states whether Creative Writing is needed.
 */
public class English extends Major{
    /**
     *  Class Variables
     */
    private boolean requiresCreativeWriting;
    /**
     *  Constructor
     */
    public English(String newMajorName,
                   Double newMinimumGPA,
                   int newAverageSalary,
                   boolean newRequiresCalculus,
                   boolean newRequiresCreativeWriting) {
        super(newMajorName,
                newMinimumGPA,
                newAverageSalary,
                newRequiresCalculus);
        setRequiresCreativeWriting(newRequiresCreativeWriting);
    }

    /**
     * Getters and Setters
     */

    public boolean doesItRequireCreativeWriting() {
        return requiresCreativeWriting;
    }

    public void setRequiresCreativeWriting(boolean newRequiresCreativeWriting) {
        requiresCreativeWriting = newRequiresCreativeWriting;
    }

    /**
     *  Overridden equality checker
     *  Adds Creative Writing check to Major's checks.
     */

    @Override
    public boolean equals(Object potentialMajor) {
        if (super.equals(potentialMajor)){
            English major = (English) potentialMajor;
            return doesItRequireCreativeWriting() == major.doesItRequireCreativeWriting();
        }
        return false;
    }

    /**
     *  Overridden toString function
     *  Adds Creative Writing description to Major's toString function
     */

    @Override
    public String toString() {
        return super.toString() + " Also, it is " + doesItRequireCreativeWriting() +
                " that this major requires Creative Writing.";
    }
}
