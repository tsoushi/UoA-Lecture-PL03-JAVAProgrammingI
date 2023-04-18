public class SimpleNode {
    private SimpleNode next;
    private SimpleNode prev;
    private int key;

    public SimpleNode() {
    }

    public SimpleNode(int key) {
        this.key = key;
    }


    public void setNext(SimpleNode next) {
        this.next = next;
    }

    public void setPrev(SimpleNode prev) {
        this.prev = prev;
    }

    public SimpleNode getNext() {
        return next;
    }

    public SimpleNode getPrev() {
        return prev;
    }

    public int getKey() {
        return key;
    }
}
