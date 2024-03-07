package book03objectorientedprogramming.chapter_04_using_subclasses_and_inheritance.part_02_creating_subclasses;

public class Ball {
    private int size;
    private double weight;

    public Ball(int size, double weight) {
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public void throwBall() {
        System.out.println("The ball is thrown");
    }
}
