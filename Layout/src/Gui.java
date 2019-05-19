import javax.swing.*;
import java.awt.*;
public class Gui {
	public static void main(String [] args)
	{
Gui gui1 = new Gui();
gui1.go();
}
public void go() {
	JFrame frame = new JFrame();
	JButton east = new JButton("East"); 
	JButton west = new JButton("West");  
	JButton north = new JButton("North");
	JButton south = new JButton("South");
	JButton center = new JButton("Center"); 
	frame.getContentPane().add(BorderLayout.EAST, east);  
	frame.getContentPane().add(BorderLayout.WEST, west);
	frame.getContentPane().add(BorderLayout.NORTH, north); 
	frame.getContentPane().add(BorderLayout.SOUTH, south);
	frame.getContentPane().add(BorderLayout.CENTER, center);
frame.setSize(300,300); 
frame.setResizable(false);
frame.setVisible(true);  
}

}
