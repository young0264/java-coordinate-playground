package coordinate;

import java.util.*;
import java.util.function.Function;

public class FigureFactory implements FigureCreator{
    private static final Map<Integer, Function<List<Point>, Figure>> classifier = new HashMap<>();
    static Figure getInstance(List<Point> points) {
        if (points.size() == Line.LINE_POINT_SIZE) {
            return new Line(points);
        }

        if (points.size() == Triangle.TRIANGLE_POINT_SIZE) {
            return new Triangle(points);
        }

        if (points.size() == Rectangle.RECTANGLE_POINT_SIZE) {
            return new Rectangle(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }

    @Override
    public Figure create(List<Point> points) {
        classifier.put(Line.LINE_POINT_SIZE, Line::new);
        classifier.put(Triangle.TRIANGLE_POINT_SIZE, Triangle::new);
        classifier.put(Rectangle.RECTANGLE_POINT_SIZE, Rectangle::new);

        return classifier.get(points.size()).apply(points);
    }
}
