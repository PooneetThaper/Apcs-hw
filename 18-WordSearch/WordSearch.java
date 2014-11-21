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


    //since horizontal and vertical are very similar,
    //I put in 1 check and 1 horizontal that works with a new
    //input string o to work on the right orientation

    public boolean check(String w, int row, int col, String o){
	boolean alright=true;
	int r=row,c=col;
	try{
	    for (int i=0;i<w.length();i++){
		if (board[r][c]!='.') {
		    if(board[r][c]!=w.charAt(i)){
			alright=false;
		    }
		}
		if (o.equals("H"))//horizontal
		    c++;
		if (o.equals("V"))//vertical
		    r++;
	        
	    }
	    
	}catch (ArrayIndexOutOfBoundsException e){
	    alright=false;
	}
	if (alright){
	    if (o.equals("H")){
		if(col+w.length()>board.length)	alright=!alright;
	    }
	    if (o.equals("V")){
		if(row+w.length()>board.length)	alright=!alright;
	    }	    
	}
	return alright;
    }

    public void addWord(String w, int row, int col, String o){
	int r=row,c=col;
	if(check(w,r,c,o)){
	    for (int i=0;i<w.length();i++){
	        board[r][c]=w.charAt(i);
		if (o.equals("H"))
		    c++;
		else r++;
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
	ws.addWord("apple",7,2,"H");
	ws.addWord("set",7,5,"H");
	ws.addWord("letters",7,5,"H");
	ws.addWord("banana",22,2,"H");
	ws.addWord("helloworld",15,12,"H");
	ws.addWord("superbanana",0,25,"H");
	ws.addWord("superbanana",0,25,"V");
	ws.addWord("word",15,17,"V");
	ws.addWord("amazing",25,9,"V");
	ws.addWord("applesauce",16,5,"V");

	System.out.println(ws.toString());
    }
	

	//doesnt go off the line
	//does overwrite anything
}
