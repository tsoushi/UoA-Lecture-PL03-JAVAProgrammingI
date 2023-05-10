public class YXComparator implements PointComparator {
    public int compare(Point p1, Point p2) {
        if (p1.getY() < p2.getY()) return -1;
        else if (p1.getY() == p2.getY()) {
            if (p1.getX() < p2.getX()) return -1;
            else if (p1.getX() == p2.getX()) return 0;
            else return 1;
        } else return 1;
    }
}
