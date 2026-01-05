package geometry;

import java.security.PublicKey;

public class Point
{
    private double x;
    private double y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance( Point p)
    {
        return Math.sqrt((x - p.x) * ( x - p.x ) + (y-p.y) * (y-p.y)) ;
    }

    public double distance(double x, double y)
    {
        return Math.sqrt((this.x - x) * (this.x - x) + ( this.y - y) * ( this.y - y));
    }
}
