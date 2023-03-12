package coordinate.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Square {

    ArrayList<Point> points;

    public int getSquareArea() {
        List<Integer> lengthArr = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            int pointLength = (int) new Line(new ArrayList<Point>(Arrays.asList(points.get(0), points.get(i)))).getPointLength();
            lengthArr.add(pointLength);
        }
        Collections.sort(lengthArr);
        return lengthArr.get(0) * lengthArr.get(1);
    }

    public Square(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
}
