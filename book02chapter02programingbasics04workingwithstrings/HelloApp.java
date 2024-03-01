package book02chapter02programingbasics04workingwithstrings;

public class HelloApp {
    public static void main(String[] args) {
        // String msg = "Hello";
        // String msg2 = ", world";
        // System.out.println(msg + msg2); // Hello, world

        // Converting primitive data types to strings
        // int i = 2;
        // System.out.println("i = " + i); // i = 2    
        // System.out.println(i + i + " is equal to 4"); // 4 is equal to 4
        // String s = Integer.toString(i);
        // System.out.println(s); // 2

        // Converting strings to primitive data types
        String s = "2";
        int i = Integer.parseInt(s);
        System.out.println(i + 10); // 12

        s = "2.5";
        double d = Double.parseDouble(s);   
        System.out.println(d + 10); // 12.5
        
        s = "two";
        // s = "";
        // s = null;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues...");

        // s = "true"; // true
        // s = "false"; // false
        // s = "1"; // false
        s = "0"; // false
        boolean b = Boolean.parseBoolean(s);
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }
    }
}
