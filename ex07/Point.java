class Point implements Relatable{
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void print() {
        System.out.printf("(%d, %d)\n", x, y);
    }

    public boolean isSmallerThan(Relatable other) {
        Point point = (Point)other;

        if (x < point.x) return true;
        else if (x == point.x && y < point.y) return true;
        else return false;
    }
}