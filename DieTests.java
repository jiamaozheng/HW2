public class DieTests {
    public static void main (String[] args){
	Die die1 = new DieImpl(4);

	System.out.println("the number of sides is " + die1.nSides());
	System.out.println("the number of roll is " + die1.roll());
 }

}