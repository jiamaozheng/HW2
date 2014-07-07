public class LineSegImpl implements LineSeg {

    private Point a;
    private Point b;
    public Point getA(Point a){
	return this.a=a;
}
    public Point getB (Point b){
	return this.b=b;
}

    public LineSegImpl (Point a, Point b) {
	this.a=a;
	this.b=b;
}    
    public double length (Point a, Point b){
	double l =this. a.dist(this.b);
	return l;
}
    public boolean crossesXAxis (Point a, Point b){
	if (this.a.getX() < 0  && this.a.getY()>0 && this.b.getX()>0 &&  this.b.getY()>0) {return ture;} else {return false;}

	if (this.a.getX()<0 && this.a.getY()<0 && this.b.getX()>0 && this.b.getY()<0){return ture;} else {return false;}
}

    public boolean crossesYAxis ()

	public boolean crossesBothAxes ()

	public Point midpoint (double x, double y)
	public String toString() {
	String s = "(a line is consisted of two points, one point is " + this.a + "and another point is " + this.b ")";
	return s;
}
}