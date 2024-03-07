package book_03_object_oriented_programming.chapter_03_working_with_statics.couting_instances;

public class CountTest {
    private static int instanceCount = 0;

    public CountTest() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
