package geometry;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c = new Circle( new Point(0,0), 5);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
