package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_05_using_the_arrays_class.section_04_searching_an_array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] lotto = new int[10];
        Arrays.setAll(lotto, index -> getRandomInt(1, 20));
        if (findNumber(lotto, 11)) {
            System.out.println("My number came up!");
        } else {
            System.out.println("Better luck next time!");
            
        }
    }

    private static boolean findNumber(int[] array, int number) {
        return Arrays.binarySearch(array, number) >= 0;
    }

    private static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
