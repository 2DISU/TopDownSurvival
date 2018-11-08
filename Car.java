import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;

public class Car {
	public int xa = 2;
	public int x = 0;
	public int y = 725;
	public BufferedImage img = null;

	public Car() {
		try {
			img = ImageIO.read(new File("carbeetle.png"));
		} catch (IOException e) {
			System.out.println("No Image");
		}
	}

	public void move() {
		if (x + xa <= 0 || x + xa >= 1160) {
			xa = -xa;
		}
		x += xa;
	}

	public int MIDWIDTH = 64;
	public int xd;

	public void paint(Graphics2D g) {
		if (Game.exist)
		{
		if (xa > 0) {
			
			g.drawImage(img, x, y, null);
			MIDWIDTH = 64;
			xd=x;
		} else {
			
			g.drawImage(img, x+128, y, -128, 128, null);
			MIDWIDTH = -64;
			xd=x+128;
			
		}
	}
	}
}