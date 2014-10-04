//working

public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));

	System.out.println(s.tri1(5));
	
	System.out.println(s.tri2(5));
	
	System.out.println(s.tri3(5));
	
	System.out.println(s.tri4(5));

	System.out.println(s.diamond(9));
	System.out.println(s.diamond(10));
	
	System.out.println(s.frame(5,6));
	System.out.println(s.frame(30,50));
	
    }
}
