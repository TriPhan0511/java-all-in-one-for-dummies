package book02.chapter08handlingexceptions.part03handlingcheckedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException2 {
    public static void main(String[] args) {
        openFile("C:\\test.txt");
    }

    // Catching FileNotFoundException
    public static void openFile(String filename) {
        try {
            FileInputStream file = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }


}
