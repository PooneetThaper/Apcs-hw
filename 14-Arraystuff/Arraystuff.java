import java.util.*;

public class Arraystuff{
    int[] n=new int[10];

    public Arraystuff(){	
	for(int i=0; i<n.length;i++){
	    n[i]=i;
	}
    }
    
    public String toString(){
	String s="";
	for(int i=0; i<n.length;i++){
	    s=s+n[i];
	    s=s+", ";
	}
	return s;
    }

    public int find(int c){
	for(int i=0;i<n.length;i++){
	    if (n[i]==c){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal(){
	int max=0;
	for(int i=0;i<n.length;i++){
	    if (n[i]>max){
		max=n[i];
	    }
	}
	return max;
    }
}
