package book02.chapter05usingloops.part04forloop;

public class LaunchControl {
    public static void main(String[] args) {
        System.out.print("We are go for launch in T minus ");
        for (int i = 10; i >= 0; i--) {
            if (i == 8) {
                System.out.println("Ignition sequence start!");
            } else {
                System.out.println(i + "...");
            }
        }
        System.out.println("All engines running!\nLiftoff! We have a liftoff!");
    }
}
