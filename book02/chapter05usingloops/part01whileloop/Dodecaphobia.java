package book02.chapter05usingloops.part01whileloop;

public class Dodecaphobia {
    public static void main(String[] args) {
        int counter = 2;
        while (counter <= 20) {
            if (counter == 12) {
                break;
            }
            System.out.print(counter + " ");
            counter += 2;
        }
    }
}
