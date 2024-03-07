package book_03_object_oriented_programming.chapter_02_making_your_own_classes;

public class PrimeNumberTester {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("The number you entered is: " + primeNumber.getX());
    }
}
