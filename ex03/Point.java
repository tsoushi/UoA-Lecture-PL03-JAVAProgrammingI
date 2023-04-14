public class Point {
    public static int X_MIN;
    public static int X_MAX;
    public static int Y_MIN;
    public static int Y_MAX;

    private int x = 0;
    private int y = 0;

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void move(int dx, int dy) {
        if (x + dx >= X_MIN && x + dx <= X_MAX && y + dy >= Y_MIN && y + dy <= Y_MAX) {
            this.x += dx;
            this.y += dy;    
        }
    }
}
