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
	double w1 = this.r/255;
	double w2 = this.g/255;
	double w3 = this.b/255;
	double w = Math.max(w1,w2,w3);
	CMYK cmyk = new CMYKImpl ((this.w()-(this.r/255))/this.w(), (this.w()-(g/255))/this.w(), (this.w-(b/255))/this.w, 1-this.w);
	return cmyk;
}

    public String toString (){
	String s = "(a RGB color model consists of three color: red," + this.r + "green" + this.g + "and blue" +b+ ")";
	return s;
}

}