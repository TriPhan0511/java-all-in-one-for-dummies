package book02.chapter05usingloops.part01whileloop;

public class EvenCounter {
    public static void main(String[] args) {
        int counter = 2;
        while (counter <= 20) {
            System.out.print(counter + " ");
            counter += 2;
        }
    }
}
