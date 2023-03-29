/**
 * Class for Math major
 * Extends Major class, and adds the variable that states whether Discrete Math is needed.
 */
public class Math extends Major{
    /**
     *  Class Variables
     */
    private boolean requiresDiscreteMath;
    /**
     *  Constructor
     */
    public Math(String newMajorName,
                Double newMinimumGPA,
                int newAverageSalary,
                boolean newRequiresCalculus,
                boolean newRequiresDiscreteMath) {
        super(newMajorName,
                newMinimumGPA,
                newAverageSalary,
                newRequiresCalculus);
        setRequiresDiscreteMath(newRequiresDiscreteMath);
    }

    /**
     * Getters and Setters
     */
    public boolean doesItRequireDiscreteMath() {
        return requiresDiscreteMath;
    }

    public void setRequiresDiscreteMath(boolean newRequiresDiscreteMath) {
        requiresDiscreteMath = newRequiresDiscreteMath;
    }

    /**
     *  Overridden equality checker
     *  Adds discrete math check to Major's checks.
     */
    @Override
    public boolean equals(Object potentialMajor) {
        if (super.equals(potentialMajor)){
            Math major = (Math) potentialMajor;
            return doesItRequireDiscreteMath() == major.doesItRequireDiscreteMath();
        }
        return false;
    }

    /**
     *  Overridden toString function
     *  Adds Discrete Math description to Major's toString function
     */
    @Override
    public String toString() {
        return super.toString() + " It is " + doesItRequireDiscreteMath() +
                " that this major also requires Discrete Math.";
    }
}
