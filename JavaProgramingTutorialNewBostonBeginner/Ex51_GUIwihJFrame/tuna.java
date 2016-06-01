package Ex51_GUIwihJFrame;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel; // allow to output text and images

public class tuna extends JFrame{
	private JLabel item1;
	
	public tuna(){
		super("The title bar"); // title to our window
		setLayout(new FlowLayout());
		
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("This is gonna show up on hover");
		add(item1);
	}
	

}
