public class GasStation {
    private int laneNum;
    private Queue[] laneQueues;

    public GasStation(int laneNum) {
        this.laneNum = laneNum;

        laneQueues = new Queue[laneNum];
        for (int i = 0; i < laneNum; i++) {
            laneQueues[i] = new Queue();
        }
    }

    // 新規車を受け入れ
    public void carEnter(int carID) {
        laneQueues[getShortestLane()].enqueue(carID);
    }

    // 指定したレーンの先頭の給油を終了、車IDを返す
    public int finishRefueling(int laneID) {
        return laneQueues[laneID].dequeue();
    }

    // 最も列が短いレーンのIDを検索する
    private int getShortestLane() {
        int shortestLane = 0;
        for (int i = 1; i < laneNum; i++) {
            if (laneQueues[i].getSize() < laneQueues[shortestLane].getSize()) {
                shortestLane = i;
            }
        }

        return shortestLane;
    }
}
