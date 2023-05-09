public class Rectangle extends Quadrangle {
    public Rectangle(Point p1, Point p2) {
        super(
            p1,
            new Point(p2.getX(), p1.getY()),
            p2,
            new Point(p1.getX(), p2.getY())
        );
    }
}
