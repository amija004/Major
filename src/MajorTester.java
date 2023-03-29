/** Alejandro Mijares
 * March 12, 2023
 * Panther ID: 3145563
 * Program Version: 1.0
 * Java Version: 8
 */

/**
 *  Tester class for the Major class and subclasses
 *  Creates an object of each major, and then returns the variables of each created object.
 */
import java.util.ArrayList;
public class MajorTester {
    public static void main(String [] args){
        /**
         * Class variable
         * Array list that will contain all majors
         */
        ArrayList<Major> majors = new ArrayList<Major>();

        /**
         * Major object initializers
         * Upon creation, each object will be added to the majors array list
         */

        majors.add(new ElectricalEngineering("Electrical Engineering",
                                                3.0,
                                                91887,
                                                true,
                                                true));
        majors.add(new ComputerEngineering("Computer Engineering",
                                            3.0,
                                            82917,
                                            true,
                                            false,
                                            true));
        majors.add(new Math("Mathematics",
                            3.5,
                            99029,
                            true,
                            true));
        majors.add(new ComputerScience("Computer Science",
                                        3.0,
                                        92381,
                                        true,
                                        false,
                                        true));
        majors.add(new Statistics("Statistics",
                                    3.5,
                                    86960,
                                    true,
                                    false,
                                    true));
        majors.add(new English("English",
                                2.5,
                                59851,
                                false,
                                true));

        /**
         * Loop to iterate through each Major object, and print its details
         */

        for (int i = 0; i < majors.size(); i++){
            System.out.println(majors.get(i).toString() + '\n');
            /**
             * For loop that checks for duplicate majors using the builtin equality checker
             */
            for (int j = i+1; j < majors.size(); j++){
                if (majors.get(j).equals(majors.get(i))){
                    System.out.println(majors.get(i).getMajorName()
                                        + " is the same as "
                                        + majors.get(j).getMajorName() + '!');
                }
            }
        }
    }
}
