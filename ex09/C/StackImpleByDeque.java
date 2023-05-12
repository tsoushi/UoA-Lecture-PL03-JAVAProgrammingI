class StackImplByDeque implements Stack {
    private Deque deque;

    StackImplByDeque() {
        this.deque = new DequeImplByDLL();
    }

    public void push(int x) { deque.insertBack(x); }

    public int pop() {
        int value = deque.back();
        deque.removeBack();
        return value;
    }

    public int top() { return deque.back(); }

    public int size() { return deque.size(); }

    public boolean empty() { return deque.empty(); }
}