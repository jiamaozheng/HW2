public interface RGB {
    public int getR();
    public int getG();
    public int getB();
    public RGB negate ();
    public CMYK toCMYK();
    public String toString ();
}