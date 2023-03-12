package coordinate.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle {

    ArrayList<Point> points;

    public String getTriangleArea() {
        Point pointA = points.get(0);
        Point pointB = points.get(1);
        Point pointC = points.get(2);

        double heron = heron(initLine(pointA, pointB).getPointLength(), initLine(pointB, pointC).getPointLength(), initLine(pointC, pointA).getPointLength());
        String strNum = String.format("%.1f", heron);
        return strNum;
    }

    private static Line initLine(Point pointA, Point pointB) {
        return new Line(new ArrayList<>(Arrays.asList(pointA, pointB)));
    }

    private double heron(double a, double b, double c) {
        return 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
    }
    public Triangle(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

}
