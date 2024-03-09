package theories.clone.shallow_clone;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Smith", "John", 50000);
        Employee emp2 = (Employee) emp1.clone();
        
        System.out.println("\n***** After cloning *****");
        System.out.println(emp1);
        System.out.println(emp2);
        
        emp2.setSalary(60000);
        System.out.println("\n***** After changing *****");
        System.out.println(emp1);
        System.out.println(emp2);

        emp1.setFirstName("Hillary");
        System.out.println("\n***** After changing *****");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
