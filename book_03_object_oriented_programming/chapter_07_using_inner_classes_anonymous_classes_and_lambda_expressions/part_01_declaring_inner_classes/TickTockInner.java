/*
THE OBSERVER PATTERN

Event listeners in Java are part of a Java model called the Delegation Event Model, which is
an implementation of a more general design pattern called the Observer pattern. This
pattern is useful when you need to create objects that interact with one another when
a change in the status of one of the objects occurs. The object whose changes are being
monitored is called the observable object, and the object that monitors those changes is
called the observer object. The observer object registers itself with the observable object,
which then notifies the observer object when its status changes.

In the following example, the Timer object is the observable object, and the Ticker object 
is the observer object. The Ticker object registers itself with the Timer object, 
and the Timer object notifies the Ticker object when its status changes. The Ticker object 
then responds to the notification by executing the actionPerformed() method.   
 */

package book_03_object_oriented_programming.chapter_07_using_inner_classes_anonymous_classes_and_lambda_expressions.part_01_declaring_inner_classes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TickTockInner {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        // TickTockInner tickTockInner = new TickTockInner();
        // tickTockInner.go();
        new TickTockInner().go();
    }

    private void go() {
        // Create a timer that calls the Ticker class
        // at once second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        // Display a message box to prevent the program
        // from ending immediately
        JOptionPane.showMessageDialog(null, 
            "Click OK to exit program");    
        System.exit(0);
    }

    private class Ticker implements ActionListener {
        private boolean tick = true;
        public void actionPerformed(ActionEvent event) {
            if (tick) {
                System.out.println(tickMessage);
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
