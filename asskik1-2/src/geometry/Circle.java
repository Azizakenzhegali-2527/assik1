package geometry;

public class Circle
{
    private Point center;
    private double radius;

    public Circle()
    {
        this.center = new Point(0,0);
        this.radius = 1;
    }

    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius*radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
