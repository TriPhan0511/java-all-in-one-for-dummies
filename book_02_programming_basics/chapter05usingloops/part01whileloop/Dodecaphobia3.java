package book_02_programming_basics.chapter05usingloops.part01whileloop;

public class Dodecaphobia3 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 20) {
            counter += 2;
            if (counter == 12) {
                continue;
            }
            System.out.print(counter + " ");
        }
    }
}
