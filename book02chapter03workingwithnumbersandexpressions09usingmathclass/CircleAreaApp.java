package book02chapter03workingwithnumbersandexpressions09usingmathclass;

import java.util.Scanner;

public class CircleAreaApp {
    static Scanner scanner = new Scanner(System.in);
    static double computeArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
        // return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the circle area calculator.");
        System.out.print("Enter the radius of your circle: ");
        double radius = scanner.nextDouble();
        System.out.println("The area is " + computeArea(radius));
    }
    // Output:
    // Welcome to the circle area calculator.
    // Enter the radius of your circle: 5
    // The area is 78.53981633974483
}
