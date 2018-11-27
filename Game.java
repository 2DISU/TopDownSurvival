
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
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.time.Duration;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Game extends JPanel {

	public static Color Black = new Color(10, 10, 10);
	public int x = 1920 / 2 - 10, y = 1080 / 2 - 9, w = 20, h = 20, xa = 1, ya = 1;
	public static Player player = new Player();
	public static boolean exist = true;
	public background Back=new background();
	public GUI ui = new GUI();
	public Beam beam = new Beam();
	public static Game cs = new Game();
	public int dashCooldown;
	public static void main(String[] args) {
		Cursor cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
		 
		JFrame frame = new JFrame("[Game]");
		frame.setSize(1300, 980);
		
//		frame.setCursor(frame.getToolkit().createCustomCursor(
//	            new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),
//	            "null"));
//		frame.setSize(1280, 990);

		frame.setVisible(true);
		frame.add(cs);
		frame.setFocusable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.repaint();
		frame.setCursor(cursor);
		frame.addMouseListener(new MouseListener() {
		
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (SwingUtilities.isRightMouseButton(e))
				{	player.x =  e.getXOnScreen()-player.w /2 ;
					player.y = e.getYOnScreen()-player.h ;}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e))
				{	player.x =  e.getXOnScreen()-player.w /2 ;
					player.y = e.getYOnScreen()-player.h ;}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});

		frame.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_S) {
					if (player.ya <= 0) {
						player.ya += 3;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {
					if (player.ya >= 0) {
						player.ya += -3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_D) {
					if (player.xa <= 0) {
						player.xa += 3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_A) {
					if (player.xa >= 0) {
						player.xa += -3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					Beam.velocity = 3;
					if (Beam.beamheight < 0) {
						Beam.beamheight = Beam.velocity = 0;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(1);
				}}

			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_S) {
					if (player.ya >= 0) {
						player.ya -= 3;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {
					if (player.ya <= 0) {
						player.ya -= -3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_D) {
					if (player.xa >= 0) {

						player.xa -= 3;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_A) {
					if (player.xa <= 0) {
						player.xa -= -3;}
				}
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					Beam.velocity = -2;
				}
			}
		});

		while (true) {

			frame.repaint();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D G = (Graphics2D) g;
		G.setColor(new Color(53, 72, 104));
		G.fillRect(0, 0, 1920, 1080);
		Back.paint(G);
		beam.paint(G, player.x, player.y);
		player.paint(G);
		ui.paint(G);

	}

}
