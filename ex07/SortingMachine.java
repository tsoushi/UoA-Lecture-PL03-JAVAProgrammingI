public class SortingMachine {
    public void sort(Relatable[] array) {
        // bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j].isSmallerThan(array[j - 1])) {
                    Relatable buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                }
            }
        }
    }
}
