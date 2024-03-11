// / The following program use final local variables 
// from the enclosing block in the anonymous class.

package book_03_object_oriented_programming.chapter_07_using_inner_classes_anonymous_classes_and_lambda_expressions.part_03_using_anonymous_inner_classes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Timer;
import javax.swing.JOptionPane;


public class TickTockAnonymous2 {
    public static void main(String[] args) {
        TickTockAnonymous2 tickTockAnonymous = new TickTockAnonymous2();
        tickTockAnonymous.go("Tick...", "Tock...");
    }    

    private void go(final String tickMessage, final String tockMessage) {
        // Create a timer that calls the actionPerformed method of an anonymous
        Timer t = new Timer(1000,
            new ActionListener() {
                private boolean tick = true;
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (tick) {
                        System.out.println(tickMessage);                
                    } else {
                        System.out.println(tockMessage);
                    }
                    tick = !tick;
            }
        });
        t.start();
        // Create a dialog box to prevent the program from ending immediately
        // after the timer starts
        JOptionPane.showMessageDialog(null, 
            "Click OK to exit program");
        System.exit(0);
    }
}
