import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class background {
	public BufferedImage[] tile =new BufferedImage[17];
	public int xOffset=-85;
	public int yOffset=-50;
	public int h=256;//tile height
	public background()
	{
		try {
			for (int i=0;i<=tile.length;i++) {
			tile[i] = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_"+i+".png"));
			}
		} catch (IOException e) {
			System.out.println("No Image");
		}
	}
	public void paint(Graphics2D g)
	{	
		
		g.drawImage(tile[0],0+xOffset,0+yOffset, null);
		g.drawImage(tile[3],0+xOffset,h+yOffset, null);
		g.drawImage(tile[3],0+xOffset,2*h+yOffset, null);
		g.drawImage(tile[6],0+xOffset,3*h+yOffset, null);
		//g.drawImage();
	}
}
