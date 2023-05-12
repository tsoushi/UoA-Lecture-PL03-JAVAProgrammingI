public class BubbleSort implements Strategy {
    public void sort(int[] data) {
        // bubble sort
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[j] < data[j - 1]) {
                    int buf = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = buf;
                }
            }
        }
    }
}
