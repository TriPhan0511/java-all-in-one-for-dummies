package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_05_using_the_arrays_class.section_01_filling_an_array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        // Filling an array with a value of 100
        // Arrays.fill(numbers, 100);

        // Filling an array with random numbers
        Arrays.setAll(numbers, index -> getRandomInt(1, 100));

        // Print the array
        printArray(numbers);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
