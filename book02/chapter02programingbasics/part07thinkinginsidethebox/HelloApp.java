package book02.chapter02programingbasics.part07thinkinginsidethebox;

public class HelloApp {
   public static void main(String[] args) {
      // Boxing feature occurs when Java automatically converts a primitive type to its 
      // corresponding wrapper class and unboxing occurs when Java automatically converts a
      // wrapper class to its corresponding primitive type. You don't have to explicitly cast
      // the primitive type to its corresponding wrapper class or vice versa.
      Integer wrap = 10; // Boxing
      System.out.println(wrap); // 10 
      int prim = wrap; // Unboxing
      System.out.println(prim); // 10
   }
}
