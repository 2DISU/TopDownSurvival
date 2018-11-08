import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Building extends JPanel {

	Color night = new Color(0, 0, 90);
	Color dark = new Color(0, 5, 50);
	Color light = new Color(220, 220, 40);
	Color lessdark = new Color(50, 60, 50);
	Game C2;
	public int x = 20, y = 30, w = 50, h = 20, x2 = 35, y2 = 25, w2 = 20, h2 = 18, xa = 1, ya = 1;

	public Building(Game bb) {
	C2 = bb;		
	}
	public void paint(Graphics g) {


		g.setColor(Color.black);
		g.fillRect(15, 370, 84, 340);
		for (int xd = 20; xd <= 90; xd += 14) {
			for (int yd = 380; yd <= 695; yd += 18) {
				if (Math.random() <= 0.2) {
					g.setColor(light);
				} else {
					g.setColor(dark);
				}

				g.fillRect(xd, yd, 8, 12);
			}
		}
		g.setColor(Color.black);
		g.fillRect(150, 360, 84, 350);
		for (int xd = 155; xd <= 225; xd += 14) {
			for (int yd = 365; yd <= 700; yd += 18) {
				if (Math.random() <= 0.15) {
					g.setColor(light);
				} else {
					g.setColor(dark);
				}

				g.fillRect(xd, yd, 8, 12);
			}
		}
		g.setColor(Color.black);
		g.fillRect(300, 385, 100, 320);
		for (int xd = 305; xd <= 390; xd += 14) {
			for (int yd = 400; yd <= 700; yd += 18) {
				if (Math.random() <= 0.2) {
					g.setColor(light);
				} else {
					g.setColor(dark);
				}

				g.fillRect(xd, yd, 8, 12);
			}
		}
		g.setColor(Color.black);
		g.fillRect(470, 410, 600, 300);
		for (int xd = 475; xd <= 1045; xd += 28) {
			for (int yd = 420; yd <= 700; yd += 17) {
				if (Math.random() <= 0.07) {
					g.setColor(light);
				} else {
					g.setColor(dark);
				}

				g.fillRect(xd, yd, 20, 12);
			}
		}
		g.setColor(Color.black);
		g.fillRect(1100, 450, 100, 260);
		for (int xd = 1103; xd <= 1193; xd += 14) {
			for (int yd = 455; yd <= 700; yd += 15) {
				if (Math.random() <= 0.02) {
					g.setColor(light);
				} else {
					g.setColor(dark);
				}

				g.fillRect(xd, yd, 11, 11);
			}
		}


	}

}