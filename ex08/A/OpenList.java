public abstract class OpenList {
    protected final int MAX_SIZE = 1000;
    protected int data[] = new int[MAX_SIZE];

    public abstract boolean isEmpty();

    public abstract int pop();
    public abstract void push(int value);
}
