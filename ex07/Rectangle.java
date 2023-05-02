public class Rectangle implements Relatable{
    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public int getArea() {
        return (upperLeft.getX() - bottomRight.getX()) * (upperLeft.getY() - bottomRight.getY());
    }

    public boolean isSmallerThan(Relatable other) {
        Rectangle rect = (Rectangle)other;

        return getArea() < rect.getArea();
    }
}
