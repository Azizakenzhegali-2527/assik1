package geometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 3),
                new Point(0, 3)
        );

        Rectangle r2 = new Rectangle(
                new Point(1, 1),
                new Point(2, 1),
                new Point(2, 2),
                new Point(1, 2)
        );

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.contains(new Point(2, 2)));
        System.out.println(r1.contains(r2));
        System.out.println(r1.overlaps(r2));
    }
}
