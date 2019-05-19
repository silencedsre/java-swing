import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Color;
public class BorderLayout1 {
BorderLayout1()
{
	JFrame frame = new JFrame("window for borderLayout");
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel(new BorderLayout());
JPanel top = new JPanel();
top.setBackground(Color.gray);
top.setPreferredSize(new Dimension(300,200));
panel.add(top);
panel.setBorder(new EmptyBorder(new Insets(20,20,20,20)));
frame.add(panel);
frame.setLocationRelativeTo(panel);
frame.pack();
}
public static void main(String args[])
{
new BorderLayout1();	
}
}
