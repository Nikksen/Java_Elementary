import java.util.Scanner;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

class Circle {
    Point center;
    private double rad;

    public Circle() {
        System.out.println("Введите центр круга:");
        this.center = CheckCoordinates.pointInput();
        System.out.println("Введите радуис круга:");
        Scanner radius = new Scanner(System.in);
        this.rad = radius.nextDouble();
    }

    public double distance(Point p2) {
        return sqrt(pow(center.getX() - p2.getX(), 2) + pow(center.getY() - p2.getY(), 2));
    }

    public void contains(Point point) {
        double dist = distance(point);
         if (dist < rad){
             System.out.println("Точки которые попали " + (point.getX()) + " " + (point.getY()) );
         }
    }

}
