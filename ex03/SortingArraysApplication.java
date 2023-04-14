class SortingArraysApplication {
    public static void main(String[] args) {
        int[][] arrays = {
                { 3, 2, 1 },
                { 9, 7, 10, 4, 8, 2, 5, 3, 1, 6 },
                { 7, 2, 3, 2, 2, 1, 1, 1 },
                { 2, 1 },
                { 100 },
                { 888888888, -888888888 }
        };

        // bubble sort
        for (int index = 0; index < arrays.length; index++) {
            int[] array = arrays[index];

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int buf = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = buf;
                    }
                }
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(" " + arrays[i][j]);
            }
            System.out.println();
        }
    }
}