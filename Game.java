
//  Game.java Dylan Mills/Daniel Wallace/Shu Sun 2018/11/7
//TOP DOWN SURVIVAL GAME.
//WASD MOVE.
//CLICK WHERE TO SHOOT.
//RIGHT CLICK WHERE TO DASH.
//R RELOAD.
//[space] DROP A BOMB
//INVINCIBLE WHILE DASHING.
//3 DASHES/TELEPORTS RECHARGE EVERY 3-5 SECOND
//EVERY 5 SUCCESSFUL HITS GIVE YOU A BOMB THAT DETONATES AFTER 3 SECONDS.
//1 HIT = DEATH.
//BOSS EVERY SO OFTEN.
//UNLOCK NEW WEAPONS/BOMBS/PERKS FOR YOUR SCORE.
//RANDOM BOSS EACH TIME, HEALTH BAR AT TOP/BOTTOM.

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.Timer;

public class Game extends JPanel {

	public static Color Black = new Color(10, 10, 10);
	public int x = 1920 / 2 - 10, y = 1080 / 2 - 9, w = 20, h = 20, xa = 1, ya = 1;
	public static Player player = new Player();
	public static boolean exist = true;
	public background Back = new background();
	public GUI ui = new GUI();
	public Bomb bomb = new Bomb();
	public static Game cs = new Game();
	public int dashCooldown;
	public BufferedImage img = null;
	public BufferedImage[] exp = new BufferedImage[16];
	public static long BombDroppedTime;
	public static long elapsedTime;
	Timer bombTimer = new Timer();
	public static boolean bombActive = false;
	public static int bombX;
	public static int bombY;
	boolean ended;
	int k = 15;
	int t = 0;

	public Game() {
		try {
			img = ImageIO.read(new File("assets/sans.png"));
			exp[0] = null;
			for (int i = 1; i <= exp.length - 1; i++) {
				exp[i] = ImageIO
						.read(new File("assets/Exp Anime/exp_" + i + ".png"));
			}
		} catch (IOException e) {
			System.out.println("No Image");
		}
	}

	public static void main(String[] args) {
		Cursor cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
		JFrame frame = new JFrame("Oink");
		frame.setSize(1300, 980);
		frame.setVisible(true);
		frame.add(cs);
		frame.setFocusable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setCursor(cursor);
		frame.repaint();
		frame.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				double xD = e.getX() - Player.x;
				double yD = e.getY() - Player.y;
				Player.getAngle(Math.atan2(yD, xD));
			}

		});
		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (SwingUtilities.isRightMouseButton(e)) {
					Player.x = e.getXOnScreen() - Player.l / 2;
					Player.y = e.getYOnScreen() - Player.l / 2;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
					Player.x = e.getXOnScreen() - Player.l / 2;
					Player.y = e.getYOnScreen() - Player.l / 2;
				}
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		frame.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_S) {
					if (Player.ya <= 0) {
						Player.ya += 3;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {
					if (Player.ya >= 0) {
						Player.ya += -3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_D) {
					if (Player.xa <= 0) {
						Player.xa += 3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_A) {
					if (Player.xa >= 0) {
						Player.xa += -3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					BombDroppedTime = System.currentTimeMillis();
					elapsedTime = 0;
					bombActive = true;
					bombX = Player.x;
					bombY = Player.y;
				}

				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(1);
				}
			}

			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_S) {
					if (Player.ya >= 0) {
						Player.ya -= 3;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {
					if (Player.ya <= 0) {
						Player.ya -= -3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_D) {
					if (Player.xa >= 0) {

						Player.xa -= 3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_A) {
					if (Player.xa <= 0) {
						Player.xa -= -3;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {

				}
			}
		});

		while (true) {
			elapsedTime = System.currentTimeMillis() - BombDroppedTime;
			frame.repaint();
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void paint(Graphics g) {

		if (elapsedTime > 1 * 1000)// 1 number of seconds
		{
			t++;
			bombActive = false;
			if (t == 1)
				ended = false;

		}
		Graphics2D G = (Graphics2D) g;
		G.setColor(new Color(53, 72, 104));
		G.fillRect(0, 0, 1920, 1080);

		Back.paint(G);
		if (bombActive) {
			bomb.paint(G, bombX, bombY);
		}
		if (k == 0) {
			ended = true;
			k = 15;

		}
		if (!ended && elapsedTime < 2000) {
			g.drawImage(exp[k], bombX, bombY, null);
			k--;
		}

		player.paint(G);

		ui.paint(G);

	}

}
