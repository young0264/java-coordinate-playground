package coordinate.view;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Square;
import coordinate.domain.Triangle;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class InputView {


    private ArrayList<Point> inputInit() {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        ArrayList<Point> points = new ArrayList<>();

        for (String strPoint : inputStr.split("-")) {
            int length = strPoint.length();

            List<String> strPointList = deleteMarks(strPoint, length);
            List<Integer> intPointList = strToIntList(strPointList);
            points.add(new Point(getX(intPointList), getY(intPointList)));
        }
        sortForPoints(points);
        return points;
    }

    private static void sortForPoints(ArrayList<Point> points) {
        points.sort(Comparator.comparing(Point::getY).reversed()
                .thenComparing(Point::getX));
    }

    public Line lineInit() {
        ArrayList<Point> points = inputInit();
        return new Line(points);
    }

    public Square squareInit() {
        ArrayList<Point> points = inputInit();
        return new Square(points);
    }

    public Triangle triangleInit() {
        ArrayList<Point> points = inputInit();
        return new Triangle(points);
    }


    private static List<String> deleteMarks(String strPoint, int length) {
        return Arrays.asList(strPoint.substring(1, length - 1).split(","));
    }

    private static List<Integer> strToIntList(List<String> strPointList) {
        List<Integer> intPointList = strPointList.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        return intPointList;
    }

    private static Integer getY(List<Integer> intPointList) {
        return intPointList.get(1);
    }

    private static Integer getX(List<Integer> intPointList) {
        return intPointList.get(0);
    }

}
