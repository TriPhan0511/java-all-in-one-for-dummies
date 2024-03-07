package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_11_creating_custom_exceptions;

public class ProductDataException extends Exception {
    public ProductDataException() {}

    public ProductDataException(String message) {
        super(message);
    }
}
