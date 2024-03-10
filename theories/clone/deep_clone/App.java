package theories.clone.deep_clone;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Smith", "John", 50000);
        emp1.setAddress(new Address(
            "123 Main St",
            "Los Angeles", "CA", "90001"));
        Employee emp2 = (Employee) emp1.clone();
        
        System.out.println("\n***** After cloning *****");
        System.out.println(emp1);
        System.out.println(emp2);
        
        emp2.setAddress(new Address("456 Highway", "Chicago", "CH", "12345"));        
        System.out.println("\n***** After changing *****");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
