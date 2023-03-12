package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class TriangleTest {

    @Test
    @DisplayName("삼각형 넓이 구하기")
    void v1() {

        ArrayList<Point> points = new ArrayList<>(Arrays.asList(
                new Point(2, 2), new Point(5, 2), new Point(2, 5)));

        Triangle triangle = new Triangle(points);
        Assertions.assertThat(Double.parseDouble(triangle.getTriangleArea())).isEqualTo(4.5);
    }

}