public class Point {
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
        if (Math.abs(this.x + dx) > 100 || Math.abs(this.y + dy) > 100) return;

        this.x += dx;
        this.y += dy;
    }
}
