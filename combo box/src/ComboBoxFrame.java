import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.Icon;
public class ComboBoxFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<?> cbox;
	private JLabel label;
	private static final String[] names = {"a.png", "b.png", "c.png", "d.png"};
	private Icon[] icons = {
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3])),
	};
	public ComboBoxFrame()
	{
super("Testing Combo Box");
setLayout(new FlowLayout());
cbox = new JComboBox(names);
cbox.setMaximumRowCount(3);
cbox.addItemListener(new ItemListener()
		{
	
	public void itemStateChanged(ItemEvent event)
	{
		if(event.getStateChange()==ItemEvent.SELECTED)
			label.setIcon(icons[cbox.getSelectedIndex()]);
	}
		}
		);
add(cbox);
label = new JLabel(icons [0]);
add(label);
	}
}
