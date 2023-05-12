public class SelectionSort implements Strategy {
    public void sort(int[] data) {
        // selection sort
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;

            for (int j = i; j < data.length; j++)
                if (data[j] < data[minIndex]) minIndex = j;
            
            if (i != minIndex) {
                int buf = data[i];
                data[i] = data[minIndex];
                data[minIndex] = buf;
            }
        }
    }
}
