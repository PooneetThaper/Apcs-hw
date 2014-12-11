import java.io.*;
import java.util.*;

class Interval implements Comparable/*, interface2, interface 3...*/{
    private int low,high;
    private static Random r=new Random(100);
    private static int numIntervals=0;

    public Interval(int l, int h){
	low=l;
	high=h;
	numIntervals=numIntervals+1;
    }

    public Interval(){
	int h=r.nextInt(100);// (int)Math.floor(Math.random()*101);
	int l=1+ r.nextInt(h);// l+(int)Math.ceil(Math.random()*100);

	low=l;
	high=h;
	numIntervals=numIntervals+1;
	    
    }

    public int compareTo(Object other) {
	/*
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
	}*/

	/* cast other to the appropriate type and store in a
	   local variable for convenience */
	
	Interval o= (Interval)other;
	if (this.low == o.low){
	    return this.high - o.high;
	} else{
	    return this.low - o.low;
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
	Interval[] a=new Interval[5];
	for (int i=0;i<5;i++){
	    a[i]=new Interval();
	}

	System.out.println(Arrays.toString(a));
	System.out.println("comparing:");
	System.out.println("");
	
	for (int i=0;i<4;i++){
	    System.out.println("a["+i+"].compareTo(a["+(i+1)+"]): "+a[i].compareTo(a[i+1]));
	    System.out.println("");
	}

	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	/*
	Interval ival=new Interval();
	ival.printstuff();//normal as instance
	printstuff();//static so it works without an instance
	Interval.printstuff();//we can also call it right off a class
	*/
    }
}

/*
  interface is a java spcification that lists methods


ex:

interface name {

method signature 1;

method signature 2;

}

(a method signature is  "public/private return-type name (params)" )




there is built in interface:

interface Comparable{

public int compareTo(object other);

}



a class that implements an interface must define all methods in the interface



you can only extend one class but you can implement multiple interfaces
 */


/*
  12/11/14

  Searching

  Search(ArrayList<Character> A, String name)
  Search(int[] a, int value)

  options:
  1 send in string with name

  Search(ArrayList<Character> A, "Fred")

  2 send in an instance of class with name set

  Character c = new Character("Fred")
  Search(ArrayList<Character>, c)

  
  
  -loops through the array until we find element
  or runs out of spaces (Linear Search)
  |A|.............|D|

  -if list is sorted, you can do better (binary search)
  sorted from 0-n

  mid=n/2;
  -if a[mid] is what we wont, we're done
  -else if what we want < a[mid] then h=mid-1
  -else then search from mid+1 to n (l=mid+1)

  Homework:
    make a class thats comparable
    make Comparable[] the parameter
    make lsearch, bsearch, and rbsearch (recursive)
*/
