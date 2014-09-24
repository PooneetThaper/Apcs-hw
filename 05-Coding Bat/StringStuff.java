/* working with Serena*/

public class StringStuff{
    public String nonStart(String a, String b) {
	return a.substring(1)+b.substring(1);
    }
    public String makeAbba(String a, String b) {
	return a+b+b+a;
    }
    public int diff21(int n) {
	if (n>21) return 2*(n-21);
	else return 21-n;
    }
    public boolean nearHundred(int n) {
	int a= Math.abs(100-n);
	int b= Math.abs(200-n);
	if (a<=10) return true;
	if (b<=10) return true;
	else return false;
    }

    public int teaParty(int tea, int candy) {
	if ((tea<5)||(candy<5)) return 0;
	if ( (tea/candy>=2) || (candy/tea>=2) ) return 2;
	if ( (tea>=5) || (candy>=5)) return 1;
	else return 0;
    }

    public int teaParty(int tea, int candy) {
	if ((tea<5)||(candy<5)) return 0;
	if ( (tea/candy>=2) || (candy/tea>=2) ) return 2;
	if ( (tea>=5) || (candy>=5)) return 1;
	else return 0;
    }


}
