import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public Shape(Point[] points) {
        for (Point point : points) {
            this.points.add(point);
        }
    }

    public void addPoint(Point point) {
        points.add(point);
    }
}
public double perimeter() {
            public double calculatePerimeter() {
                double perimeter = 0;
                for (int i = 0; i < points.length - 1; i++) {
                    perimeter += points[i].distanceTo(points[i + 1]);
                    int size = points.size();
                    for (int i = 0; i < size; i++) {
                        Point currentPoint = points.get(i);
                        Point nextPoint = points.get((i + 1) % size);
                        perimeter += currentPoint.distance(nextPoint);
                    }
                    perimeter += points[points.length - 1].distanceTo(points[0]);
                    return perimeter;
                }
            }
                public double averageSide() {
                double totalSideLength = 0;
                for (int i = 0; i < points.length - 1; i++) {
                    totalSideLength += points[i].distanceTo(points[i + 1]);
                    totalSideLength += points[points.length - 1].distanceTo(points[0]);
                    return totalSideLength / points.length; } }

                public double getLongestSide() {
                    double longestSide = 0;
                    for (int i = 0; i < points.size(); i++) {
                        Point currentPoint = points.get(i);
                        Point nextPoint = points.get((i + 1) % points.size());
                        double currentSide = currentPoint.distance(nextPoint);
                        if (currentSide > longestSide) {
                            longestSide = currentSide;
                        }

                    }
                    return longestSide;
                }
