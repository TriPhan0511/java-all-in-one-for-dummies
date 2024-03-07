package book_02_programming_basics.chapter04makingchoices.usingtheconditionaloperator;

/**
 * ConditionalOperatorSample
 */
public class ConditionalOperatorSample {

    public static void main(String[] args) {
        int appleCount = 2;
        // int appleCount = 1;
        String msg = "You have " + appleCount + " apple" + (appleCount > 1 ? "s" : "") + ".";
        System.out.println(msg);
    }    
}