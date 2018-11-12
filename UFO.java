import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;

public class UFO {

	Color UFO1 = new Color(10, 10, 10);
	Color UFO2 = new Color(30, 120, 30);
	Game C1;
	public static int w = 20, h = 20, x=0, y=0;
	public static int xa = 0, ya = 0;
	public BufferedImage img = null;
	public UFO() {
		try {
			img = ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival1/assets/person.png"));
		} catch (IOException e) {
			System.out.println("No Image");
		}
	}

	static Game cs = new Game();

	public void paint(Graphics2D g) {
		x+=xa;
		y+=ya;
		g.setColor(UFO2);
		
		g.drawImage(img, x, y,w,h, null);
		//g.fillOval(x, y, w, h);

	}

}
