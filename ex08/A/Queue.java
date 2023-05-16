import java.util.ArrayList;
import java.util.List;

public class Queue implements OpenList {
    List<Integer> data = new ArrayList<Integer>();

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int pop() {
        int value = data.get(0);
        data.remove(0);
        return value;
    }

    public void push(int value) {
        data.add(value);
    }
}
