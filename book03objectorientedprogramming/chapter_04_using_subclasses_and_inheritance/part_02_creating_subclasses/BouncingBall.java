package book03objectorientedprogramming.chapter_04_using_subclasses_and_inheritance.part_02_creating_subclasses;

public class BouncingBall extends Ball {
    private String color;

    public BouncingBall(int size, double weight) {
        super(size, weight);
    }

    public BouncingBall(int size, double weight, String color) {
        this(size, weight);
        this.color = color;
    }
    
    public void bounce() {
        System.out.println("The ball bounces");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "BouncingBall{" 
            + "size=" + getSize() 
            + ", weight=" + getWeight() + '}';
    }
}
