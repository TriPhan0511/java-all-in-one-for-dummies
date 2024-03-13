package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_05_using_the_arrays_class.section_03_sorting_an_array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.setAll(array, index -> getRandomInt(1, 100));
        printArray(array);
        // Arrays.sort(array); // Sorts the array in ascending order
        Arrays.sort(array, 0, 3); // Sorts the first 3 elements of the array in ascending order 
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
