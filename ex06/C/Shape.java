abstract class Shape {
    protected Point P[];

    public void print() {
        System.out.print(this.getClass().getName() + ": ");
    }

    public void move(int dx, int dy) {
        for (int i = 0; i < P.length; i++) {
            P[i].setX(P[i].getX() + dx);
            P[i].setY(P[i].getY() + dy);
        }
    }
}