import java.awt.*;
import javax.swing.*;
public class SimpleAnimation {
  int x= 40, y= 50;
	
	public static void main(String [] args)
	{
		
		SimpleAnimation gui = new SimpleAnimation();
		gui.func();
	}
	public void func()
	{
		
		JFrame frame = new JFrame("my window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel obj = new MyDrawPanel();
		frame.getContentPane().add(obj);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		for(int i=0;i<130;i++)
		{
			
			x++;
			y++;
			obj.repaint();
			try{
				Thread.sleep(50);
				}
			catch(Exception e)
			{}
		}
	}
	public class MyDrawPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g)
	{
	g.setColor(Color.white);
	g.fillRect(0, 0, this.getWidth(), this.getHeight());
	g.setColor(Color.blue);
	g.fillOval(x, y, 100, 100);
	}
	}

}
