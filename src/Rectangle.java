public class Rectangle extends Figure implements Areaable {
    public Rectangle() {

    }
    public Rectangle(Point2D p1, Point2D p2) {
        super(p1, p2);
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public double getContour() {
        return 2.0 * (getWidth() + getHeight());
    }

    @Override
    public void draw() {
        System.out.println("this is a Rectangle \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
    }
}