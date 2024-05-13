package Registry;

public class Counter implements AutoCloseable{
    static int count = 0;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed");

    }
}
