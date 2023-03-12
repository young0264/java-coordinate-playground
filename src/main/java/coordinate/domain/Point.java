package coordinate.domain;

public class Point {

    public static final int MIN_NUM = 0;
    public static final int MAX_NUM = 24;
    private int x;
    private int y;
    public Point(int x, int y) {
        isValidPoint(x, y);
        this.x = x;
        this.y = y;

    }

    private static boolean isValidPoint(int x, int y) {
        if (x > 24 || y > 24 || x <0 || y <0) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
