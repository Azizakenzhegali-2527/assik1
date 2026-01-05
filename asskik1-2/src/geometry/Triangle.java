package geometry;

public class Triangle
{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle ()
    {
        this.p1 = new Point(0,0);
        this.p2 = new Point(1,0);
        this.p3 = new Point(0,1);
    }

    public Triangle(Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getPerimeter()
    {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public double getArea()
    {
        return Math.abs(
                p1.getX() * (p2.getY() - p3.getY())+
                p2.getX() * (p3.getY() - p1.getY())+
                p3.getX() * (p1.getY() - p2.getY())) / 2;
    }
}

