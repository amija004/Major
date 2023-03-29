/**
 *  Class for Statistics major
 *  Extends Math Major class, which itself extends the Major class
 *  Adds a check for Statistical Methods as a requirement
 */
public class Statistics extends Math{
    /**
     *  Class variables
     */
    private Boolean requiresStatisticalMethods;

    /**
     *  Constructor
     */
    public Statistics(String newMajorName,
                      Double newMinimumGPA,
                      int newAverageSalary,
                      boolean newRequiresCalculus,
                      boolean newRequiresDiscreteMath,
                      boolean newRequiresStatisticalMethods) {
        super(newMajorName,
                newMinimumGPA,
                newAverageSalary,
                newRequiresCalculus,
                newRequiresDiscreteMath);
        setRequiresStatisticalMethods(newRequiresStatisticalMethods);
    }

    /**
     *  Getters and Setters
     */

    public Boolean doesItRequireStatisticalMethods() {
        return requiresStatisticalMethods;
    }

    public void setRequiresStatisticalMethods(Boolean newRequiresStatisticalMethods) {
        requiresStatisticalMethods = newRequiresStatisticalMethods;
    }

    /**
     * Overridden equality checker
     * Adds Statistical Methods check to Math's checks.
     */

    @Override
    public boolean equals(Object potentialMajor) {
        if (super.equals(potentialMajor)){
            Statistics major = (Statistics) potentialMajor;
            return doesItRequireStatisticalMethods() == major.doesItRequireStatisticalMethods();
        }
        return false;
    }

    /**
     *  Overridden toString function
     *  Adds Statistical Methods description to Math's toString function
     */
    @Override
    public String toString() {
        return super.toString() + " It is " + doesItRequireStatisticalMethods() +
                " that this major also requires Statistical Methods.";
    }
}
