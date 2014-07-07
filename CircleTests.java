public class CircleTests {

    public static void main (String[] args){
	Point p = new PointImpl (2,3);
	Point cen = new PointImpl (3,5);

	Circle c = new CircleImpl (cen,10);

	System.out.println ("center circle diameter is " + c.getRadius());
	System.out.println ("center is point " + c.getCenter (cen));
	System.out.println ("circule area is " + c.area);
	System.out.println ("circumf is " +c.circumf);
	System.out.println ("circle contains point " + c.contains(p));
	System.out.println (c.toString);
}

}