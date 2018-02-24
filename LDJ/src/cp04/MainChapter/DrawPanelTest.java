package cp04.MainChapter;

import javax.swing.JFrame;

public class DrawPanelTest {
	public static void main(String[] args) {
		DrawPanel2 panel = new DrawPanel2();
		
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		app.add(panel);
		app.setSize(250, 250);
		app.setVisible(true);
	}
}
