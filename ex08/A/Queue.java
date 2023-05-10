public class Queue extends OpenList {
    int head = 0;
    int tail = 0;

    public boolean isEmpty() {
        return head == tail;
    }

    public int pop() {
        int value = data[head];
        head = ++head % MAX_SIZE;
        return value;
    }

    public void push(int value) {
        data[tail] = value;
        tail = ++tail % MAX_SIZE;
    }
}
