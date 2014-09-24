
public class Driver{
    public static void main(String[] args){
        StringStuff p= new StringStuff();
        
	System.out.println("a=Hello and b=There");
	System.out.println(p.nonStart("Hello","There"));

	System.out.println("a=Yolo and b=Swag");
	System.out.println(p.makeAbba("Yolo","Swag"));
	
	System.out.println("n=32");
	System.out.println(p.diff21(32));

	System.out.println("n=12");
	System.out.println(p.diff21(12));
    }
}
