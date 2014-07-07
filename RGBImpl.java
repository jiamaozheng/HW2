public class RGBImpl implements RGB {
    private int r;
    private int g;
    private int b;
    publc int getR(){
	return this.r;
}
    public int getG (){
	return this.g;
}
    public int getB (){
	return this.b;
}

    public RBGImpl (int r, int g, int b){
	this.r=r;
	this.g.=g;
	this.b=b;
}
    public RGB negate (){
	int red = 254-r;
	int green = 254-g;
	int blue=254-b;
	return new RGBImpl (red, green, blue); 
}

    public CMYK toCMYK();

    public String toString (){
	String s = "(a RGB color model consists of three color: red," + this.r + "green" + this.g + "and blue" +b ")";
	return s;
}

}