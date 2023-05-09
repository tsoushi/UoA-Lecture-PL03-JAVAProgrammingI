class Quadrangle extends Shape {
    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        P = new Point[4];
        P[0] = p1;
        P[1] = p2;
        P[2] = p3;
        P[3] = p4;
    }

    public void print() {
        super.print();
        for (int i = 0; i < 4; i++) {
            if (i != 0) System.out.print("-");
            System.out.printf("(%d, %d)", P[i].getX(), P[i].getY());
        }
        System.out.println();
    }
}