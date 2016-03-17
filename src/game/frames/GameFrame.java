package game.frames;

import game.handlers.BackgroundHandler;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame {
	public static void main(String[] args){
		draw(null);
	}	// End Of Main
	
	public static void draw(Graphics g){
	String game_frame_name = "Chris' Game";
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	// Sets the toolkit to get the screen size
		int width = (int)screenSize.getWidth();		// Gets the width portion of the screen size
		int height = (int)screenSize.getHeight();	// Gets the height portion of the screen size
		
		JFrame game_frame = new JFrame(game_frame_name);
		JPanel game_panel = new JPanel();
		game_frame.setVisible(true);
		game_frame.add(game_panel);
		game_panel.setVisible(true);
		game_frame.setSize(new Dimension(width, height));
		
		BackgroundHandler bg_handler = new BackgroundHandler();
		bg_handler.drawBackground(g);
	}
}	//	End Of Class
