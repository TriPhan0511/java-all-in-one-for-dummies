package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_03_creating_deep_copies.sample1;

public class App {
    public static void main(String[] args) {
        Address address = new Address("1234 Main Street", "Miami");
        Employee emp1 = new Employee("Doe", "John", address);
        Employee emp2 = (Employee) emp1.clone();
        emp2.setAddress(new Address("5678 Highway", "New York"));
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
