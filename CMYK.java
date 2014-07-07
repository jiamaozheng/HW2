public interface CMYK {
    public double getC();
    public double getM();
    public double getY();
    public double getK();
    public CMYK negate ();
    public RGB toRGB ();
    public String toString ();
}