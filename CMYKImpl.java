public class CMYKImpl implements CMYK {
    private double c;
    private double m;
    private double y;
    private double k;

    public double getC(){
	return this.c;
}
    public double getM(){
	return this.m;
}
    public double getY(){
	return this.y;
}
    public double getK(){
	return this.k;
}

    public EMYKImpl (double c, double m, double y, double k){
	this.c=c;
	this.m=m;
	this.y=y;
	this.k=k;
}

    public CMYK negate (){
        double  cyan = 1.0-c;
	double  magenta = 1.0-m;
	double yellow=1.0-y;
	double black = 1.0 -k;

	return new CMYK (cyan, magenta, yellow, black);
}

    public RGB toRGB ();

    public String toString (){
	String s = "(CMYK is a four cololr printing process that use cyan"  + this.c +"magenta " + this.m +"yellow" +this.y + "black" +this.k +"inks)";
	return s; 
}


}