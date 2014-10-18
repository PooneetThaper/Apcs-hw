//working
//worked with Tommy Li, Joseph Gelb, and Alice Xue
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Basechar {
    
    //all variables
    public int health = 100; 
    public int attack = 20; 
    //when a attacks b, b will be hit with this much damage as (a's attack - b's defense)
    int defense = 10; //let that be the number of points of health points they save 
    private String name = "default name";
    
    //all the methods to set up
    public Basechar(String n){
	setName(n);
	setHealth(health);
    }
    
    public void setName(String name){
	this.name= name;
    }
    
    public void setHealth(int h){
	this.health=h;
    }	
    
    //all the get methods to get stuff
    public String getName(){
	return name;
    }
    
    public int getAttack(){
	return attack;
    }
    
    public int getDefense(){
	return defense;
    }
    
    public String toString(){
	return this.getName();
    }
    
    //the methods that do stuff
    public void Sighting(Basechar other){
	System.out.println("");
	System.out.println("A wild "+ other +" appeared. What will you do?");
    }
    public void Encounter(Basechar other){
	System.out.println("");
	System.out.println("Would you like to attack, run, or eat a sandwich");
	System.out.println("Enter a or r or e");
	Scanner scanner= new Scanner(System.in);
	String Action = scanner.nextLine();
	if (Action.equals("a")) {
	    this.AttackThingy(other);
	}
	if (Action.equals("r")) {
	    this.Run(other);
	}
	
    }
    public void AttackThingy(Basechar other){
	while(this.health>0 && other.health>0){
	    if (this.health > 0){
		this.Fight(other);
		System.out.println("");
	    }
	    if (other.health > 0){
		other.Fight(this);
		System.out.println("");
		
	    }
	}
    }
    
    public void Fight(Basechar other){ 
	
	System.out.println(this + " is attacking " + other + "!!!");
	other.health= other.health - (this.getAttack() - other.getDefense());
	
	System.out.println(this + " did " + Integer.toString(this.getAttack() - other.getDefense())+" damage to "+other); 
	System.out.println(other + "'s health: " + Integer.toString(other.health));
	System.out.println(this + "'s health: " + Integer.toString(this.health));
	this.Endcheck(other);
    }
    
    public void Run(Basechar other){
	int val = (int) Math.ceil(Math.random()*100);
	if (val % 4 == 0){
	    System.out.println("You weren't fast enough. You know you're not Hussain Bolt, right?");
	    System.out.println("Back to square one. Try again:");
	    this.Encounter(other);
	} else {
	    this.health = 0;
	    System.out.println("You escaped, but tripped on a rock and died.");
	    this.Endcheck(other);
	}
    }
    
    public void Endcheck(Basechar other){
	if (this.health==0){
	    System.out.println(this+" you lost. Wow... Thats pretty sad...");
	}  
	if (other.health==0){
	    System.out.println("You have vanquished "+other+". Game over and you are now AWESOME!!!");
	}
    }   
    
}
