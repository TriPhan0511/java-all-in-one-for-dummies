package book_02_programming_basics.chapter_02programingbasics.part12gettinginputwithjoptionpaneclass;

import javax.swing.JOptionPane;


public class DialogApp {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter an integer: ");
        int myInt = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "You entered integer: " + myInt + ".");

        input = JOptionPane.showInputDialog("Enter a double: ");
        double myDouble = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, "You entered double: " + myDouble + ".");

        input = JOptionPane.showInputDialog("Enter a float: ");
        float myFloat = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null, "You entered float: " + myFloat + ".");

        input = JOptionPane.showInputDialog("Enter a string: ");
        JOptionPane.showMessageDialog(null, "You entered string: " + input + ".");

        input = JOptionPane.showInputDialog("Enter another string: ");
        JOptionPane.showMessageDialog(null, "You entered string: " + input + ".");
    }
}
