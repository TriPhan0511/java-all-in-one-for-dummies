// If you use the equality operator (==) to compare array variables, the array variables
// are considered to be equal only if both variables point to exactly the same
// array instance. To compare two arrays element by element, you should use the
// Arrays.equals method instead.

// If the array has more than one dimension, you can use the deepEquals method
// instead. It compares any two subarrays, element by element, to determine whether
// they’re identical.

package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_05_using_the_arrays_class.section_05_comparing_arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 3, 4};

        if (Arrays.equals(a, b)) {
            System.out.println("Arrays a and b are equal");
        } else {
            System.out.println("Arrays a and b are not equal");
        }

        if (Arrays.equals(a, c)) {
            System.out.println("Arrays a and c are equal");
        } else {
            System.out.println("Arrays a and c are not equal");
        }
        // Output:
        // Arrays a and b are equal
        // Arrays a and c are not equal
    }
}
