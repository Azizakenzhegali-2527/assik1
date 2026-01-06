package geometry;

public class TriangleTest
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle (
                new Point(0,0),
                new Point(4,0),
                new Point(0,3)
        );

        Triangle t2 = new Triangle (
                new Point(6,0),
                new Point(4,2),
                new Point(1,3)
        );

        Triangle t3 = new Triangle (
                new Point(3,0),
                new Point(4,4),
                new Point(0,6)
        );

        Point p1= new Point(1,1 );
        Point p2 = new Point(3, 1) ;

       System.out.println(t1.contains(p1));
       System.out.println(t1.contains(p2));

       System.out.println(t1.contains(t2));
       System.out.println(t1.contains(t3));

       System.out.println(t1.overlaps(t2));
       System.out.println(t1.overlaps(t3));





    }

}
