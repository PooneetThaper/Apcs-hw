public class WordSearch{
    private char[][] board;

    public WordSearch(int r,int c){
	board=new char[r][c];
	for (int i=0;i<r;i++){
	    for (int j=0;j<c;j++){
		board[i][j]='.';
	    }
	}
    }


    public String toString(){
	String s="";
	for (int i=0;i<board.length;i++){
	    for (int j=0; j<board[i].length;j++){
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public void addReverseWord(String w, int r, int c, String o){
	String rev = new StringBuilder(w).reverse().toString();
	this.addWord(rev,r,c,o);
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
		if (o==0||o==4)//horizontal
		    c++;
		if (o==1||o==5)//vertical
		    r++;
		if (o==2||o==6){//diagonal with negative slope
		    c++;
		    r++;
		}
		if (o==3||o==7){//diagonal with positive slope
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
	int r=row,c=col;
	if(check(w,r,c,o)){
	    for (int i=0;i<w.length();i++){
	        board[r][c]=w.charAt(i);
		if (o==0||o==4)//horizontal
		    c++;
		if (o==1||o==5)//vertical
		    r++;
		if (o==2||o==6){//diagonal with negative slope
		    c++;
		    r++;
		}
		if (o==3||o==7){//diagonal with positive slope
		    c--;
		    r++;
		}
	    }
	}
	else{
	    String error= "Can't add ("+w+") vertically at ["+Integer.toString(row)+"][";
	    error=error+Integer.toString(col)+"]";
	    System.out.println(error);
	}
    }


    public static void main(String[] args){
	WordSearch ws=new WordSearch(30,30);
	ws.addWord("apple",7,2,0);
	ws.addWord("set",7,5,0);
	ws.addWord("letters",7,5,0);
	ws.addWord("banana",22,2,2);
	ws.addWord("helloworld",15,12,0);
	ws.addWord("superbanana",0,25,0);
	ws.addWord("superbanana",0,25,3);
	ws.addReverseWord("word",12,17,2);
	ws.addWord("amazing",25,9,1);
	ws.addWord("applesauce",16,5,1);

	System.out.println(ws.toString());
    }
	

	//doesnt go off the line
	//does overwrite anything
}
