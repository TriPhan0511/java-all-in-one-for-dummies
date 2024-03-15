package book_04_strings_arrays_and_collections.chapter_05_creating_generic_collection_classes.part_03_a_generic_stack_class;

public class GenQueueTest {
    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();

        GenQueue<HourlyEmployee> hList;
        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee(
            "Peter", "Pan"));
        hList.enqueue(new HourlyEmployee(
            "Wendy", "Darling"));
        hList.enqueue(new HourlyEmployee(
            "Captain", "Hook"));
        
        empList.addItems(hList);

        while (empList.hasItems()) {
            Employee emp = empList.dequeue();
            System.out.println(emp.getFirstName() + " " + emp.getLastName());
        }
    }
}
