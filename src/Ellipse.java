public class Ellipse extends Figure implements Areaable {
    public Ellipse () {
    }

    public Ellipse(Point2D p1, Point2D p2) {
        super(p1, p2);
    }

    @Override
    public double getContour() {
        return 2.0 * (Math.PI * getWidth() * getHeight()
                       + (getWidth() - getHeight()) * (getWidth() - getHeight()))
                          / (getWidth() + getHeight());
    }

    @Override
    public void draw() {
        System.out.println("this is an Ellipse ooooooooooooooooooo");
    }

    @Override
    public double getArea() {
        return Math.PI * getHeight() * getWidth() / 4.0;
    }
}
