import java.io.*;
import java.util.*;

public class Mixer{
    private int[] a;
    private ArrayList<Integer> al=new ArrayList<Integer>();

    public Mixer(int n){
	a=new int[n];
	for(int i=0;i<a.length;i++){
	    a[i]=i;
	    al.add(i);
	}
    }

//________________ArrayList Stuff___________________

    public void Mixarraylist(){
	for(int i=(int)Math.ceil(Math.random()*10)+10;i>0;i--){
	    int rand1=(int)Math.floor(Math.random()*al.size());
	    int rand2=(int)Math.floor(Math.random()*al.size());
	    int val=al.get(rand1);
	    al.remove(rand1);
	    al.add(rand2, val);
	}
	System.out.println(al);
    }

//__________________Array Stuff_______________________
    public void arraytester(int[] n){
	String s="";
	for(int i=0;i<n.length;i++){
	    s=s+Integer.toString(n[i]);
	    s=s+", ";
	}
	System.out.println(s);
    }

    public void Mixarray(){
	int place=0;
	int[] result=new int[a.length];
	boolean unSat=true;
	while(unSat){
	    int rand=(int)Math.floor(Math.random()*(a.length));
	    if (a[rand]!=-1){
		result[place]=a[rand];
		a[rand]=-1;
		place=place+1;
	    }
	    //arraytester(result);
	    //arraytester(a);
	    boolean c=false;
	    for(int i=0;i<a.length;i++){
		if (a[i]!=-1) c=true;
		//if any place is not equal -1, its not saturated by -1's
	    }
	    unSat=c;
	}
        a=result;
    }

//________________________Main____________________________
    public static void main(String[] args){
	Mixer m = new Mixer(10);
	System.out.println("ArrayList: ");
	System.out.println(m.al);
	m.Mixarraylist();
	System.out.println("");
	System.out.println("Array: ");
	m.arraytester(m.a);
	m.Mixarray();
	m.arraytester(m.a);
    }
}
