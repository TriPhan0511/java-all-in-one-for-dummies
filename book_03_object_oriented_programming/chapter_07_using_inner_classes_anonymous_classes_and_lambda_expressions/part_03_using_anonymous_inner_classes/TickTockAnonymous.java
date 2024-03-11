package book_03_object_oriented_programming.chapter_07_using_inner_classes_anonymous_classes_and_lambda_expressions.part_03_using_anonymous_inner_classes;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockAnonymous {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockAnonymous tickTockAnonymous = new TickTockAnonymous();
        tickTockAnonymous.go();
    }    

    private void go() {
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
