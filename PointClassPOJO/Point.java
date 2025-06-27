public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;

        return Math.sqrt(dx * dx + dy *dy);
    }
    public double distance(int x, int y) {
        int dx = this.x -  x;
        int dy = this.y -  y;

        return Math.sqrt(dx * dx + dy *dy);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
