package coordinate.view;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Square;
import coordinate.domain.Triangle;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static void main(ArrayList<Point> points) {
        printVerticalY(points);
        printHorizonX();
    }

    public void initNotice() {
        System.out.println("좌표를 입력해주세요.");
    }

    public static void printVerticalY(ArrayList<Point> points) {
        for (int i = Point.MAX_NUM; i > Point.MIN_NUM; i--) {
            if (i % 2 == 0) {
                System.out.printf("%3d|",i);
                printPoint(points, i);
            } else if (i % 2 == 1) {
                System.out.printf("%4s","|");
                printPoint(points, i);
            }
        }
    }

    private static void printPoint(ArrayList<Point> points, int yPoint) {
        int nowX = 0;
        for (Point point : points) {
            if (point.getY() == yPoint) {
                System.out.printf(new String(new char[point.getX()-nowX]).replace("\0", "    "));
                System.out.printf("*");
                nowX = point.getX();
            }
        }
        System.out.println();
    }

    public static void printHorizonX() {
        System.out.printf("   +");
        System.out.println(new String(new char[24]).replace("\0","ㅡㅡㅡ"));
        System.out.printf("  ");
        printXNumber();
    }

    private static void printXNumber() {
        for (int i = Point.MIN_NUM; i <= Point.MAX_NUM; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d       ", i);
            }
        }
        System.out.println();

    }

    public static void printLineResult(Line line) {
        System.out.print("  두 점 사이의 거리는  ");
        System.out.println(line.getPointLength());
    }

    public static void printSquareResult(Square square) {
        System.out.print("사각형 넓이는 ");
        System.out.println(square.getSquareArea());
    }

    public static void printTriangleResult(Triangle triangle) {
        System.out.print("삼각형 넓이는 ");
        System.out.println(triangle.getTriangleArea());
    }
}
