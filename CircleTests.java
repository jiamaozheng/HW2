public class CircleTests {

    public static void main (String[] args){
	Point p = new PointImpl (2,3);
	Point cen = new PointImpl (3,5);

	Circle c = new CircleImpl (cen,10);

	System.out.println ("The diameter of the center is " + c.getRadius());
	System.out.println ("The center point is " + c.getCenter ());
	System.out.println ("The circle area is  " + c.area());
	System.out.println (".circumf is " +c.circumf());
	System.out.println ("Whether the circle contains such points or not:  " + c.contains(p));
	System.out.println (c.toString());
}

}