//working
public class Driver{
	public static void main (String[] args){
	    Warrior yolo= new Warrior("yolo");
	    Monster aslo= new Monster("aslo");
	    aslo.Attack(yolo);
	    System.out.println("");
	    yolo.Attack(aslo);
	}
}
