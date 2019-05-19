import javax.swing.*;
public class First {
public static void main()
{
	JFrame jfrm = new JFrame();
	JButton jbn = new JButton("Click Me");
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfrm.getContentPane().add(jbn);
	jfrm.setSize(300, 300);
	jfrm.setVisible(true);
}
}
