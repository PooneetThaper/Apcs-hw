public class Warrior extends Basechar{
    int healthboost=(int)Math.ceil(Math.random()*50)-25;
    public Warrior (String n) {
	super(n);
	this.health=this.health + healthboost;
	this.attack=this.attack + (int)Math.ceil(Math.random()*5) + 5;
    }
    /*
      public void Attack (Basechar other) {
      System.out.println(this + " is attacking " + other + "!!!");
      }
    */
}
