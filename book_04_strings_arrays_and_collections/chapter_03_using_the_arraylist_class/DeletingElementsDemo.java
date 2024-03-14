/*
The ArrayList class provides several methods that let you remove elements from
the collection. To remove all the elements, use the clear method, like this:

    list.clear();

To remove a specific element, use the remove method. It lets you remove an element
based on the index number, like this:

    list.remove(0);

Here the first element in the array list is removed.

Alternatively, you can pass the actual object you want removed. This is useful if
you don’t know the index of the object you want to remove, but you happen to
have a reference to the actual object, as in this example:
*/

/*
Here are a few important details to keep in mind:

    * The clear and remove methods don’t actually delete objects; they simply
        remove the references to the objects from the array list. Like any other
        objects, the objects in a collection are deleted automatically by the garbage
        collector — and then only if the objects are no longer being referenced by
        the program.

    * You can remove more than one element at the same time by using the remove
        Range method. On it, you specify the starting and ending index numbers. (Note
        that this method removes all elements between the elements you specify, but
        the elements you specify aren’t themselves removed. removeRange(5, 8), for
        example, removes elements 6 and 7, but elements 5 and 8 aren’t removed.)

    * You can also use the removeAll method to remove all the objects in one
        collection from another collection. A similar method, retainAll, removes all
        the objects that are not in another collection.
 */

package book_04_strings_arrays_and_collections.chapter_03_using_the_arraylist_class;

import java.util.ArrayList;

public class DeletingElementsDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Doe");
        Employee e2 = new Employee("Jane", "Doe");
        Employee e3 = new Employee("Tom", "Smith");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        System.out.println(employees); // [John Doe, Jane Doe, Tom Smith]
        employees.remove(e1);
        System.out.println(employees); // [Jane Doe, Tom Smith]
        // Output:
        // [John Doe, Jane Doe, Tom Smith]
        // [Jane Doe, Tom Smith]
    }
}
