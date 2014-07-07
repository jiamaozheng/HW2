public interface LineSeg {

    public Point getA();
    public Point getB();
    public double length();
    public boolean crossesXAxis();
    public boolean crossesYAxis();
    public boolean crossesBothAxes();
    public Point midpoint();
    public String toString();




}