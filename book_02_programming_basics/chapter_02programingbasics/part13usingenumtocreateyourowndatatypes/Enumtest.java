package book_02_programming_basics.chapter_02programingbasics.part13usingenumtocreateyourowndatatypes;

/**
 * Enumtest
 */
public class Enumtest {

    public enum CardSuite {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS
    }
    public static void main(String[] args) {
        CardSuite suite = CardSuite.DIAMONDS;
        // CardSuite suite = CardSuite.HEARTS;
        if (suite == CardSuite.HEARTS) {
            System.out.println("My favorite suite is hearts");
        } else if (suite == CardSuite.SPADES) {
            System.out.println("My favorite suite is spades");
        } else if (suite == CardSuite.CLUBS) {
            System.out.println("My favorite suite is clubs");
        } else if (suite == CardSuite.DIAMONDS) {
            System.out.println("My favorite suite is diamonds");
        } else {
            System.out.println("I don't have a favorite suite");
        }
    }
}

// public class Enumtest {
//     enum Color {
//         RED,
//         GREEN,
//         BLUE
//     }

//     public static void main(String[] args) {
//         // Color myColor = Color.GREEN;
//         Color myColor = Color.RED;

//         // if (myColor == Color.RED) {
//         //     System.out.println("My favorite color is red");
//         // } else if (myColor == Color.GREEN) {
//         //     System.out.println("My favorite color is green");
//         // } else if (myColor == Color.BLUE) {
//         //     System.out.println("My favorite color is blue");
//         // } else {
//         //     System.out.println("I don't have a favorite color");
//         // }
        
//         switch (myColor) {
//             case RED:
//                 System.out.println("My favorite color is red");
//                 break;
//             case GREEN:
//                 System.out.println("My favorite color is green");
//                 break;
//             case BLUE:
//                 System.out.println("My favorite color is blue");
//                 break;
//             default:
//                 System.out.println("I don't have a favorite color");
//                 break;
//         }
//     }
// }
