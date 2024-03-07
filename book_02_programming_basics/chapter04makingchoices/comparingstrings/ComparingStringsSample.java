package book_02_programming_basics.chapter04makingchoices.comparingstrings;

public class ComparingStringsSample {
    public static void main(String[] args) {
        String answer = "Nooooo!";
        // String answer = "Yes";
        if (answer.equals("Yes")) {
            System.out.println("You said yes.");
        } else {
            System.out.println("You said no.");
        }

        String s = "HELLO";
        if (s.equalsIgnoreCase("hello")) {
            System.out.println("The strings are equal.");
        }
    }
}
/*
NOTE:
Comparing strings in Java takes a little extra care, because the == operator really
doesn’t work the way it should. Suppose that you want to know whether a String
variable named answer contains the value "Yes". You may be tempted to code an
if statement like this:

    if (answer == "Yes") {
        System.out.println("You said yes.");
    }

Unfortunately, that’s not correct. The problem is that in Java, strings are reference
types, not primitive types; when you use the == operator with reference types, Java
compares the references to the objects, not the objects themselves. As a result, the
expression answer == "Yes" doesn’t test whether the value of the string referenced
by the answer variable is "Yes". Instead, it tests whether the answer string
and the literal string "Yes" point to the same string object in memory. In many
cases, they do — but sometimes they don’t, and the results are difficult to predict.

The correct way to test a string for a given value is to use the equals method of
the String class:
    
        if (answer.equals("Yes")) {
            System.out.println("You said yes.");
        }   

This method actually compares the value of the string object referenced by the
variable with the string you pass as a parameter and returns a Boolean result to
indicate whether the strings have the same value.

The String class has another method, equalsIgnoreCase, that’s also useful for
comparing strings. It compares strings but ignores case, which is especially useful
when you’re testing string values entered by users. Suppose that you’re writing
a program that ends only when the user enters the word end. You could use the
equals method to test the string:
    
    if (answer.equals("end")) {
        System.out.println("Goodbye.");
        System.exit(0);
    }

In this case, however, the user would have to enter end exactly. If the user enters
End or END, the program won’t end. It’s better to code the if statement like this:
    
    if (answer.equalsIgnoreCase("end")) {
        System.out.println("Goodbye.");
        System.exit(0);
    }

Then the user could end the program by entering the word end spelled with any
variation of upper- and lowercase letters, including end, End, END, or even eNd.
 */