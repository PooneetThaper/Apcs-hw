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
/2 minutes
