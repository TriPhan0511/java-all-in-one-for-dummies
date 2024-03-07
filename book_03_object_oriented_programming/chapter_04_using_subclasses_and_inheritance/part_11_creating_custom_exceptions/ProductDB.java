package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_11_creating_custom_exceptions;

import java.io.IOException;

public class ProductDB {
    private static Product fetchProduct(boolean isError) throws IOException {
        if (isError) {
            throw new IOException();
        }
        return new Product();
    }

    public static Product getProduct(String code)
        throws ProductDataException {
            try {
                Product p;
                // Code that gets the product from a file and 
                // might throw an IOException
                p = fetchProduct(true);
                return p;
            } catch (IOException e) {
                throw new ProductDataException("An IO error occurred.");
            }
    }
}
