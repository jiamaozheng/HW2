public class LineSegTests {
    public static void main (String[] args){
        
	Point p1 = new PointImpl(2.0,-3.0);
	Point p2 = new PointImpl(-2.0, 5.0);

	LineSeg l1 = new LineSegImpl(p1, p2);

	System.out.println("l1.getA= "+ l1.getA()+" and l1.getB()" +l1.getB());
	System.out.println("the distance between p1 and p2 is " + l1.length());
	System.out.println("p1p2 crosses x axis is " + l1.crossesXAxis());
	System.out.println("p1p2 crosses y axis is " + l1.crossesYAxis());
	System.out.println("p1p2 crosses both x and y axis is " + l1.crossesBothAxes());
	System.out.println ("the midpoint of p1p2 is " + l1.midpoint());
	System.out.println(l1.toString());
}
}