import java.awt.Graphics;
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

public class Player extends JPanel implements MouseMotionListener{

	Game C1;
	public static int l = 150, x = 0, y = 0;
	public static int xa = 0, ya = 0;

	public int mX, mY;
	
	
	AffineTransform At = new AffineTransform();
	double imageAngleRad=0;
	private Point imagePosition = new Point(Player.x, Player.y);
	private BufferedImage image;



	public Player() {
		BufferedImage i = null;
		try {
			i = ImageIO.read(
					new File("assets/Top_Down_Survivor/Top_Down_Survivor/handgun/idle/survivor-idle_handgun_11.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		image = i;
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		double dx = e.getX() - imagePosition.getX();
		double dy = e.getY() - imagePosition.getY();
		imageAngleRad = Math.atan2(dy, dx);
		repaint();
	}

	public void paint(Graphics gr) {
		super.paint(gr);
		Graphics2D g = (Graphics2D) gr;
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

		int cx = image.getWidth() / 2;
		int cy = image.getHeight() / 2;
		AffineTransform oldAT = g.getTransform();
		g.translate(cx + imagePosition.x, cy + imagePosition.y);
		g.rotate(imageAngleRad);
		g.translate(-cx, -cy);
		g.drawImage(image, 0, 0, null);

		g.setTransform(oldAT);

	}

}