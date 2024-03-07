package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_11_creating_custom_exceptions;

public class App {
    public static void main(String[] args) {
        try {
            Product p = ProductDB.getProduct("java");
        } catch (ProductDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
