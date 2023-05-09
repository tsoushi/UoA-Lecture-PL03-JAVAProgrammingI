public class Circle extends Shape {
    private int r;

    public Circle(Point p, int r) {
        P = new Point[1];

        P[0] = p;
        this.r = r;
    }

    public void print() {
        super.print();
        System.out.printf("(%d, %d) radius = %d\n", P[0].getX(), P[0].getY(), r);
    }
}
