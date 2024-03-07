package book_02_programming_basics.chapter05usingloops.part04forloop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "-" + j + " ");
            }
            System.out.println();
        }
    }
}
