public class Greeter {
    //instance variables are almost always private
    //we access them with "accessor methods" get and set
    private String greeting;
    /*constructors
      Notes
      -the name is the same as the class name
      -there is no return type (nothing between public and the name)
      -ALWAYS PUBLIC
      a constructor is automatically run when you instantiate the class.
      that is if you have Greeter g=new Greeter("Hello")
      Then Jave will automatically call it and send Hello
      in as a parameter for g. It will then set the instance variable greeting
      to what g refers to, which is hello
    */
    public Greeter(String g) {
	System.out.println("in the constructor");
	greeting=g;
    }
//we can overload nethods including constructors which means we have more
    //than one method with the same name

    //regular methods

    public void setGreeting(String s) {
	//s refers to "Hello world"
	greeting =s;
    }
    //void is a "return type" that means return nothing so String in place
    //of void means that the function should return a String
    public String getGreeting(){
	return greeting;
    }
    public String greet() {
        return greeting;
    }
    public void ungreet() {
	//System.out.println(greeting);
    }
}
