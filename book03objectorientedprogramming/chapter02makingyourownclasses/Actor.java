package book03objectorientedprogramming.chapter02makingyourownclasses;

public class Actor {
    private String lastName;
    private String firstName;
    private boolean goodActor;

    public Actor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Actor(String lastName, String firstName, boolean goodActor) {
        this(lastName, firstName);
        this.goodActor = goodActor;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void display() {
        System.out.println(this);
    }

    // @Override
    // public String toString() {
    //     String goodActor = this.goodActor ? "good" : "bad";
    //     return "His full name is " + firstName + " " + lastName 
    //             + ". He is a " + goodActor + " actor.";
    // }
}
