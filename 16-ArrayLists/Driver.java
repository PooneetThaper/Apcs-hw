import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> al= new ArrayList<Integer>();
	for(int i=0;i<20;i++){
	    al.add((int)Math.ceil(Math.random()*5));
	}
	System.out.println("ArrayList: "+al);
	System.out.println("The size is: "+al.size());
	System.out.println("");


	int counta=0;
	System.out.println("The repetitions are listed as 'index_first_second' as follows:");
	for(int i=19;i>0;i--){
	    if (al.get(i-1)==(al.get(i))){
		counta++;
		System.out.println(i+"_"+al.get(i-1)+"_"+al.get(i));
	    }
	}
	System.out.println("There are "+Integer.toString(counta)+" repetitions");
	System.out.println("");

	int countb=0;
	System.out.println("Repetitions deleted:");
	for(int i=19;i>0;i--){
	    if (al.get(i)==al.get(i-1)){
		System.out.println(i+"_"+al.get(i-1)+"_"+al.get(i));
		al.remove(i);
		countb++;
	    }
	}
	System.out.println(Integer.toString(countb)+" repetitions deleted");
	System.out.println("");
	System.out.println("After removal of repetitions, the ArrayList became:");
	System.out.println(al);	
	System.out.println("The new size is: "+al.size());
    }
}
