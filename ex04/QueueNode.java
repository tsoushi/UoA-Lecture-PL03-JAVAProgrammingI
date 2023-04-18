public class QueueNode<T> {
    private QueueNode<T> next;
    private QueueNode<T> prev;
    private T key;

    public QueueNode() {
        
    }

    public QueueNode(T key) {
        this.key = key;
    }


    public void setNext(QueueNode<T> next) {
        this.next = next;
    }

    public void setPrev(QueueNode<T> prev) {
        this.prev = prev;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public QueueNode<T> getPrev() {
        return prev;
    }

    public T getKey() {
        return key;
    }
}
