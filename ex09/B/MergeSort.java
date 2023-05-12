public class MergeSort implements Strategy {
    public void sort(int[] data) {
        // merge sort
        mergeSort(data, 0, data.length);
    }

    private void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
    
        for (int i = 0; i < n1; i++) L[i] = A[left + i];
        for (int i = 0; i < n2; i++) R[i] = A[mid + i];
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
    
        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }
    
    private void mergeSort(int[] array, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid, right);
            merge(array, left, mid, right);
        }
    }
}
