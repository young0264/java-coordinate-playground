package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {


    @Test
    @DisplayName("좌표 범위 검증")
    void v1() {
        Assertions.assertThatThrownBy(() -> {
            Point point = new Point(1, 25);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("두 점의 길이 구하기")
    void v2() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(7, 10));
        points.add(new Point(5, 12));
        Line line = new Line(points);
        double pointLength = line.getPointLength();
        Assertions.assertThat(pointLength).isEqualTo(2.828427, Offset.offset(0.000001));
    }


}