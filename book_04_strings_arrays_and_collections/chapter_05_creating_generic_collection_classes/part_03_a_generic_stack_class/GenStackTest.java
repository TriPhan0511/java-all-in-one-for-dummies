package book_04_strings_arrays_and_collections.chapter_05_creating_generic_collection_classes.part_03_a_generic_stack_class;

public class GenStackTest {
    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<String>();

        System.out.println("Pushing four items onto the stack");
        gs.push("one");
        gs.push("two");
        gs.push("three");
        gs.push("four");

        System.out.println("There are " 
            + gs.size() + " items on the stack");
        
        System.out.println("The top item is " 
            + gs.peek() + "\n");

        System.out.println("There are still " 
            + gs.size() + " items on the stack.\n");

        System.out.println("Popping everything:");
        while (gs.hasItems()) {
            System.out.println(gs.pop());
        }

        System.out.println("There are now " 
            + gs.size() + " items on the stack.\n");

        System.out.println("The top item is " 
            + gs.peek() + "\n");
        
        // Output:
        // Pushing four items onto the stack
        // There are 4 items on the stack
        // The top item is four

        // There are still 4 items on the stack.

        // Popping everything:
        // four
        // three
        // two
        // one
        // There are now 0 items on the stack.

        // The top item is null
    }
}
