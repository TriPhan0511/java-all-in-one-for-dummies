package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_05_using_the_arrays_class.section_02_copying_an_array;

import java.util.Arrays;

public class CopyDemo {
    public static void main(String[] args) {
        int[] arrayOriginal = {42, 55, 21};
        printArray(arrayOriginal); // 42 55 21 
        
        int[] arrayNew = Arrays.copyOf(arrayOriginal, 3);
        printArray(arrayNew); // 42 55 21

        arrayNew = Arrays.copyOf(arrayOriginal, 2);
        printArray(arrayNew); // 42 55

        arrayNew = Arrays.copyOf(arrayOriginal, 10);
        printArray(arrayNew); // 42 55 21 0 0 0 0 0 0 0

        
        int[] arrayNew2 = Arrays.copyOfRange(arrayOriginal, 1, arrayOriginal.length);
        printArray(arrayNew2); // 55 21

        arrayNew2 = Arrays.copyOfRange(arrayOriginal, 2, 10);
        printArray(arrayNew2); // 21 0 0 0 0 0 0 0
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
