import java.awt.*;
import javax.swing.*;
public class Image {
public static void main(String args[])
{
Image gui = new Image();
gui.func();
}
public void func()
{
JFrame frame = new JFrame("my window");

ImageIcon img = new ImageIcon("a.jpg");
JLabel label = new JLabel("",img,JLabel.CENTER);
label.setIcon(img);
JPanel panel = new JPanel(new BorderLayout());
panel.add(label, BorderLayout.CENTER);
frame.getContentPane().add(panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);
frame.setVisible(true);
}
}

