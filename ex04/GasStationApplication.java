import java.util.Scanner;

public class GasStationApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int laneNum = sc.nextInt();
        int commandNum = sc.nextInt();

        GasStation gasStation = new GasStation(laneNum);
        for (int i = 0; i < commandNum; i++) {
            int command = sc.nextInt();

            if (command == 0) {
                int carID = gasStation.finishRefueling(sc.nextInt() - 1);
                System.out.println(carID);
            } else if (command == 1) {
                gasStation.carEnter(sc.nextInt());
            }
        }

        sc.close();
    }
}
