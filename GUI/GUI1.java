import javax.swing.*;
import java.awt.*;

public class GUI1 extends JFrame{

    public GUI1(){
	setTitle("Hi");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
	GUI1 f=new GUI1();
	f.setVisible(true);
    }
    
}
