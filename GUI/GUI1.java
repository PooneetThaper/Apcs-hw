import javax.swing.*;
import java.awt.*;

public class GUI1 extends JFrame implements ActionListener{

    private Container pane;
    private JButton b1,b2;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;

    public void ActionPerformed
    
    public GUI1(){
	setTitle("Hi");
	setSize(600,500);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane=getContentPane();
	//pane.setLayout(new GridLayout3,3));
	pane.setLayout(new FlowLayout());

	l=new JLabel("Label:");
	pane.add(l);
	b1 = new JButton("button");
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);
	text=new JTextArea();
	text.setColumns(50);
	text.setRows(10);
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(canvas);
	

	/*
	pane.add(new JButton("hello1"));
	pane.add(new JButton("hello2"));
	pane.add(new JButton("hello3"));
	*/
    }
    
    public static void main(String[] args){
	GUI1 f=new GUI1();
	f.setVisible(true);
    }
    
}
