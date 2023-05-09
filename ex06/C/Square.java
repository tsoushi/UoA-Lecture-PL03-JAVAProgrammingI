public class Square extends Rectangle {
    public Square(Point p, int w) {
        super(
            p,
            new Point(p.getX() + w, p.getY() + w)
        );
    }
}
