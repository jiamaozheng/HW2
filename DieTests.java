public class DieTests {
    public static void main (String[] args){
	Die die1 = new DieImpl(4);

	System.out.println("The number of sides is " + die1.nSides());
	System.out.println("The number of roll is " + die1.roll());
 }

}