package geometry;

public class Circle
{
    private double x;
    private double y;
    private double radius;

    public Circle()
    {
        x=0;
        y=0;
        radius = 1;
    }

    public Circle(double x, double y , double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX()
    {
        return x;
    }


    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        return radius;
    }

    public boolean contains(double x, double y )
    {
        double dx = x - this.x;
        double dy = y- this.y;
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance <= radius;
    }


    public boolean contains(Circle circle)
    {
        double dx = circle.x - this.x;
        double dy = circle.y - this.y;
        double distance = Math.sqrt(dx*dx - dy*dy);
        return distance + circle.radius <= radius;
    }

    public boolean overlaps(Circle circle)
    {
        double dx = circle.x - this.x;
        double dy = circle.y - this.y;
        double distance = Math.sqrt( dx*dx - dy*dy);
        return distance < radius + circle.radius;

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
