public class CircleImpl implements Circle {
    private Point center;
    private double ridius;

    public Point getCenter (){
	return this.center; 
}
    public double getRadius (){
	return this.ridius;
}

    public CircleImpl (Point center, double ridius){
	this.center = center;
	this.ridius=ridius;
}

    public double diameter (){
	double d = 2*this.ridius;
	return d;
}

    public double area (){
	double a = Math.PI*this.ridius*this.ridius;
	return a;
}

    public double circumf (){
	double c = 2*Math.PI*ridius;
	return c;
}

    public boolean contains (Point p){
	if (this.center.dist(p)<this.ridius){
     return true;
	} else {return false;}
}

    public String toString (){
	String s = "(center point is"+ this.center + ", and its ridius is" + this.ridius+").";
	return s;
}


}