//frame method is part of the Shapes.java in 07-Shapes
//working
public class CodingBat{
    public String stringSplosion(String str) {
	String s="";
	for (str.length();str.length()>0;str=str.substring(0,str.length()-1)){
	    s=str+s;
	}
	return s;
    }

    public String stringX(String str) {
	if (str.length()>0){
	    String s=str.substring(0,1);
	    int l=str.length();
	    for (int a=1;a<l-1;a++){
		String b=str.substring(a,a+1);
		if (b.indexOf("x")<0) s=s+b;
	    }
	    if (str.length()>1){
		s=s+str.substring(l-1,l);
	    }
	    return s;
	}
	return str;
    }
}
