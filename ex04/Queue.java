public class Queue<T> {
    private QueueNode<T> nil;

    Queue() {
        init();
    }

    void init() {
        nil = new QueueNode<T>();
        nil.setNext(nil);
        nil.setPrev(nil);
    }

    QueueNode<T> listSearch(T key) {
        for (QueueNode<T> p = nil.getNext(); p != nil; p = p.getNext()) {
            if (p.getKey() == key) return p;
        }

        return nil;
    }
 
    void printList() {
        for (QueueNode<T> p = nil.getNext(); p != nil; p = p.getNext()) {
            if (p != nil.getNext()) System.out.print(" ");
            System.out.print(p.getKey());
        }
        System.out.println();
    }

    void delete(T key) {
        QueueNode<T> node = listSearch(key);

        if (node != nil) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.setPrev(null);
            node.setNext(null);
        }
    }

    void insert(T key) {
        QueueNode<T> node = new QueueNode<T>(key);
        nil.getNext().setPrev(node);
        node.setNext(nil.getNext());
        node.setPrev(nil);
        nil.setNext(node);
    }
}
