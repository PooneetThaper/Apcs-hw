public class Loops{
    public String frontTimes(String str, int n) {
	String s="";
	String f="";
	if (str.length()>=3) {
	    f=str.substring(0,3);
	}
	if (str.length()<3) f=str;
	while (n>0) {
	    s=s+f;
	    n=n-1;
	}
	return s;
    }
    //3 minutes
    
    public String stringBits(String str) {
	String a="";
	int n=0;
	while (n<str.length()) {
	    a=a+str.charAt(n);
	    n=n+2;
	}
	return a;
    }
    //2 minutes
    
    public String stringYak(String str) {
	int n=0;
	while (n<=str.length()-3){
	    if (str.substring(n,n+3).equals("yak")) {
		str= str.substring(0,n)+str.substring(n+3,str.length());
	    }
	    n=n+1;
	}
	return str;
    }
    //10 minutes
    
    public int stringMatch(String a, String b) {
	int n=0;
	int same=0;
	if (a.length()<b.length()) {
	    while (n<a.length()-1) {
		String a1= a.substring(n,n+2);
		String b1= b.substring(n,n+2);
		if (a1.equals(b1)) {
		    same=same+1;
		}
		n=n+1;
	    }
	}
	else {
	    while (n<b.length()-1) {
		String a1= a.substring(n,n+2);
		String b1= b.substring(n,n+2);
		if (a1.equals(b1)) {
		    same=same+1;
		}
		n=n+1;
	    }
	}
	return same;
    }


    //maybe 20 or so minutes
}
