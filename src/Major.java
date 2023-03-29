/** Alejandro Mijares
* March 12, 2023
* Panther ID: 3145563
* Program Version: 1.0
* Java Version: 8
*/

/**
 * Class that establishes a pattern for college Majors.
 * Contains relevant information like the Major's name, minimum GPA, average salary,
 * and whether it requires calculus.
 */
public class Major {
    /**
     * Class variables
     */
    private String majorName;
    private Double minimumGPA;
    private int averageSalary;
    private boolean requiresCalculus;

    /**
     * Getter and setter functions
     */

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String newMajorName) {
        majorName = newMajorName;
    }

    public Double getMinimumGPA() {
        return minimumGPA;
    }

    public void setMinimumGPA(Double newMinimumGPA) {
        minimumGPA = newMinimumGPA;
    }

    public int getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(int newAverageSalary) {
        averageSalary = newAverageSalary;
    }

    public boolean doesItRequireCalculus() {
        return requiresCalculus;
    }

    public void setNeedsCalculus(boolean newRequiresCalculus) {
        requiresCalculus = newRequiresCalculus;
    }

    /**
     * Constructor
     */
    public Major(String newMajorName,
                 Double newMinimumGPA,
                 int newAverageSalary,
                 boolean newRequiresCalculus) {
        setMajorName(newMajorName);
        setMinimumGPA(newMinimumGPA);
        setAverageSalary(newAverageSalary);
        setNeedsCalculus(newRequiresCalculus);
    }

    /**
     * Overridden equality checker
     * Verifies that a passed object is equal to this object.
     */
    @Override
    public boolean equals(Object potentialMajor) {
        if (this == potentialMajor) return true;
        if (potentialMajor == null || getClass() != potentialMajor.getClass()) return false;
        Major major = (Major) potentialMajor;
        return getAverageSalary() == major.getAverageSalary()
                && doesItRequireCalculus() == major.doesItRequireCalculus()
                && getMajorName().equals(major.getMajorName())
                && getMinimumGPA().equals(major.getMinimumGPA());
    }

    /**
     * Overridden toString function
     * Returns a summary of the Major's information.
     */
    @Override
    public String toString() {
        return "The major " + getMajorName() +
                " requires a minimum GPA of " + getMinimumGPA() +
                ", has an average annual graduate salary of $" + getAverageSalary() +
                ", and it is " + doesItRequireCalculus() + " that it needs Calculus.";
    }
}

