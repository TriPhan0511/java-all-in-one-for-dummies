package book02.chapter08handlingexceptions.part02catchingexceptions;

public class DivideByZero {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
