import java.io.*;
import java.util.*;

public class Monster extends Basechar implements Comparable{
    int healthboost=(int)Math.ceil(Math.random()*500)+200;
    public Monster (String n) {
	super(n);
	this.health = this.health + healthboost;
	this.attack = this.attack + (int)Math.ceil(Math.random()*5);
    }

    public int compareTo(Object other){
	Monster m= (Monster)other;
	return this.getName().compareTo(m.getName());
    }
    /*
      public void Attack (Basechar other) {
      System.out.println(this + " is attacking " + other + "!!!");
	}
    */

    public static void main(String[] args){
	String[] s={"destroyer","pokemon","digital demon","minotaur","oversized eagle"};
	Monster[] a=new Monster[5];
	for (int i=0;i<5;i++){
	    a[i]=new Monster(s[i]);
	}

	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
    }
}


