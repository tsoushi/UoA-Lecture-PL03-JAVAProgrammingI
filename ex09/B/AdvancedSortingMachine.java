class AdvancedSortingMachine extends SortingMachine {
    public AdvancedSortingMachine(Strategy s) {
        super(s);
    }

    public void sort(int[] data) {
        long beginTime = System.currentTimeMillis();
        super.sort(data);
        System.out.println(System.currentTimeMillis() - beginTime);
    }
}