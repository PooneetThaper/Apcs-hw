public class Monster extends Basechar{
    int healthboost=(int)Math.ceil(Math.random()*100)-25;
    public Monster (String n) {
	super(n);
    }
    /*
      public void Attack (Basechar other) {
      System.out.println(this + " is attacking " + other + "!!!");
	}
    */
}


