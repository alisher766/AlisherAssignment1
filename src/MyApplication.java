import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        Point[] points = new Point[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new Point(Math.random() * 10, Math.random() * 10);
        }
        Shape shape = new Shape();
        File file = new File("C:\\Users\\alish\\IdeaProjects\\alisher2305d\\src\\source.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            shape.addPoint(new Point(x, y));
        }
        sc.close();
        System.out.println("Distances between consecutive points:");
        for (int i = 0; i < shape.getNumberOfPoints() - 1; i++) {
            Point currentPoint = shape.getPoint(i);
            Point nextPoint = shape.getPoint(i + 1);
            double distance = currentPoint.distanceTo(nextPoint);
            System.out.println("Distance between " + currentPoint + " and " + nextPoint + " = " + distance);
        }
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }
}
