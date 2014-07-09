public class PointImpl implements Point {

    private double x;
    private double y;

    public double getX (){
	return this.x;
}
    public double getY(){
	return this.y;
}

    public PointImpl (double x, double y){
	this.x=x;
	this.y=y;
}

    public double distFromOrigin(){
	double d = Math.sqrt(this.x*this.x + this.y*this.y);
	return d; 
}

    public boolean inUnitCircle(){
	if (this.distFromOrigin()<1.0){
	    return true;
	}else {return false;}
}

    public double dist (Point p){
	double dd= Math.sqrt((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y));
	return dd;
}

    public String toString (){
	String s =  " the x axis of the Point is " + this.x + " and its  y axis is " + this. y;
	return s;
} 
}