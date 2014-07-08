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

    public CMYKImpl (double c, double m, double y, double k){
	this.c=c;
	this.m=m;
	this.y=y;
	this.k=k;
}

    public CMYK negate (){
	CMYK cmyk = new CMYKImpl (1.0-this.c, 1.0-this.m, 1.0-this.y, 1.0-this.k);

	return  cmyk;
}

    public RGB toRGB (RGB rgb){
	int w = Math.max(rgb.getR()/255, rgb.getG()/255, rgb.getB()/255);
	RGB rgb = new RGBImpl (255w(1-rgb.getR()), 255w(1-rgb.getG()),255w(1-rgb.getB()));
				    return rgb;
};

    public String toString (){
	String s = "(CMYK is a four cololr printing process that use cyan"  + this.c +"magenta " + this.m +"yellow" +this.y + "black" +this.k +"inks)";
	return s; 
}


}