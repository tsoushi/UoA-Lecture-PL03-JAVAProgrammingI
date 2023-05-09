class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Point p) {
        if (x == p.x && y == p.y) return true;
        return false;
    }
}

class EqualPointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        if (p1 == p2) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }
        if (p1.equals(p2)) {
            System.out.println("p1 and p2 is equal");
        } else {
            System.out.println("p1 and p2 is not equal");
        }
    }
}