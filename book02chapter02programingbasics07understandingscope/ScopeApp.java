package book02chapter02programingbasics07understandingscope;

public class ScopeApp {
    static int x; // class variable
    public static void main(String[] args) {
        x = 5;
        System.out.println("main: x = " + x);
        myMethod();
        // Output: 
        // main: x = 5
        // myMethod: z = 15
        // myMethod: x = 5 
        // myMethod: y = 10
    }
    public static void myMethod()
    {
        int y; // local variable
        y = 10;
        if (y == x + 5) {
            int z;
            z = 15;
            System.out.println("myMethod: z = " + z);            
        }
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    }
}
