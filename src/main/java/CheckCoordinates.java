import java.util.Scanner;

public class CheckCoordinates {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Point[] points = createPoints();
        for (Point point : points) {
            circle.contains(point);
        }
    }

    static Point pointInput() {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        double coordinateX = x.nextDouble();
        double coordinateY = y.nextDouble();
        return new Point(coordinateX, coordinateY);
    }

    public static Point[] createPoints() {
        Point[] points = new Point[2];
        for (int i = 0; i < points.length; i++) {
            System.out.println("Введите координаты точки " + (i + 1) + ":");
            points[i] = pointInput();
        }
        return points;
    }
}

