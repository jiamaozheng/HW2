public class DieImpl implements Die {
    private int n;

    public DieImpl (int n){
	this.n=n;
}

    public int nSides (){
	if (this.n>3){
	    return this.n=n;}
	return n;
}

       public int roll(){
	   return (int)((Math.random())*6+1);
       
}
}