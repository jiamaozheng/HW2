public class LineSegTests {
    public static void main (String[] args){
        
	Point p1 = new PointImpl(2.0,-3.0);
	Point p2 = new PointImpl(-2.0, 5.0);

	LineSeg l1 = new LineSegImpl(p1, p2);

	System.out.println("l1.getA: "+ l1.getA()+" and l1.getB(): " +l1.getB());
	System.out.println("The distance between Point p1 and Point p2 is " + l1.length());
	System.out.println("The line p1-p2 crosses the  x axis: " + l1.crossesXAxis());
	System.out.println("The line p1-p2 crosses the  y axis: " + l1.crossesYAxis());
	System.out.println("The line p1-p2 crosses both x and y axis: " + l1.crossesBothAxes());
	System.out.println ("The midpoint of the line p1-p2 is " + l1.midpoint());
	System.out.println(l1.toString());
}
}