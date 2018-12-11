import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class Player extends JPanel implements MouseMotionListener {

	Game C1;
	public static int l = 150, x = 0, y = 0;
	public static int xa = 0, ya = 0;
	public BufferedImage img = null;
	public int mX, mY;

	AffineTransform At = new AffineTransform();
	double imageAngleRad;
	private Point imagePosition = new Point(x, y);

	public Player() {

		try {
			img = ImageIO.read(
					new File("assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));

		} catch (IOException e) {
			try {
				img = ImageIO.read(new File(
						"assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));

			} catch (IOException h) {
			}
		}
		addMouseMotionListener(this);
	}

	public void paint(Graphics2D g) {

		super.paintComponent(g);

		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	
		x += xa;
		y += ya;
		imagePosition.x =x;
		imagePosition.y = y;
		int cx = img.getWidth() / 2;
		int cy = img.getHeight() / 2;
		AffineTransform oldAT = g.getTransform();
		g.translate(cx + imagePosition.x, cy + imagePosition.y);
		g.rotate(imageAngleRad);
		g.translate(-cx, -cy);
		g.drawImage(img, 0, 0, null);
		g.setTransform(oldAT);

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}