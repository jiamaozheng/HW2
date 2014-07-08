public class RGBTests {
    public static void main (String[] args){
	RGB rgb1 = new RGBImpl (23, 100, 209);
	CMYK cmyk1 = new CMYKImpl(0.2,0.4, 0.8, 0.3);

	System.out.println(".getR is  "+ rgb1.getR() + " .getG is  " + rgb1.getG() + ".getB is  " + rgb1.getB() );
	System.out.println("RGB negate is " + rgb1.negate());
	System.out.println("conversion to CMYK is " + rgb1.toCMYK());
	System.out.println("toString is " + rgb1.toString);
}
}