import java.io.*;
import java.util.*;

public class WordSearch{
    private char[][] board;
    private ArrayList<String> Words= new ArrayList<String>();

    public WordSearch(int r,int c){
	board=new char[r][c];
	for (int i=0;i<r;i++){
	    for (int j=0;j<c;j++){
		board[i][j]='.';
	    }
	}
	Words.add("Words:");
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
	for (int i=0;i<board.length;i++){
	    for (int j=0; j<board[i].length;j++){		
		 s=s+board[i][j];
	    }
	    if (i<Words.size()){
	    	s=s+"     ";
		if (i>0) s=s+"-";
	    	s=s+Words.get(i);
	    }
	    s=s+"\n";
	}
	return s;
    }

    //since horizontal and vertical are very similar,
    //I put in 1 check and 1 horizontal that works with a new
    //input string o to work on the right orientation

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
		    c--;
		    r++;
		}
		if (o==7){
		    c++;
		    r--;
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
			c--;
			r++;
		    }
		    if (o==7){
			c++;
			r--;
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
		break;
	    }
	}
	return worked;
    }
    /*
    public void ReverseWord(String w,int r,int c,int o){
	String rev=new StringBuilder(w).reverse().toString();
	addWord(rev,r,c,o-1);
    }
    */
    public static void main(String[] args){
	WordSearch ws=new WordSearch(30,30);
	//Scanner s=new Scanner(
        
	/*
	ws.addWord("apple",7,2,0);
	ws.addWord("letters",7,5,0);
	ws.addWord("banana",22,2,4);
	ws.addWord("helloworld",15,12,0);
	ws.addWord("justice",0,25,6);
	
	ws.addWord("amazing");
	ws.addWord("applesauce");
	ws.addWord("justice");
	ws.addWord("pickle");
	ws.addWord("set");
	ws.addWord("hatmaster");
	ws.addWord("computer");
	ws.addWord("superman");
	*/
	System.out.println(ws.toString());
    }
	

	//doesnt go off the line
	//does overwrite anything
}
