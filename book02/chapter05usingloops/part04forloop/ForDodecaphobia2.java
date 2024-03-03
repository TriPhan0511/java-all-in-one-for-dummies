package book02.chapter05usingloops.part04forloop;

public class ForDodecaphobia2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            if (i == 12) {
                // break;
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
