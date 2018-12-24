import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Boss2 extends JPanel{
	public BufferedImage[] tile = new BufferedImage[18];
	public int xOffset = -85;
	public int yOffset = -50;
	public int l = 256;// tile length

	public Boss2() {
		try {
			for (int k=1;k<=tile.length-1;k++) {
			tile[k] = ImageIO.read(new File("assets/desert_top_down/images/Tile_"+k+".png"));
			}
		} catch (IOException e) {
		}
	}
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawImage(tile[1], xOffset, 0 + yOffset, l, l, null);
		g.drawImage(tile[4], xOffset, l + yOffset, l, l, null);
		g.drawImage(tile[4], xOffset, 2 * l + yOffset, l, l, null);
		g.drawImage(tile[7], xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[8], l + xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[8], 2 * l + xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[8], 3 * l + xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[9], 4 * l + xOffset, 3 * l + yOffset, l, l, null);
		
		g.drawImage(tile[6], 4 * l + xOffset, 2 * l + yOffset, l, l, null);// --
		g.drawImage(tile[6], 4 * l + xOffset, l + yOffset, l, l, null);
		g.drawImage(tile[3], 4 * l + xOffset, yOffset, l, l, null);
		g.drawImage(tile[12], 3 * l + xOffset, yOffset, l, l, null);
		g.drawImage(tile[13], 2 * l + xOffset, yOffset, l, l, null);
		g.drawImage(tile[2], l + xOffset, yOffset, l, l, null);
		
		g.drawImage(tile[5], 2 * l + xOffset, 1 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], 2 * l + xOffset, 2 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], l + xOffset, 1 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], l + xOffset, 2 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], 3 * l + xOffset, 1 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], 3 * l + xOffset, 2 * l + yOffset, l, l, null);// midpiece
		repaint();
	}

//public static void main(String[] args) {
//	JFrame f = new JFrame("Btest");
//	  Boss2 p = new Boss2();
//	  f.setSize(1300,980);
//	  f.setVisible(true);
//	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	  f.add(p);
//	  while (true) {
//		  p.repaint();
//	  }
//}
}
