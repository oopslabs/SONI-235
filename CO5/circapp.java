package Co5;
import java.applet.*;
import java.awt.*;
public class circapp extends Applet {

	public void paint(Graphics g) {
		g.drawLine(125, 25, 250, 25);
		g.setColor(Color.yellow);
		g.fillRect(50,120,370,120);  
		g.setColor(Color.red);
		g.fillOval(725,150,50,100);
		
	}

}
