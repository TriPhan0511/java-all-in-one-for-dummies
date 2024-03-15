package book_04_strings_arrays_and_collections.chapter_05_creating_generic_collection_classes.part_03_a_generic_stack_class;

import java.util.LinkedList;

public class GenStack<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void push(E item) {
        list.addFirst(item);
    }

    public E pop() {
        return list.poll();
    }

    public E peek() {
        return list.peek();
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
