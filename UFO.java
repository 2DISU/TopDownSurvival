import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.MouseInfo;
import java.awt.geom.AffineTransform;
public class UFO {

	Color UFO1 = new Color(10, 10, 10);
	Color UFO2 = new Color(30, 120, 30);
	Game C1;
	public static int w = 100, h = 100, x=0, y=0;
	public static int xa = 0, ya = 0;
	public BufferedImage img = null;
	public UFO() {
		try {
			img = ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
		} catch (IOException e) {
			System.out.println("No Image");
		}
		AffineTransform At= new AffineTransform();
	}

	static Game cs = new Game();

	public void paint(Graphics2D g) {
		x+=xa;
		y+=ya;
		g.setColor(UFO2);
		System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + ", " + MouseInfo.getPointerInfo().getLocation().y + ")");
		//https://docs.oracle.com/javase/7/docs/api/java/awt/geom/AffineTransform.html
		//public void rotate(double theta,double anchorx,double anchory)
		
		g.drawImage(img, x, y,w,h, null);
		//g.fillOval(x, y, w, h);

	}

}
