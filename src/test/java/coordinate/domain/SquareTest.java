package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    @DisplayName("사각형 넓이 구하기")
    void v1() {
        ArrayList<Point> points = new ArrayList<>(Arrays.asList(
                new Point(2, 2), new Point(4, 2),
                new Point(2, 4), new Point(4, 4)));
        Square square = new Square(points);
        Assertions.assertThat(square.getSquareArea()).isEqualTo(4);
    }

}