/*
NOTE:
Here’s a program that uses a class called FileInputStream. To create an object
from this class, you must pass the constructor a string that contains the path
and name of a file that exists on your computer. If the file can’t be found, the
FileInputStream throws a FileNotFoundException that you must either catch
or throw. This class is in the java.io package, so any program that uses it must
include an import java.io statement.
*/

package book_02_programming_basics.chapter08handlingexceptions.part03handlingcheckedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException1 {
    public static void main(String[] args) {
        openFile("C:\test.txt");
    }

    public static void openFile(String filename) {
        // FileInputStream file = new FileInputStream(filename); // won't compile
    }
}
