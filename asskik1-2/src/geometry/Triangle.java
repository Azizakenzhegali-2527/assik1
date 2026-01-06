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

    public double cross(Point a, Point b, Point c)
    {
        return ( b.getX() - a.getX())* (c.getY()- a.getY())-
                (b.getY()-a.getY())* (c.getX()- a.getX());

    }

    public boolean contains(Point p)
    {
        double c1 = cross(p1,p2,p3);
        double c2 = cross(p2,p3,p);
        double c3 = cross(p3, p1, p);
        boolean hasNeg = (c1<0) || (c2 <0) || (c3 <0);
        boolean hasPos = (c1>0) || (c2>0) || ( c3>0);
        return! (hasNeg && hasPos);
    }
    public boolean contains(Triangle t)
    {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);

    }

    public boolean overlaps(Triangle t)
    {
        if(contains(t.p1) || contains(t.p2) || contains(t.p3))
        {
            return true;
        }
        return false;

    }

}

