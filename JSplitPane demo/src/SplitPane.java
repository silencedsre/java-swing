import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SplitPane extends JFrame{
static String someText = "This is a simple text string that is long enough " +
		"to wrap over a few lines in the simple demo we're about to build. We'll " +
		"put two text areas side by side in a split pane.";
public SplitPane()
{
super("SplitPane Demo");
JTextArea text1 = new JTextArea(someText);
JTextArea text2 = new JTextArea(someText);
text1.getLineWrap();
text2.getLineWrap();
text1.setMinimumSize(new Dimension(100,100));
text2.setMinimumSize(new Dimension(200,200));
text1.setPreferredSize(new Dimension(300,200));
JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,text1,text2);
getContentPane().add(BorderLayout.CENTER,splitPane);
}
public static void main(String args[])
{
SplitPane gui = new SplitPane();
gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
gui.setVisible(true);
gui.setSize(400,300);
}
}
