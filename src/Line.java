public class Line extends  Figure {

    public Line () {
        p1 = new Point2D();
        p2 = new Point2D();
    }


    public Line(Point2D p1, Point2D p2) {
        super(p1 , p2);
    }




    @Override
    public double getContour() {
        return Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight());
    }

    @Override
    public void draw() {
        System.out.println("this is a Line -------------------------------------------------");
    }
}
