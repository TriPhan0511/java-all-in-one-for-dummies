package book_02_programming_basics.chapter05usingloops.part04forloop;

public class CountToTenErrorFixed {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("The final value of i is " + i); // The final value of i is 11
    }
}
