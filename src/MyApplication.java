import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyApplication {
    public static void main(String[] args) {
        Point[] points = new Point[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new Point(Math.random() * 10, Math.random() * 10);
            public static void main(String[] args) throws FileNotFoundException {
                File file = new File("C:\\Users\\alish\\IdeaProjects\\alisher2305d\\src\\source.text");
                Scanner sc = new Scanner(file);
                Shape shape = new Shape();
                Point firstPoint = null;
                Point previousPoint = null;
                while (sc.hasNext()) {
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    Point point = new Point(x, y);
                    shape.addPoint(point);
                    if (previousPoint != null) {
                        double distance = previousPoint.distance(point);
                        System.out.println("Distance between " + previousPoint + " and " + point + " = " + distance);
                    } else {
                        firstPoint = point;
                    }
                    previousPoint = point;
                }
                Shape myShape = new Shape(points);
                if (previousPoint != null && firstPoint != null) {
                    double distance = previousPoint.distance(firstPoint);
                    System.out.println("Distance between " + previousPoint + " and " + firstPoint + " = " + distance);
                }
                System.out.println("Perimeter: " + myShape.perimeter());
                System.out.println("Longest Side: " + myShape.longestSide());
                System.out.println("Average Side: " + myShape.averageSide());
                //OUTPUT
                System.out.println("Perimeter: " + shape.calculatePerimeter());
                System.out.println("Average side: " + shape.getAverageSide());
                System.out.println("Longest side: " + shape.getLongestSide());
            }
        }
