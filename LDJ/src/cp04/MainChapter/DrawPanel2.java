package cp04.MainChapter;

import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel2 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		int step = 15;
		
		int stepWidth = width/step;
		int stepHeight = height/step;
		
		int a = 0;
		int b = 0;
		int x = width;
		int y = 0;
		
		for (int i = step; i > 0; i--) {
			g.drawLine(a, b, x, y);
			x -= stepWidth;
			y += stepHeight;
		}
	}
}
