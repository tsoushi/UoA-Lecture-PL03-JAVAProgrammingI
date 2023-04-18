class SimpleList {
    private SimpleNode nil;

    SimpleList() {
        init();
    }

    void init() {
        nil = new SimpleNode();
        nil.setNext(nil);
        nil.setPrev(nil);
    }

    SimpleNode listSearch(int key) {
        for (SimpleNode p = nil.getNext(); p != nil; p = p.getNext()) {
            if (p.getKey() == key) return p;
        }

        return nil;
    }

    void printList() {
        for (SimpleNode p = nil.getNext(); p != nil; p = p.getNext()) {
            if (p != nil.getNext()) System.out.print(" ");
            System.out.print(p.getKey());
        }
        System.out.println();
    }

    void delete(int key) {
        SimpleNode node = listSearch(key);

        if (node != nil) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.setPrev(null);
            node.setNext(null);
        }
    }

    void insert(int key) {
        SimpleNode node = new SimpleNode(key);
        nil.getNext().setPrev(node);
        node.setNext(nil.getNext());
        node.setPrev(nil);
        nil.setNext(node);
    }
}