package book02.chapter05usingloops.part02dowhileloop;

public class EvenCounter2 {
    public static void main(String[] args) {
        int counter = 2;
        do {
            System.out.print(counter + " ");
            counter += 2;
        } while (counter <= 20);
    }
}
