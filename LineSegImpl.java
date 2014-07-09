public class LineSegImpl implements LineSeg {

    private Point a;
    private Point b;
    public Point getA(){

	return this.a;
}
    public Point getB (){
	return this.b;
}

    public LineSegImpl (Point a, Point b) {
	this.a=a;
	this.b=b;
}    
    public double length (){
	double l =this. a.dist(this.b);
	return l;
}
    public boolean crossesXAxis (){
	if (this.a.getY()*this.b.getY()<0){
	    return true;
	}else {return false;}
    }

    public boolean crossesYAxis (){
	    if (this.a.getX()*this.b.getX()<0){
		return true;
	    }else {return false;}
}
	
    public boolean crossesBothAxes (){
	    if (this.a.getX()*this.b.getX()<0 && this.a.getY()*this.b.getY()<0){
		return true;
	    } else {return false;}
}

    public Point midpoint (){
	    Point p = new PointImpl ((this.a.getX()+this.b.getX())/2, (this.a.getY()+this.b.getY())/2);
	    return p; 
}
	public String toString() {
	String s = "The line is linked by two points, one point is " + this.a + " and another point is " + this.b;
	return s;
}
}