//working//worked with Tommy Li, Joseph Gelb, and Alice Xuepublic class Basechar {        //all variables    public int health = 100;     public int attack = 20;     //when a attacks b, b will be hit with this much damage as (a's attack - b's defense)    int defense = 10; //let that be the number of points of health points they save     private String name = "default name";    //all the methods to set up    public Basechar(String n){	setName(n);	setHealth(health);    }        public void setName(String name){	this.name= name;    }        public void setHealth(int h){	this.health=h;    }	        //all the get methods to get stuff    public String getName(){	return name;    }        public int getAttack(){	return attack;    }        public int getDefense(){	return defense;    }    public String toString(){	return this.getName();    }        //the methods that do stuff    public void Attack(Basechar other){ 		System.out.println(this + " is attacking " + other + "!!!");	other.health= other.health - (this.getAttack() - other.getDefense());		System.out.println(this + " did " + Integer.toString(this.getAttack() - other.getDefense())+" damage to "+other); 	System.out.println(other + "'s health: " + Integer.toString(other.health));	System.out.println(this + "'s health: " + Integer.toString(this.health));	    }}