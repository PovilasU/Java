package Tu20_IntroductionToApplets;
import java.awt.*;
import javax.swing.*;

//applets most comon used java on internet , way using java program through internet browser

public class IntroductionToApplets extends JApplet{
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("wow this actually worked?", 25, 25);
	}
	
}
