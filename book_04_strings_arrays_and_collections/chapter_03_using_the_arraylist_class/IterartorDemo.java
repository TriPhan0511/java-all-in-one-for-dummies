// To use an iterator, you first call the array list’s iterator method to get the iterator.
// Then you use the iterator’s hasNext and next methods to retrieve each item in
// the collection. The normal way to do that is with a while loop. Here’s an example:

package book_04_strings_arrays_and_collections.chapter_03_using_the_arraylist_class;

import java.util.ArrayList;

import java.util.Iterator;

public class IterartorDemo {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");

        Iterator<String> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Here the first five statements create an array list and add four strings to it. Next,
        // the iterator method is called to get an iterator for the nums array list. The
        // hasNext method is called in the while statement, and the next method is called
        // to get the element to be printed.

        // Note that the Iterator interface is generic, so you can supply a type when you
        // declare it. In the preceding example, I declare the type as String so that the
        // Iterator will work with String values returned from the ArrayList. If I had
        // omitted the type when I declared the Iterator, I’d have to cast the result of the
        // next method to a String.
    }
}
