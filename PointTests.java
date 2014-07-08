public class PointTests {
    public static void main (String[] args){
	Point a = new PointImpl(0.0,0.0);
	Point b = new PointImpl (0.5, 0.0);
	Point c = new PointImpl (2.0, 0.0);

	System.out.println ("a.getX=" + a.getX()+"b.getX="+b.getX()+"c.getX" + c.getX());
	System.out.println ("a.getY=" + a.getY()+"b.getY" +b.getY()+"c.getY"+c.getY());
	System.out.println ("a.dist=" + a.distFromOrigin()+"b.dist=" + b.distFromOrigin()+"c.dist="+c.distFromOrigin());
	System.out.println("a.inunit=" + a.inUnitCircle()+"b.inunit=" + b.inUnitCircle()+"c.inunit="+c.inUnitCircle());
	System.out.println("a.dist=" + a.dist(b)+"b.dist="+b.dist(c)+"c.dist"+c.dist(a));
	System.out.println("a.string="+a.toString() +"a.string="+ b.toString() +"c.string"+ c.toString());
}
}