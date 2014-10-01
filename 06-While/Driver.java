//working

public class Driver{
    public static void main(String[] args){
	Loops d=new Loops();
	System.out.println("Hel times 6");
	System.out.println(d.frontTimes("Hello",6));
	System.out.println("Every other character of Banana (so Bnn)");
	System.out.println(d.stringBits("Banana"));
	System.out.println("take out the yak in yakana");
	System.out.println(d.stringYak("yakana"));
	System.out.println("matches the number of times Banana and Bandana have the same 2 letter sequence");
	System.out.println(d.stringMatch("Banana","Bandana"));
    }
}
