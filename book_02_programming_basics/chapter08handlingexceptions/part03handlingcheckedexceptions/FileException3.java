package book_02_programming_basics.chapter08handlingexceptions.part03handlingcheckedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException3 {    
    public static void main(String[] args) {
        try {
            openFile("C:\\test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    // public static void main(String[] args) throws FileNotFoundException{
    //     openFile("C:\\test.txt");
    // }

    // Throwing FileNotFoundException
    public static void openFile(String filename) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(filename);        
    }
}
