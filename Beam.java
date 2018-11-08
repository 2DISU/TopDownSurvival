import java.awt.Color;
import java.awt.Graphics2D;

public class Beam {
	Color UFOBEAM = new Color(220,220,220);
	Game C1;
	public static int beamheight = 0;
	public static int velocity = 0;
	public Beam() {
		
	}

	static Game cs = new Game();
	
	public void paint(Graphics2D g,int x,int y) {
		beamheight += velocity;
		if (beamheight <0) {
			beamheight = 0;
		}
		
		g.setColor(UFOBEAM);
		g.fillRect(x+4,y+5,12, beamheight);
	}

}

	


