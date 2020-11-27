import java.util.Arrays;

public class PointList {
    Point[] points = new Point[4];
    private int count = 0; //Кол-во элементов в массиве

    public void add(Point p) {
        count++;
        if (count > points.length) {
            points = Arrays.copyOf(points, (int) (points.length * 1.5));
        }
        points[count - 1] = p;
    }

    public Point get(int i) {
        checkExistsIndex(i);
        return points[i];
    }

    public void set(int i, Point p) {
        checkExistsIndex(i);
        this.points[i] = p;
    }

    public void remove(int index) {
        checkExistsIndex(index);
        Point[] buffer = new Point[points.length - 1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = points[i < index ? i : i + 1];
        }
        points = buffer;
    }

    private void checkExistsIndex(int index) {
        if (index >= points.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return count;
    }
}

