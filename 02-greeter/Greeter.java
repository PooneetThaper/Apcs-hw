public class Greeter {
    //instance variables are almost always private
    //we access them with "accessor methods" get and set
    private String greeting= new String ("Hello world");
    public void setGreeting(String s) {
	greeting =s;
    }
    public void greet() {
	//String greeting=new String("Sup");
	System.out.println(greeting);
    }
    public void ungreet() {
	System.out.println(greeting);
    }
}
