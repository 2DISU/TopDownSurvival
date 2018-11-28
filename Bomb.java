import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bomb {
	public BufferedImage img = null;
	Game C1;

	public Bomb() {
	try {
			img = ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/bomb.png"));
		} catch (IOException e) {
			System.out.println("No Image");
		}
	}

	static Game cs = new Game();
	
	public void paint(Graphics2D g,int bombX,int bombY) {

			g.drawImage(img, bombX, bombY, null);
			
	}

}

	


