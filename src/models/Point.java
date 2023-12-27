public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point destination) {
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        public double distance(Point dest) {
            double dx = this.x - dest.x;
            double dy = this.y - dest.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }