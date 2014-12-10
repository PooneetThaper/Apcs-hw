import java.io.*;
import java.util.*;

public class Interval{
    private int low,high;
    private Random r=new Random();
    private static int numIntervals=0;

    public Interval(int l, int h){
	low=l;
	high=h;
	numIntervals=numIntervals+1;
    }

    public Interval(){
	int l=r.nextInt(50);// (int)Math.floor(Math.random()*101);
	int h=l + 1 + r.nextInt(50);// l+(int)Math.ceil(Math.random()*100);

	low=l;
	high=h;
	numIntervals=numIntervals+1;
	    
    }

    public int compareTo(Interval other) {
	if (this.low!=other.low){
	    if (this.low > other.low) {
		return 1;
	    } else {
		return -1;
	    }
	} else {
	    if (this.high != other.high){
		if (this.high > other.high) {
		    return 1;
		} else {
		    return -1;
		}
	    } else {
		return 0;
	    }
	}   
    }

    public String toString(){
	String s="";
	s="["+low+","+high+"]";
	return s;
    }

    public static void printstuff(){
	System.out.println("Stuff");
    }

    public static void main(String[] args){
	Interval[] a=new Interval[10];
	for (int i=0;i<10;i++){
	    a[i]=new Interval();
	}

	System.out.println(Arrays.toString(a));
	System.out.println("comparing:");
	System.out.println("");
	
	for (int i=0;i<9;i++){
	    System.out.println("a["+i+"].compareTo(a["+(i+1)+"]): "+a[i].compareTo(a[i+1]));
	    System.out.println("");
	}
	
	/*
	Interval ival=new Interval();
	ival.printstuff();//normal as instance
	printstuff();//static so it works without an instance
	Interval.printstuff();//we can also call it right off a class
	*/
    }
}
