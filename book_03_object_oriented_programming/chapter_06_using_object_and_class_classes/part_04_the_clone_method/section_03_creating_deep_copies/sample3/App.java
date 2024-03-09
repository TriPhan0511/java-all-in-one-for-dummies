package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_03_creating_deep_copies.sample3;

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
