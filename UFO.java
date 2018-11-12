import java.awt.Color;
import java.awt.Graphics2D;

public class UFO {

	Color UFO1 = new Color(10, 10, 10);
	Color UFO2 = new Color(30, 120, 30);
	Game C1;
	public static int w = 20, h = 20, x=0, y=0;
	public static int xa = 0, ya = 0;

	public UFO() {

	}

	static Game cs = new Game();

	public void paint(Graphics2D g) {
		x+=xa;
		y+=ya;
		g.setColor(UFO2);
		g.fillOval(x, y, w, h);

	}

}
