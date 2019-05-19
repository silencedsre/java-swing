import java.awt.*;
import javax.swing.*;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
public class Panel {
public static void main(String args [])
{
Panel gui = new Panel();
gui.myFunc();
}
public void myFunc()
{
JFrame frame = new JFrame("my window");
JPanel panel = new JPanel();
panel.setBackground(Color.pink);
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
JButton button = new JButton("my button");
JButton b = new JButton("click here");
panel.add(b);
panel.add(button);
frame.getContentPane().add(BorderLayout.EAST, panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);
frame.setVisible(true);
}
}
