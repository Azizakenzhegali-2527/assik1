package geometry;

import java.util.PrimitiveIterator;

public class Rectangle
{
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Rectangle()
    {
        p1 = new Point(0,0);
        p2 = new Point(1,0);
        p3 = new Point(1,1);
        p4 = new Point(0,1);

    }
    public Rectangle(Point p1, Point p2, Point p3, Point p4)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP1()
    {
        return p1;
    }

    public Point getP2()
    {
        return p2;
    }

    public Point getP3()
    {
        return p3;
    }

    public Point getP4()
    {
        return p4;
    }

    public double getArea()
    {
        double width = p1.distance(p2);
        double height = p2.distance(p3);
        return width * height;
    }

    public double getPerimeter()
    {
        double width = p1.distance(p2);
        double height = p2.distance(p3);
        return 2 * (width + height);
    }

    public boolean contains(Point p)
    {
        double minX = Math.min( Math.min(p1.getX(), p2.getX()), Math.min(p3.getX(), p4.getX()));
        double maxX = Math.max(Math.max(p1.getX(), p2.getX()), Math.max(p3.getX(), p4.getX()));
        double minY = Math.min(Math.min(p1.getY(), p2.getY()), Math.min(p3.getY(), p4.getY()));
        double maxY = Math.max(Math.max(p1.getY() , p2.getY()), Math.max(p3.getY(), p4.getY()));
        return p.getX() >= minX && p.getX() <= maxX &&
                p.getY() >= minY && p.getY() <= maxY;
    }
    public boolean contains(Rectangle r)
    {
        return contains(r.p1) && contains(r.p2) &&
                contains (r.p3) && contains(r.p4);
    }
    public boolean overlaps(Rectangle r )
    {
        double thisMinX = Math.min(p1.getX(), p4.getX());
        double thisMaxX = Math.max(p2.getX(), p3.getX());
        double thisMinY = Math.min(p1.getY(), p2.getY());
        double thisMaxY = Math.max(p3.getY(), p4.getY());

        double otherMinX = Math.min(r.p1.getX(), r.p4.getX());
        double otherMaxX = Math.max(r.p2.getX(), r.p3.getX());
        double otherMinY = Math.min(r.p1.getY(), r.p2.getY());
        double otherMaxY = Math.max(r.p3.getY(), r.p4.getY());

        return thisMaxX > otherMinX &&
                thisMinX < otherMaxX &&
                thisMaxY > otherMinY &&
                thisMinY < otherMaxY;
    }
}
