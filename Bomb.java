import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bomb {
	public BufferedImage bomb = null;
	public BufferedImage[] exp = new BufferedImage[16];
	Game C1;

	public Bomb() {
	try {
			bomb = ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/bomb.png"));
			for (int i=1;i<=exp.length-1;i++) {
				exp[i]=ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/Exp Anime/exp_"+i+".png"));
			}
		//img = ImageIO.read(new File("C:/Users/Daniel/Documents/GitHub/TopDownSurvival/assets/bomb.png"));
		
		} catch (IOException e) {
			System.out.println("No Image");
		}
	}

	static Game cs = new Game();
	
	public void paint(Graphics2D g,int bombX,int bombY) {

			g.drawImage(bomb, bombX, bombY, null);
			for (int i=1;i<=exp.length-1;i++)
			{
				g.drawImage(exp[i],bombX,bombY,null);
			}
	}

}

	


