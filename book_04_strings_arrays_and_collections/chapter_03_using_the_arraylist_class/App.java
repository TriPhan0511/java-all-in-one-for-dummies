package book_04_strings_arrays_and_collections.chapter_03_using_the_arraylist_class;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printNumbers(list); // 1 2 3 4 5

        list.add(0, 100);
        printNumbers(list); // 100 1 2 3 4 5

        list.add(list.size(), 200);
        printNumbers(list); // 100 1 2 3 4 5 200

        list.add(3, 300); 
        printNumbers(list); // 100 1 2 300 3 4 5 200

        // list.clear();
        // printNumbers(list); // empty
        // System.out.println(list.isEmpty()); // true
        // System.out.println(list.size()); // 0

        // ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
        // list2.add(400);
        // printNumbers(list2); // 100 1 2 300 3 4 5 200 400
        
        // int i = 1;
        // if (list.contains(i)) {
        //     System.out.println("list contains " + i);
        // } else {
        //     System.out.println("list does not contain " + i);
        // }
        
        // System.out.println(list.get(3)); // 300
        // System.out.println(list.indexOf(300)); // 3
        // System.out.println(list.indexOf(1000)); // -1
        
        printNumbers(list); // 100 1 2 300 3 4 5 200
        list.remove(0);
        printNumbers(list); // 1 2 300 3 4 5 200
        list.remove(Integer.valueOf(200));
        printNumbers(list); // 1 2 300 3 4 5

        list.add(300);
        printNumbers(list); // 1 2 300 3 4 5 300
        list.remove(Integer.valueOf(300));
        printNumbers(list); // 1 2 3 4 5 300
        list.remove(Integer.valueOf(300));
        printNumbers(list); // 1 2 3 4 5

        int i = list.set(0, 100);
        printNumbers(list); // 100 2 3 4 5
        System.out.println(i); // 1

        ArrayList<Integer> list3 = new ArrayList<>(list);
        printNumbers(list3); // 100 2 3 4 5
        list3.add(500);
        printNumbers(list3); // 100 2 3 4 5 500
        printNumbers(list); // 100 2 3 4 5

        System.out.println(list); // [100, 2, 3, 4, 5]
    }

    private static void printNumbers(ArrayList<Integer> list) {
        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }   
}
