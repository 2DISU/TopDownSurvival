import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class background {
	public BufferedImage[] tile = new BufferedImage[18];
	public int xOffset = -85;
	public int yOffset = -50;
	public int l = 256;// tile length

	public background() {
		try {

			/*for (int i = 1; i <= tile.length - 1; i++) {
				tile[i] = ImageIO.read(new File("C:/Documents/GitHub/TopDownSurvival/assets/desert_top_down/images/Tile_" + i + ".png"));}
			*/	

			for (int k=1;k<=tile.length-1;k++) {
			tile[k] = ImageIO.read(new File("U:/Documents/GitHub/TopDownSurvival/assets/desert_top_down/images/Tile_"+k+".png"));
			}
		} catch (IOException e) {
		}
	}

	public void paint(Graphics2D g) {
		// g.drawImage(tile[8],5*l+xOffset,2*l-yOffset,l,l, null);
		// g.drawImage(tile[8],4*l+xOffset,2*l-yOffset,l,l, null);

		/*
		 * g.drawImage(tile[5],5*l+xOffset,2*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],4*l+xOffset,2*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],5*l+xOffset,3*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],4*l+xOffset,3*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],5*l+xOffset,4*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],4*l+xOffset,4*l-yOffset,l,l, null);
		 */

		/*
		 * g.drawImage(tile[5],5*l+xOffset,0*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],4*l+xOffset,0*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],5*l+xOffset,1*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],4*l+xOffset,1*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],5*l+xOffset,2*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],4*l+xOffset,2*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],5*l+xOffset,-1*l-yOffset,l,l, null);
		 * g.drawImage(tile[5],4*l+xOffset,-1*l-yOffset,l,l, null);
		 */

		// g.drawImage(tile[8],4*l+xOffset,(3*l+yOffset),l,l, null);
		g.drawImage(tile[1], xOffset, 0 + yOffset, l, l, null);
		g.drawImage(tile[4], xOffset, l + yOffset, l, l, null);
		g.drawImage(tile[4], xOffset, 2 * l + yOffset, l, l, null);
		g.drawImage(tile[7], xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[8], l + xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[8], 2 * l + xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[8], 3 * l + xOffset, 3 * l + yOffset, l, l, null);
		g.drawImage(tile[9], 4 * l + xOffset, 3 * l + yOffset, l, l, null);

		g.drawImage(tile[10], 4 * l + xOffset, 2 * l + yOffset, l, l, null);// --
		g.drawImage(tile[12], 4 * l + xOffset, l + yOffset, l, l, null);
		g.drawImage(tile[8], 5 * l + xOffset, 2 * l + yOffset, l, l, null);
		g.drawImage(tile[2], 5 * l + xOffset, l + yOffset, l, l, null);
		g.drawImage(tile[3], 4 * l + xOffset, yOffset, l, l, null);
		g.drawImage(tile[2], 3 * l + xOffset, yOffset, l, l, null);
		g.drawImage(tile[2], 2 * l + xOffset, yOffset, l, l, null);
		g.drawImage(tile[2], l + xOffset, yOffset, l, l, null);

		g.drawImage(tile[5], 2 * l + xOffset, 1 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], 2 * l + xOffset, 2 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], l + xOffset, 1 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], l + xOffset, 2 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], 3 * l + xOffset, 1 * l + yOffset, l, l, null);// midpiece
		g.drawImage(tile[5], 3 * l + xOffset, 2 * l + yOffset, l, l, null);// midpiece

	}
}
