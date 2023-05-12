public class QueueImplByDeque implements Queue {
    private Deque deque;

    QueueImplByDeque() {
        this.deque = new DequeImplByDLL();
    }

    public void enqueue(int key) { deque.insertBack(key); }

    public int dequeue() {
        int value = deque.front();
        deque.removeFront();
        return value;
    }

    public int front() { return deque.front(); }

    public int size() { return deque.size(); }

    public boolean empty() { return deque.empty(); }
}
