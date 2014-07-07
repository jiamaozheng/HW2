public class PointImpl implements Point {

    private double x;
    private double y;

    public double getX (){
	return this.x;
}
    public double getY(){
	return this.y;
}

    public PointImpl (doulbe x, double y){
	this.x=x;
	this.y=y;
}

    public double distFromOrigin(double x, double y){
	double d = Math.sqrt(this.x*this.x + this.y*this.y);
	return d; 
}

    public boolean inUnitCircle(){
	if (this.disFromOrigin()<1.0){
	    return ture;
	}else {return false;}
}

    public double dist (Point p){
	double dd= Math.sqrt((p.getX-this.x)*(p.getX-this.x)+(p.getY-this.y)*(P.getY-this.y));
	return dd;
}

    public String toString (){
	retun "x axis is" + x + ", y axis is " + y;
} 
}