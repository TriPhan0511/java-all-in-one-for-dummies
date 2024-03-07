package book_02_programming_basics.chapter05usingloops.part04forloop;

public class CountToTenError {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        // System.out.println("The final value of i is " + i); // Error: i cannot be resolved to a variable
    }
}
