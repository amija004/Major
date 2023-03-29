/**
 *  Class for Computer Science major
 *  Extends Math Major class, which itself extends the Major class
 *  Adds a check for Data Structures as a requirement
 */
public class ComputerScience extends Math{
    /**
     *  Class variables
     */
    private boolean requiresDataStructures;

    /**
     *  Constructor
     */
    public ComputerScience(String newMajorName,
                           Double newMinimumGPA,
                           int newAverageSalary,
                           boolean newRequiresCalculus,
                           boolean newRequiresDiscreteMath,
                           boolean newRequiresDataStructures) {
        super(newMajorName,
                newMinimumGPA,
                newAverageSalary,
                newRequiresCalculus,
                newRequiresDiscreteMath);
        setRequiresDataStructures(newRequiresDataStructures);
    }

    /**
     *  Getters and Setters
     */
    public boolean doesItRequireDataStructures() {
        return requiresDataStructures;
    }

    public void setRequiresDataStructures(boolean newRequiresDataStructures) {
        requiresDataStructures = newRequiresDataStructures;
    }

    /**
     * Overridden equality checker
     * Adds Data Structures check to Math's checks.
     */
    @Override
    public boolean equals(Object potentialMajor) {
        if (super.equals(potentialMajor)){
            ComputerScience major = (ComputerScience) potentialMajor;
            return doesItRequireDataStructures() == major.doesItRequireDataStructures();
        }
        return false;
    }

    /**
     *  Overridden toString function
     *  Adds Data Structures description to Math's toString function
     */
    @Override
    public String toString() {
        return super.toString() + " It is also " + doesItRequireDataStructures() +
                " that this major also requires Data Structures.";
    }
}
