import java.util.Scanner;

public class CheckCoordinates {
    static double coordinateX;
    static double coordinateY;
    static double rad;

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner radius = new Scanner(System.in);
        Circle circle = new Circle(coordinateX,coordinateY,rad);
        coordinateX = x.nextDouble();
        coordinateY = y.nextDouble();
        rad = radius.nextDouble();
        Point points = new Point();
        points.setPoints();


    }
}

