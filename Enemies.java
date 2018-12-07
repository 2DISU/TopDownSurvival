import java.awt.Graphics2D;

public class Enemies {
	public int xPosition;
	public int yPosition;
public Enemies(int a, int b)
{
	xPosition = a;
	yPosition = b;
}

public void paint(Graphics2D g) {
 g.fillRect(xPosition, yPosition, xPosition+50, xPosition+30);
}
}
