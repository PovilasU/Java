package Ex86_DrawingMoreStuff;
import javax.swing.*;
import java.awt.*;

public class DrawingMoreStuff {

	public static void main(String[] args) {
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Peach p = new Peach();
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(500, 270);
		f.setVisible(true);

	}

}
