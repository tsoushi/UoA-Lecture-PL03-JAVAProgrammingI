public class Stack extends OpenList {
    private int top = 0;
    
    public boolean isEmpty() {
        return top == 0;
    }
    
    public int pop() {
        return data[--top];
    }

    public void push(int value) {
        data[top++] = value;
    }
}
