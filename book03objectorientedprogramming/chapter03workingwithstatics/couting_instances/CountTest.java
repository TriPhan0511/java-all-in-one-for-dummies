package book03objectorientedprogramming.chapter03workingwithstatics.couting_instances;

public class CountTest {
    private static int instanceCount = 0;

    public CountTest() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
