public class Driver{
public boolean mixStart(String str) {
if (str.length() <3) return false;
String ix = str.substring(1,3);
return(ix.equals("ix"));
}
public String makeOutWord(String out, String word) {
return out.substring(0,2)+word+out.substring(2);
}
public String firstHalf(String str) {
int a= str.length();
int b= a/2;
return str.substring(0,b);
}
}