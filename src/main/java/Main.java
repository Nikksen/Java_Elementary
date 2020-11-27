public class Main {

    public static void main(String[] args) {
        PointList pointList = new PointList();
        pointList.add(new Point(1, 5));
        pointList.add(new Point(2, 6));
        pointList.add(new Point(3, 5));
        pointList.add(new Point(4, 5));



        for (int i = 0; i < pointList.size(); i++) {
            System.out.println(pointList.get(i));
        }
        System.out.println(pointList.size());
    }
}

