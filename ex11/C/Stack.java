public class Stack {
    private int[] data;
    private int top = 0;
    
    public Stack(int maxSize) {
        data = new int[maxSize];        
    }

    public boolean isEmpty() {
        return top == 0;
    }
    
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return data[--top];
    }

    public void push(int value) throws StackOverflowException {
        if (top == data.length) {
            throw new StackOverflowException(value);
        }
        data[top++] = value;
    }
}
