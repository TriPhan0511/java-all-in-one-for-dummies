package book_04_strings_arrays_and_collections.chapter_o4_using_the_linkedlist_class;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> officers = new LinkedList<>();

        // Adding elements to a LinkedList
        // The add method adds these items to the end of the list
        // officers.add("Bones");
        // officers.add("Kirk");
        // officers.add("Spock");
        // officers.add("Scotty");
        // officers.add("Sulu");
        // printList(officers); // Bones Kirk Spock Scotty Sulu

        // The addLast method works the same way, but the addFirst method adds 
        // items to the front of the list
        // officers.addFirst("Bones");
        // officers.addFirst("Kirk");
        // officers.addFirst("Spock");
        // officers.addFirst("Scotty");
        // officers.addFirst("Sulu");
        // printList(officers); // Sulu Scotty Spock Kirk Bones

        // To insert an object into a specific position into the list, 
        // specify the index in the add method
        // officers.add("Bones");
        // officers.add("Kirk");
        // officers.add("Spock");
        // officers.add("Scotty");
        // officers.add("Sulu");
        // officers.add(2, "Hillary");
        // // printList(officers); // Bones Kirk Hillary Spock Scotty Sulu
        // printList2(officers); // Bones Kirk Hillary Spock Scotty Sulu

        // Updating elements in a LinkedList
        // LinkedList<String> officers2 = new LinkedList<>(
        //     Arrays.asList("Bones", "Kirk", "Spock", "Scotty", "Sulu"));   
        // printList(officers2); // Bones Kirk Spock Scotty Sulu
        // // Replace Spock with Murdock
        // officers2.set(2, "Murdock");
        // printList(officers2); // Bones Kirk Murdock Scotty Sulu

        // Removing elements from a LinkedList
        Person p1 = new Person("Bones");
        Person p2 = new Person("Kirk");
        Person p3 = new Person("Spock");
        Person p4 = new Person("Scotty");
        Person p5 = new Person("Sulu");
        LinkedList<Person> officers3 = new LinkedList<>(
            Arrays.asList(p1, p2, p3, p4, p5));
        System.out.println(officers3); // [Bones, Kirk, Spock, Scotty, Sulu]

        // You’ve already seen that several of the methods that retrieve items from a linked
        // list also remove the items. In particular, the remove, removeFirst, and poll
        // methods remove the first item from the list, and the removeLast method removes
        // the last item.

        // You can also remove any arbitrary item by specifying either its index number or a
        // reference to the object you want to remove on the remove method. To remove item 3,
        // for example, use a statement like this:
        officers3.remove(3);
        System.out.println(officers3); // [Bones, Kirk, Spock, Sulu]

        // If you have a reference to the item that you want to remove, use the remove
        // method, like this:
        officers3.remove(p1);
        System.out.println(officers3); // [Kirk, Spock, Sulu]
        
        // To remove all the items from the list, use the clear method:
        officers3.clear();
        System.out.println(officers3); // []
    }

    // Using an iterator to loop through a LinkedList
    private static void printList2(LinkedList<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }

    // Using a for-each loop to loop through a LinkedList
    private static void printList(LinkedList<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();        
    }
}
