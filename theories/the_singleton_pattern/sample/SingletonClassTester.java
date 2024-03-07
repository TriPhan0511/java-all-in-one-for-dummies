package theories.the_singleton_pattern.sample;
public class SingletonClassTester {
    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        if (instance1 == instance2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Both instances are different");
        }
        // Output: 
        // Both instances are the same
    }
}
