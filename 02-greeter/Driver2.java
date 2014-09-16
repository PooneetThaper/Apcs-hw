public class Driver2{
    public static void main( String[] args) {
        Greeter g1= new Greeter();
        Greeter g2= new Greeter();
	Greeter g3;
	g3=g1;
	g1.greet();
	g2.greet();
	
	System.out.println("Before");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);

	g1=new Greeter();
	System.out.println("Later");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);

	g2=new Greeter();
	System.out.println("Later");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);
    }
}
