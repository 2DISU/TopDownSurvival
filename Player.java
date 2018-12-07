import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.MouseInfo;
import java.awt.geom.AffineTransform;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class Player extends JPanel implements MouseMotionListener{

	
	Game C1;
	public static int l = 150, x=0, y=0;
	public static int xa = 0, ya = 0;
	public BufferedImage img = null;
	public int mX,mY; 
	
	
	public static double rAngle;
	AffineTransform At= new AffineTransform();
	public Player() {
	
			try {
				img=ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
				
				
			} catch (IOException e) {
			try {
				img=ImageIO.read(new File("C:/Documents/GitHub/TopDownSurvival/assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
				
			}catch(IOException h) {}
			}
			addMouseMotionListener(this);
	}
	public static void getAngle(double A)
	{
		A=rAngle;
	}
	
	public void paint(Graphics2D g) {
		At.rotate(rAngle);
		At.setToTranslation(x,y);
		g.drawImage(img,At, null);
		

	}

}


