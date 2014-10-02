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

    //worked with alice xue
/*
    public String tri3(int h) {
	String s="";
	int row=0;
	int col;
	int space;
	while (row<h){
	    col=2*row+1;
	    space=h-row-1;
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
*/
    public String tri3(int h) {
	String s="";
	int row;
	int col;
	int space;
	for (row=0;row<h;row=row+1){
	    for (space=h-row-1;space>0;space=space-1){
		s = s+" ";
	    }
	    for (col=2*row+1;col>0;col=col-1){
		s = s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }
    /*
    public String tri4(int h){
	String s="";
	int row=0;
	int col;
	int space;
	while (row<h){
	    col=h-row;
	    space=row;
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
    */

    public String tri4(int h){
	String s="";
	int row;
	int col;
	int space;
	for (row=0;row<h;row=row+1){
	    for (space=row;space>0;space=space-1){
		s = s+" ";
	    }
	    for (col=h-row;col>0;col=col-1){
		s = s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }
    /*
    public String diamond(int h) {
	String s="";
	int row=0;
	int col;
	int space;
	int row1;
	while (row<h){
	    if (row<(h/2)+1){
		row1=row;
	    }
	    else{
		row1=h-row-1;
	    }

	    col=2*row1+1;
	    space=h-row1-2;
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
    */

    public String diamond(int h) {
	String s="";
	int row;
	int col;
	int space;
	int row1;
	for (row=0;row<h;row=row+1){
	    if (row<=( h/2)){
		row1=row;
	    }
	    else{
		row1=h-row-1;
	    }

	    for (space=h/2-row1;space>0;space=space-1){
		s = s+" ";
	    }
	    for (col=2*row1+1;col>0;col=col-1){
		s = s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }
}
