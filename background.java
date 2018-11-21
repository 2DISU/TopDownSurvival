import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class background {
	public BufferedImage tile1,tile2,tile3,tile4,tile7 = null;
	public int xOffset=-85;
	public int yOffset=-50;
	public int h=256;//tile height
	public background()
	{
		try {
			tile1 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_1.png"));
			tile2 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_2.png"));
			tile3 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_3.png"));
			tile4 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_4.png"));
			tile1 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_1.png"));
			tile1 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_1.png"));
			tile1 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_1.png"));
			tile1 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_1.png"));
			tile1 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_1.png"));
			tile7 = ImageIO.read(new File("\\\\SS08\\S231 Students$\\S201060117\\Documents\\GitHub\\TopDownSurvival\\assets\\desert_top_down\\images\\Tile_7.png"));
		} catch (IOException e) {
			System.out.println("No Image");
		}
	}
	public void paint(Graphics2D g)
	{	
		
		g.drawImage(tile1,0+xOffset,0+yOffset, null);
		g.drawImage(tile4,0+xOffset,h+yOffset, null);
		g.drawImage(tile4,0+xOffset,2*h+yOffset, null);
		g.drawImage(tile7,0+xOffset,3*h+yOffset, null);
		
	}
}
