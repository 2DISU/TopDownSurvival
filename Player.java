import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.MouseInfo;
import java.awt.geom.AffineTransform;
public class Player {

	
	Game C1;
	public static int l = 150, x=0, y=0;
	public static int xa = 0, ya = 0;
	public BufferedImage img = null;
	public int mX,mY; 

	AffineTransform At= new AffineTransform();
	public Player() {
	
	
			//img = ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
			try {
				img=ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
				
				
			} catch (IOException e) {
			try {
				img=ImageIO.read(new File("C:/Documents/GitHub/TopDownSurvival/assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
				
			}catch(IOException h) {}
			}
		
		
	}
	
	

	public void paint(Graphics2D g) {
		
		x+=xa;
		y+=ya;
		mX=MouseInfo.getPointerInfo().getLocation().x;
		mY=MouseInfo.getPointerInfo().getLocation().y;
		float xD = mX-x;
		float yD = mY-y;
		double rAngle = Math.toDegrees(Math.atan2(xD,yD));
		
		At.rotate(rAngle);
		At.setToTranslation(x,y);
		g.drawPolygon(new int[] {x+(l/2),mX, mX}, new int[] {y+(l/2), mY, y+(l/2)}, 3);
		g.drawImage(img,At, null);
		//g.fillOval(x, y, w, h);

	}

}
