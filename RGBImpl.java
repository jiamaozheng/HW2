public class RGBImpl implements RGB {
    private int r;
    private int g;
    private int b;
    public int getR(){
	return this.r;
}
    public int getG(){
	return this.g;
}
    public int getB(){
	return this.b;
}

    public RGBImpl (int r, int g, int b){
	this.r=r;
	this.g=g;
	this.b=b;
}
    public RGB negate (){
	RGB rgb = new RGBImpl( 255-this.r, 255-this.g, 255-this.b);
	return rgb;
}

    public CMYK toCMYK(){
	double  w1 =  Math.max (this.r/255.0, this.g/255.0);
	double w = Math.max (w1, this.b/255.0);
	CMYK cmyk = new CMYKImpl ((w-(this.r/255))/w, (w-(this.g/255))/w, (w-(this.b/255))/w, (1-w));
	return cmyk;
}

    public String toString (){
	String s = "a RGB color model consists of three colors: red, " + this.r + " green " + this.g + " and blue " +b;
	return s;
}

}