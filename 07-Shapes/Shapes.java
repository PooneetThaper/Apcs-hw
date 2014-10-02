//working

public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    
    public String tri1(int h){
	String s="";
	int row=0;
	int col;
	while (row<h){
	    col=row+1;
	    while (col>0){
		s = s+"*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }

    public String tri2(int h){
	String s="";
	int row=0;
	int col;
	int space;
	while (row<h){
	    col=row+1;
	    space=h-col;
	    while (space>0){
		s = s+" ";
		space=space-1;
	    }
	    while (col>0){
		s = s+"*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
}
