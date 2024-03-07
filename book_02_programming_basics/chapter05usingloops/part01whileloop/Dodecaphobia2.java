package book_02_programming_basics.chapter05usingloops.part01whileloop;

public class Dodecaphobia2 {
    public static void main(String[] args) {
        int counter = 2;
        while (true) {
            if (counter == 12) {
                break;
            }
            System.out.print(counter + " ");
            counter += 2;
        }
    }
}
