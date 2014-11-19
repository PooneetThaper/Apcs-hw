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

    public boolean checkH(String w, int row, int col){
	boolean wegood=true;
	int r=row,c=col;
	try{
	    for (int i=0;i<w.length();i++){
		if (board[r][c]!='.') {
		    if(board[r][c]!=w.charAt(i)){
			wegood=false;
		    }
		}
		c++;
	    }
	    if (wegood){
		if (col+w.length()>board[0].length)
		    wegood=!wegood;
	    }
	}catch (ArrayIndexOutOfBoundsException e){
	    wegood=false;
	}
	return wegood;
    }

    public void addWordH(String w, int row, int col){
	int r=row,c=col;
	if(checkH(w,r,c)){
	    for (int i=0;i<w.length();i++){
	        board[r][c]=w.charAt(i);
		c++;
	    }
	}
	else{
	    String error= "Can't add "+w+" at ["+Integer.toString(row)+"][";
	    error=error+Integer.toString(col)+"]";
	    System.out.println(error);
	}
    }

    public static void main(String[] args){
	WordSearch ws=new WordSearch(30,30);
	ws.addWordH("apple",7,2);
	ws.addWordH("set",7,5);
	ws.addWordH("letters",7,5);
	ws.addWordH("banana",6,2);
	ws.addWordH("superbanana",0,25);

	System.out.println(ws.toString());
    }
	

	//doesnt go off the line
	//does overwrite anything
}
