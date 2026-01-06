package geometry;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle( 0, 0,5);
        Circle c2 = new Circle(2,2,2);
        Circle c3 = new Circle(10,10,1);
        System.out.println(c1.contains(1,1));
        System.out.println(c1.contains(c2));
        System.out.println(c1.contains(c3));

        System.out.println(c1.overlaps(c2));
        System.out.println(c1.overlaps(c3));
    }
}
