public class PolyLine extends Figure{
    Point2D[] points;

    public PolyLine(Point2D point2D, Point2D d) {
    }

    public PolyLine(Point2D[] points) {
        this.points = points;
    }

    public PolyLine(Point2D p1, Point2D p2, Point2D[] points) {
        super(p1, p2);
        this.points = points;
    }
    @Override
    public double getContour() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("this is a Polyline |\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
    }
}
