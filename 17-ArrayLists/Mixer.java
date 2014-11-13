import java.io.*;
import java.util.*;

public class Mixer{
    private int[] a;
    private int[] result;
    private ArrayList<Integer> al=new ArrayList<Integer>();

    public Mixer(){
	a=new int[10];
	for(int i=0;i<10;i++){
	    a[i]=i;
	}
	result=new int[10];
    }

    public int[] Mix(){
	int place=0;
	while(unSaturated()){
	    int rand=(int)Math.ceil(Math.random()*9);
	    if (a[rand]!=-1){
		result[place]=a[rand];
		place++;
	    }
	}
	return result;
    }

    public boolean unSaturated(){
	for(int i=0;i<10;i++){
	    if (a[i]==i)
		return true;
	}
	return false;
    }

    public static void main(String[] args){
	Mixer m=new Mixer();
	m.Mix();
    }
}
