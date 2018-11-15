import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.MouseInfo;
import java.awt.geom.AffineTransform;
public class Player {

	
	Game C1;
	public static int w = 100, h = 100, x=0, y=0;
	public static int xa = 0, ya = 0;
	public BufferedImage img = null;
	AffineTransform At= new AffineTransform();
	public Player() {
		try {
			img = ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
		} catch (IOException e) {
			System.out.println("No Image");
		}
		
	}


	public void paint(Graphics2D g) {
		
		x+=xa;
		y+=ya;
		
		System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + ", " + MouseInfo.getPointerInfo().getLocation().y + ")");
		//https://docs.oracle.com/javase/7/docs/api/java/awt/geom/AffineTransform.html
		At.rotate(Math.toRadians(15), w / 2,
			        h / 2);

		
		g.drawImage(img,At,w,h, null);
		//g.fillOval(x, y, w, h);

	}

}
