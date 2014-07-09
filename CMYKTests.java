public class CMYKTests {
    public static void main (String[] agrs){
	CMYK cmyk1 = new CMYKImpl (0.1, 0.3, 0.9, 0.5);
	RGB rgb1 = new RGBImpl (30, 230, 120);

	System.out.println(".getC is " + cmyk1.getC() + ", .getM is " + cmyk1.getM() + ", .getY is " + cmyk1.getY() + " and .getK is " + cmyk1.getK());
	System.out.println (" CMYK negate is " + cmyk1.negate());
	System.out.println (" CMYK to RGB is " + cmyk1.toRGB());
	System.out.println(cmyk1.toString());
}
}