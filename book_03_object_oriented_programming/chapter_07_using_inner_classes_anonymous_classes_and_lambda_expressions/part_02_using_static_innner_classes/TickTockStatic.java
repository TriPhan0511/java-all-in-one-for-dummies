package book_03_object_oriented_programming.chapter_07_using_inner_classes_anonymous_classes_and_lambda_expressions.part_02_using_static_innner_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TickTockStatic {
    private static String tickMessage = "Tick...";
    private static String tockMessage = "Tock...";

    public static void main(String[] args) {
        new TickTockStatic().go();
    }

    private void go() {
        // Create a timer that calls the Ticker class
        // at on second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        // Display a message box to prevent the program
        // from ending immediately
        JOptionPane.showMessageDialog(null,
            "Click OK to exit program");
        System.exit(0);
    }

    private static class Ticker implements ActionListener {
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
    }
}
