package ch9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DrawCicle extends JFrame {

	private JPanel contentPane;
	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DrawCicle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DrawCicle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel mypanel=new MyPanel();
		add(mypanel);
		setPreferredSize(new Dimension(400,600));
		pack();
	}

}
class MyPanel extends JPanel{
	
	public static void drawLine(int r,int x1,int y1,int x2,int y2,Graphics2D g){
		class line {
			private Point a, b;

			line(Point p1, Point p2) {
				a = p1;
				b = p2;
			}
		}
		Point p1=new Point(x1,y1);
		Point p2=new Point(x2,y2);
		line n=new line(p1,p2);
		int a, b, c, d;
		a = (int) (r * (n.b.x - n.a.x)
				/ Math.sqrt((n.a.x - n.b.x) * (n.a.x - n.b.x) + (n.a.y - n.b.y) * (n.a.y - n.b.y)));
		b = (int) (r * (n.b.y - n.a.y)
				/ Math.sqrt((n.a.x - n.b.x) * (n.a.x - n.b.x) + (n.a.y - n.b.y) * (n.a.y - n.b.y)));
		c = (int) ((r + 15) * (n.b.x - n.a.x)
				/ Math.sqrt((n.a.x - n.b.x) * (n.a.x - n.b.x) + (n.a.y - n.b.y) * (n.a.y - n.b.y)));
		d = (int) ((r + 15) * (n.b.y - n.a.y)
				/ Math.sqrt((n.a.x - n.b.x) * (n.a.x - n.b.x) + (n.a.y - n.b.y) * (n.a.y - n.b.y)));
		g.drawLine(n.a.x + a, n.a.y + b, n.b.x - a, n.b.y - b);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D comp2D=(Graphics2D) g;
		comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		int r=50;
		int x1=160,y1=230;
		comp2D.drawOval(x1-r,y1-r,r*2,r*2);
		comp2D.setColor(Color.GREEN);
		int x2=300,y2=400;
		comp2D.drawOval(x2-r,y2-r,r*2,r*2);
		drawLine(r,x1, y1, x2, y2,comp2D);
		
	}
}

