package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_03_more_things_you_can_do_with_interfaces.using_interfaces_for_callbacks;

import javax.swing.Timer;
import javax.swing.JOptionPane;

public class TickTock {
    public static void main(String[] args) {
        // Create a timer that calls the Ticker object 
        // every one second
        Timer t = new Timer(1000, new Ticker());
        t.start();
        // Display a message box to prevent 
        // the program from ending immediately
        JOptionPane.showMessageDialog(null, 
            "Click OK to exit program");
    }
}