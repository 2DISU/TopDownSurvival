import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GUI {
	public BufferedImage UI=null;
public GUI()
{
	try {
		UI=ImageIO.read(new File("U:\\Documents\\GitHub\\TopDownSurvival\\assets\\ui.png"));
	} catch (IOException e) {
	
	}
}
public void paint(Graphics2D g)
{
	g.drawImage(UI,0,0, null);
}

}
