package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class Line {
    ArrayList<Point> points;

    public Line(ArrayList<Point> points) {
        this.points = points;
    }

    public double getPointLength() {
        Point pointA = points.get(0);
        Point pointB = points.get(1);
        return Math.sqrt(pow(pointA.getX() - pointB.getX(), 2) + pow(pointA.getY() - pointB.getY(), 2));
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

}
