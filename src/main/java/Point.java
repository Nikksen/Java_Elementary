import java.util.Scanner;

public class Point {
    private double x;
    private double y;
    Point[] points = new Point[2];

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPoints() {
        for (int i = 0; i < points.length; i++) {
            System.out.println("Введите координаты точек: ");
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            double x = sc1.nextDouble();
            double y = sc2.nextDouble();
            points[i] = new Point(x, y);
        }
    }

}



