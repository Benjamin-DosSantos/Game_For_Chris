package game.handlers;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class BackgroundHandler extends Applet{
	public static void main(String[] args){
		
	}	
	
	public void drawBackground(Graphics g){
		String[] Backgrounds = {"images\\BackgroundDayTime.png", "images\\BackgroundNightTime.png"};
		Image img = getImage(getCodeBase(), Backgrounds[0]);
		g.drawImage(img, 50, 50, ImageHandler());
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.blue);
	}

	private static ImageObserver ImageHandler() {
		// TODO Auto-generated method stub
		return null;
	}
}	// End of BackgroundHandler
