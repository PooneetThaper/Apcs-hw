public class Driver {
    public static void main(String[] args){
        String s="pooneet thaper";
        int a=s.indexOf(' ');
	String last=s.substring(a+1);
	String sl=" "+last;
	String l= "Your last name is: "+last;
	String first= s.replace(sl,"");
	String f= "Your first name is: "+first;
    }
}
