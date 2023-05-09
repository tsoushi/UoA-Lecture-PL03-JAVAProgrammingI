public class Parallelogram extends Quadrangle {
    public Parallelogram(Point p1, Point p2, int w) {
        super(
            p1,
            new Point(p1.getX() + w, p1.getY()),
            p2,
            new Point(p2.getX() - w, p2.getY())
        );
    }
}
