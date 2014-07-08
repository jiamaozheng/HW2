public interface Circle {
    public Point getCenter ();
    public double getRadius();
    public double diameter ();

    public double area();
    public double circumf();
    public boolean contains (Point p);
    public String toString ();


}