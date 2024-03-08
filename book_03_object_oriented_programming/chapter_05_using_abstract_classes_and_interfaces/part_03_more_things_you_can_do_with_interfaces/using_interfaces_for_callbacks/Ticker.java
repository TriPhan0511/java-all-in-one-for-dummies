package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_03_more_things_you_can_do_with_interfaces.using_interfaces_for_callbacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ticker implements ActionListener{
    private boolean tick = true;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }
        tick = !tick;
    }
}
