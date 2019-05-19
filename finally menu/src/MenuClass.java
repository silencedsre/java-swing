import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
public class MenuClass extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public MenuClass()
{
setTitle("Menu Bar");
JMenuBar menuBar = new JMenuBar();
ImageIcon icon = new ImageIcon("exit.png");
ImageIcon icon1 =new ImageIcon("a.jpg");
JMenu file = new JMenu("File");
JMenu edit = new JMenu("Edit");
file.setMnemonic(KeyEvent.VK_F);
edit.setMnemonic(KeyEvent.VK_E);
JMenuItem fileClose = new JMenuItem("Close", icon);
JMenuItem open = new JMenuItem("Open");
fileClose.setMnemonic(KeyEvent.VK_C);
open.setMnemonic(KeyEvent.VK_O);
fileClose.setToolTipText("exits application");
open.setToolTipText("Opens a file :D");
JLabel label = new JLabel(icon1);
fileClose.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent event)
	{
		System.exit(0);
		
	}
	
		});
open.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent event)
	{
		
		add(label);
		label.setBounds(10,10,640-5,480-5);
	}
		});
file.add(open);
file.add(fileClose);
menuBar.add(file);
menuBar.add(edit);
setJMenuBar(menuBar);
setSize(640+20,480+20);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String [] args)
{
new MenuClass();	
}
}
