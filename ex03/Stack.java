public class Stack {
    private int[] stack = new int[100];
    private int top = 0;

    public void push(int value) {
        stack[top++] = value;
    }

    public int pop() {
        return stack[--top];
    }
}
