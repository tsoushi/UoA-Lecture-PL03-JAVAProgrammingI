public class TwirlingRobot {
    private int x = 0;
    private int y = 0;
    private int dir = 0;

    public void initialize(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void turnLeft() {
        dir = (4 + dir - 1) % 4;
    }

    public void turnRight() {
        dir = (dir + 1) % 4;
    }

    public void move() {
        if (dir == 0 && y > -4) y--;
        else if (dir == 1 && x < 4) x++; 
        else if (dir == 2 && y < 4) y++; 
        else if (dir == 3 && x > -4) x--; 
    }

    public void move(int dx, int dy) {
        if (Math.abs(x + dx) > 100 || Math.abs(y + dy) > 100) return;

        x += dx;
        y += dy;
    }

    public void printLocation() {
        System.out.printf("(%d, %d)\n", x, y);
    }
}
