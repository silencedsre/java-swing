import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class PaintTest {
public static void main(String[] args)

{
JFrame application = new JFrame("A java paint application: By Sre");
PaintPanel panel = new PaintPanel();
application.add(panel,BorderLayout.CENTER);
JLabel label = new JLabel("Drag the mouse to draw----Sre Application");
application.add(label, BorderLayout.SOUTH);
application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
application.setSize(400,300);
application.setVisible(true);
}
}
