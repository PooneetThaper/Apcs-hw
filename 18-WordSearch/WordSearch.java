import java.io.*;
import java.util.*;

public class WordSearch{
    private int[][] horizNums;
    private char[][] board;
    private char[][] answerkey;
    private ArrayList<String> Words= new ArrayList<String>();
    private ArrayList<String> WordsInPuzzle= new ArrayList<String>();


    public WordSearch(int r,int c){
	board=new char[r][c];
	for (int i=0;i<r;i++){
	    for (int j=0;j<c;j++){
		board[i][j]='.';
	    }
	}


	horizNums= new int[2][c];
	for (int j=0;j<2;j++){
	    for (int i=0;i<c;i++){
		if (j==0){
		    int k=i%10;
		    int n=i-k;
		    n=n/10;
		    horizNums[0][i]=n;
		}
		if (j==1){
		    int k=i%10;
		    horizNums[1][i]=k;
		}
	    }
	}
	WordsInPuzzle.add("Words:");
    }

    public String toString(){
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[i].length;j++){
		if (board[i][j]=='.'){
		    char c = (char)(Math.floor(Math.random()*26) + 'a');
		    board[i][j]=c;
		}
	    }
	}

	System.out.println("");
	String s="";
	for (int j=0;j<horizNums.length;j++){
	    s=s+"   ";
	    for (int i=0;i<horizNums[0].length;i++){
		int a=horizNums[j][i];
		if (j==0){
		    if (a!=0) s=s+Integer.toString(a);
		    else{
			s=s+" ";
		    }
		}
		if (j==1){
		    s=s+Integer.toString(a);
		}
	    }
	    s=s+"\n";
	}
	s=s+"";
	for (int i=0;i<board.length;i++){
	    if (i<10) s=s+" ";
	    s=s+i;
	    s=s+" ";
	    for (int j=0;j<board[i].length;j++){		
		 s=s+board[i][j];
	    }
	    if (i<WordsInPuzzle.size()){
	    	s=s+"     ";
		if (i>0){
		    if (i<10) s=s+" ";
		    s=s+Integer.toString(i);
		    s=s+"-";
		}
	    	s=s+WordsInPuzzle.get(i);
		}
	    s=s+"\n";
	}
	if (WordsInPuzzle.size()>board.length) {
	    int i=board.length;
	    for (int k=board.length;k<WordsInPuzzle.size();k++){
		for (int j=board.length;j>0;j--){
		    s=s+" ";
		}
		s=s+"         "+Integer.toString(i)+"-";
		s=s+WordsInPuzzle.get(k);
		s=s+"\n";
		i++;
	    }
	}
	return s;
    }

    public boolean check(String w, int row, int col, int o){
	boolean alright=true;
	int r=row,c=col;
	try{
	    for (int i=0;i<w.length();i++){
		if (board[r][c]!='.') {
		    if(board[r][c]!=w.charAt(i)){
			alright=false;
		    }
		}
		if (o==0) c++;
		if (o==1) c--;
		if (o==2) r++;
		if (o==3) r--;
		if (o==4){//diagonal with negative slope
		    c++;
		    r++;
		}
		if (o==5){
		    c--;
		    r--;
		}
		if (o==6){//diagonal with positive slope
		    c++;
		    r--;
		}
		if (o==7){
		    c--;
		    r++;
		}
		
	    }
	    
	}catch (ArrayIndexOutOfBoundsException e){
	    alright=false;
	}
	return alright;
    }

    public void addWord(String w, int row, int col, int o){
	//int o          0   1    2   3    4   5    6   7
	//orientation    H   H    V   V    ND  ND   PD  PD
	//reverse?       no  yes  no  yes  no  yes  no  yes

	int r=row,c=col;
	if(check(w,r,c,o)){
	    Words.add(w);
	    for (int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		    if (o==0) c++;
		    if (o==1) c--;
		    if (o==2) r++;
		    if (o==3) r--;
		    if (o==4){//diagonal with negative slope
			c++;
			r++;
		    }
		    if (o==5){
			c--;
			r--;
		    }
		    if (o==6){//diagonal with positive slope
			c++;
			r--;
		    }
		    if (o==7){
			c--;
			r++;
		    }
		}
	    }
	   
    }

    public boolean addWord(String w){
	int r=0;
	int c=0;
	int o=0;
	int tries=10;
	boolean worked=false;
	while (tries>0){
	    r=(int)Math.floor(Math.random()*30);
	    c=(int)Math.floor(Math.random()*30);
	    o=(int)Math.floor(Math.random()*7);
	    if(check(w,r,c,o)){
		addWord(w,r,c,o);
		worked=true;
		WordsInPuzzle.add(w);
		break;
	    }
	}
	return worked;
    }

    public void buildPuzzle(int numwords){
	int len=board.length;
	Scanner sc = null;
	
	try {
	    sc = new Scanner(new File("Words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open file");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s=sc.next();
	    Words.add(s);
	}
	int i=0;
	while (numwords>0){
	    i=(int)Math.floor(Math.random()*Words.size());
	    String word=Words.get(i);

	    if (word.equals("")){}
	    else{
		if (word.length()>1 && word.length()<len){
		    if (addWord(word)){
			Words.set(i,"");
			numwords--;
		    }
		}
	    }
	}
	int x=board.length;
	int y=board[0].length;
	answerkey=new char[x][y];
	for (int p=0;p<x;p++){
	    for (int j=0;j<y;j++){
		answerkey[p][j]=board[p][j];
	    }
	}
    }

    public void play(){
	System.out.println(toString());
	while (WordsInPuzzle.size()>1){
	    System.out.println("Please enter the number of the word you have found");
	    System.out.println("or 0 to quit and see answer key");
	    Scanner s1=new Scanner(System.in);
	    String a1=s1.nextLine();
	    int a=Integer.parseInt(a1);
	    if (a==0){
		break;
	    }
	    
	    if (a>WordsInPuzzle.size()) 
		System.out.println("There is no such word in the list");
	    else{
		String w=WordsInPuzzle.get(a);

		System.out.println("Please enter the position of the word you have found (vertical number)");
		Scanner s2=new Scanner(System.in);
		String b1=s2.nextLine();
		int b=Integer.parseInt(b1);		
		
		if (b>board[0].length)
		    System.out.println("that position is too high");
		else{
		    System.out.println("Please enter the position of the word you have found (horizontal number)");
		    Scanner s3=new Scanner(System.in);
		    String c1=s3.nextLine();
		    int c=Integer.parseInt(c1);

		    if (c>board.length)
			System.out.println("that position is too high");
		    else{
			if (board[b][c]!=w.charAt(0)){
			    for (int i=3;i>0;i--){
				System.out.println("");
			    }
			    System.out.println("sorry, this word cannot start here");
			    for (int i=3;i>0;i--){
				System.out.println("");
			    }
			}
			else{
			    System.out.println("Please enter the oreintation of the word according to the follwing key");
			    System.out.println("horizontal:0 vertical:1 diagonal(negative slope):2 diagonal(positive slope):4");
			    Scanner s4=new Scanner(System.in);
			    String d1=s4.nextLine();
			    int d=Integer.parseInt(d1);
			    
			    System.out.println("is this word reversed? (0=no 1=yes)");
			    Scanner s5=new Scanner(System.in);
			    String e1=s5.nextLine();
			    int e=Integer.parseInt(e1);
			    
			    int f= 2*d;
			    f=f+e;
			    
			    if (checkforword(w,b,c,f)){
				for (int i=3;i>0;i--){
				    System.out.println("");
				}
				System.out.println("Congrats, you have found " + w);
				WordsInPuzzle.remove(a);
				for (int i=5;i>0;i--){
				    System.out.println("");
				}
				System.out.println(toString());
			    }
			    else{
				for (int i=3;i>0;i--){
				    System.out.println("");
				}
				System.out.println("sorry, that word is not there");
				for (int i=3;i>0;i--){
				    System.out.println("");
				}
				System.out.println(toString());
			    }
			}
		    }
		}
	    }
	}
	if(WordsInPuzzle.size()==1) {
	    System.out.println("Congrats, you have solved the puzzle");
	}

	System.out.println("Here is the answer key:");
	System.out.println("");
	printanswers();
	
    }

    public void printanswers(){
	String s="";
	for (int i=0;i>answerkey.length;i--){
	    for (int j=0;j>answerkey[0].length;j--){
		s=s+answerkey[i][j];
	    }
	    s=s+"\n";
	}
	System.out.println(s);
    }

    public boolean checkforword(String w,int r,int c,int o){
	boolean alright=true;
	try{
	    int progress=w.length();
	    while(progress>0){
		for (int i=0;i<w.length();i++){
		    if(board[r][c]!=w.charAt(i)){
			alright=false;
			break;
		    }
		    
		    if (o==0) c++;
		    if (o==1) c--;
		    if (o==2) r++;
		    if (o==3) r--;
		    if (o==4){//diagonal with negative slope
			c++;
			r++;
		    }
		    if (o==5){
			c--;
			r--;
		    }
		    if (o==6){//diagonal with positive slope
			c++;
			r--;
		    }
		    if (o==7){
			c--;
			r++;
		    }
		    progress--;
		}
	    }
	}catch (ArrayIndexOutOfBoundsException e){
	    alright=false;
	}
	return alright;
    }
    
    public static void main(String[] args){
	WordSearch ws=new WordSearch(10,10);
	ws.buildPuzzle(9);
	System.out.println("");
	ws.play();
    }
	

	//doesnt go off the line
	//does overwrite anything
}
