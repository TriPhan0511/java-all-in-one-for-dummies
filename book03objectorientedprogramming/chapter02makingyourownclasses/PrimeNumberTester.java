package book03objectorientedprogramming.chapter02makingyourownclasses;

public class PrimeNumberTester {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("The number you entered is: " + primeNumber.getX());
    }
}
