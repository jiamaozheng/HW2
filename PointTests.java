public class PointTests {
    public static void main (String[] args){
	Point a = new PointImpl(0.0,0.0);
	Point b = new PointImpl (0.5, 0.0);
	Point c = new PointImpl (2.0, 0.0);

	System.out.println (a.getX+b.getX+c.getX);
	System.out.println (a.getY+b.getY+c.getY);
	System.out.println (a.disFromOrigin()+b.disFromOrigin()+c.disFromOrigin());
	System.out.println(a.inUnitCircle()+b.inUnitCircle()+c.inUnitCircle());
	System.out.println(a.dist(b)+b.dist(c)+c.dist(a));
	System.out.println(a.toString + b.toString + c.toString);
}
}