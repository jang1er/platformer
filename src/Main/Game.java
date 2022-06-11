package Main;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {
		
		// make new window
		JFrame window = new JFrame("Platformer Test");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
	}

}
