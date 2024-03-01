package book02chapter01;

import javax.swing.JOptionPane;

class Greeter {
    public void sayHello() {
        JOptionPane.showMessageDialog(null,
            "Hello, world!", "Greeter",
            JOptionPane.INFORMATION_MESSAGE );        
    } 

    // public void sayHello() {
    //     System.out.println("Hello, world!");
    // }    
}
