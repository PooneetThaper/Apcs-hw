import java.util.*;

public class OrderedSuperArray extends SuperArray {
    public String[] data;
    public int last;

    public OrderedSuperArray() {
	super();
    }
    
    public boolean adding(String s) {
        return add(s);
	//the add function in SuperArray is already ordered
    }

    public static void main(String[] args) {
	OrderedSuperArray o = new OrderedSuperArray();
	o.adding("dino");
	o.adding("popeye");
	o.adding("banned");
	o.adding("pickle");
	o.adding("reptile");
	o.adding("ant");
	o.test();
    }

}
