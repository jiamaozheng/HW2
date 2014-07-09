public class RGBTests {
    public static void main (String[] args){
	RGB rgb1 = new RGBImpl (23, 100, 209);
	CMYK cmyk1 = new CMYKImpl(0.2,0.4, 0.8, 0.3);

	System.out.println(".getR = "+ rgb1.getR() + ", .getG = " + rgb1.getG() + ", .getB = " + rgb1.getB() );
	System.out.println("RGB negate = " + rgb1.negate());
	System.out.println("RGB to CMYK = " + rgb1.toCMYK());
	System.out.println(rgb1.toString());
}
}