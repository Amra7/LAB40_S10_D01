package predavanje_StackAndQueue;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawWithUndo {
	
	static int x = 40;
	static int y = 40;

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Draw Circle");
		window.setSize(600, 600);
		Draw panel = new Draw();
		
		MouseHandler mh = new MouseHandler();
		panel.addMouseListener(mh);
		panel.setBackground(Color.BLACK);
		panel.requestFocus(true);
		
		window.setContentPane(panel);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static class Draw  extends JPanel {
		public void paintComponent (Graphics g){
			super.paintComponent(g);
		}
		
	}
	
	public static class MouseHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();
			
			g.setColor(Color.MAGENTA);
			g.fillOval(e.getX()-x/2, e.getY()-y/2, x, y);

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();
			
			g.setColor(Color.MAGENTA);
			g.fillOval(e.getX()-x/2, e.getY()-y/2, x, y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			
			
		}
		
	}
}
