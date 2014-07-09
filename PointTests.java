public class PointTests {
    public static void main (String[] args){
	Point a = new PointImpl(0.0,2.0);
	Point b = new PointImpl (0.5,1.0);
	Point c = new PointImpl (0.8,-0.5);

	System.out.println ("a.getX = " + a.getX()  +", b.getX = "+b.getX()+" and c.getX = " + c.getX());
	System.out.println ("a.getY = " + a.getY()+", b.getY = " +b.getY()+" and c.getY = "+c.getY());
	System.out.println ("a.dist = " + a.distFromOrigin()+", b.dist = " + b.distFromOrigin()+" and c.dist = "+c.distFromOrigin());
	System.out.println("a.inunit = " + a.inUnitCircle()+", b.inunit = " + b.inUnitCircle()+" and c.inunit = "+c.inUnitCircle());
	System.out.println("a.dist = " + a.dist(b)+", b.dist = "+b.dist(c)+" and c.dist = "+c.dist(a));
	System.out.println("a.string:  "+a.toString() +", b.string:  "+ b.toString() +" and c.string: "+ c.toString());
}
}