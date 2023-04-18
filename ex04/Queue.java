public class Queue {
    private SimpleNode nil;
    private int size = 0;

    Queue() {
        init();
    }

    void init() {
        nil = new SimpleNode();
        nil.setNext(nil);
        nil.setPrev(nil);
    }

    int dequeue() {
        SimpleNode node = nil.getPrev();
        if (node != nil) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.setPrev(null);
            node.setNext(null);

            size--;
            return node.getKey();
        }

        return -1;
    }

    void enqueue(int key) {
        SimpleNode node = new SimpleNode(key);
        nil.getNext().setPrev(node);
        node.setNext(nil.getNext());
        node.setPrev(nil);
        nil.setNext(node);

        size++;
    }

    int getSize() {
        return size;
    }
}
