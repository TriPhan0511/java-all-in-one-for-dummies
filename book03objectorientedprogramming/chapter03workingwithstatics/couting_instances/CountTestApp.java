package book03objectorientedprogramming.chapter03workingwithstatics.couting_instances;

/**
 * CountTestApp
 */
public class CountTestApp {

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c = new CountTest();
            printCount();
        }
    }

    private static void printCount() {
        System.out.println("There are now " 
            + CountTest.getInstanceCount()
            + " instances of the CountTest class.");
    }

    // Output:
    // There are now 0 instances of the CountTest class.
    // There are now 1 instances of the CountTest class.
    // There are now 2 instances of the CountTest class.
    // There are now 3 instances of the CountTest class.
    // There are now 4 instances of the CountTest class.
    // There are now 5 instances of the CountTest class.
    // There are now 6 instances of the CountTest class.
    // There are now 7 instances of the CountTest class.
    // There are now 8 instances of the CountTest class.
    // There are now 9 instances of the CountTest class.
    // There are now 10 instances of the CountTest class.
}
