package book02.chapter08handlingexceptions.part04throwingyourownexceptions;

public class MyException {
    public static void main(String[] args) {
        try {
            doSomething(true);
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    public static void doSomething(boolean b) 
            throws Exception {
        if (b) {
            throw new Exception();
        }
    }    
}
