public class Driver {
    public static void main(String[] args){
	Greeter g1=new Greeter();
	Greeter g2=new Greeter();
	g1.greet();
	g2.greet();
	//makes a new block of memory and puts Sup! in it then returns address
	g1.setGreeting(new String("Sup!"));
	g2.setGreeting("Howdy!");

	g1.greet();
	g2.greet();

        
	String s=g1.getGreeting();
	System.out.println("g1's greeting is: "+s);
	System.out.println("g2's greeting is: "+g2.getGreeting());
    }
}
/* String S1,S2 makes a new block of memory
S1=new String("abc")
S2="abc" <--- String literal
does the same thing
*/
