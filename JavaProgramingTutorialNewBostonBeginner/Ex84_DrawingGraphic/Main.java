package Ex84_DrawingGraphic;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach p = new Peach();
		f.add(p);
		f.setSize(400,250);
		f.setVisible(true);
		

	}

}