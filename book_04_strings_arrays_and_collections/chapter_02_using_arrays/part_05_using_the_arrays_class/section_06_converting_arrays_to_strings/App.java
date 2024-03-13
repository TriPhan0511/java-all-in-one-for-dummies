// The toString method of the Arrays class is handy if you want to quickly dump the
// contents of an array to the console to see what it contains. This method returns
// a string that shows the array’s elements enclosed in brackets, with the elements
// separated by commas.

// Note that the toString method works only for one-dimensional arrays. To print
// the contents of a two-dimensional array with the toString method, use a for
// loop to call the toString method for each subarray.

package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_05_using_the_arrays_class.section_06_converting_arrays_to_strings;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Arrays.setAll(numbers, i -> getRandomInt(1, 100));
        System.out.println(Arrays.toString(numbers));
        // [63, 31, 85, 62, 89, 81, 55, 83, 22, 63]
    }

    private static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
