import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2 extends JFrame implements ActionListener{

    private Container pane;
    private JButton b1,b2;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;

    private class Kew implements KeyListener{
	public void keyPressed(KeyEvent e){};
	public void keyReleased(KeyEvent e){};
	public void keyTyped(KeyEvent e){};
    }

    public void actionPerformed(ActionEvent e){
	if (e.getSource() == b1){
	    System.out.println("You clicked : Click me");
	    System.out.println("In the test box:"+text.getText());
	}else if (e.getSource() == b2){
	    System.out.println("Shutting down");
	    System.exit(0);
	}
    }
    
    public GUI2(){
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
	b1.addActionListener(this);
	b2 = new JButton("exit");
	pane.add(b2);
	b2.addActionListener(this);
	text=new JTextArea();
	text.setColumns(50);
	text.setRows(10);
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(canvas);
	

	/*
	pane.add(new JButton("hello1"));
	pane.add(new JButton("hello2"));
	pane.add(new JButton("hello3"));
	*/
    }
    
    public static void main(String[] args){
	GUI2 f=new GUI2();
	f.setVisible(true);
    }
    
}
