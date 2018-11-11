package Space;

import java.awt.Graphics;
import java.awt.Image;


public abstract class Sprite2D {

	protected double x,y;
	
	protected Image myImage;
	
	protected double xSpeed = 0;
	
	protected int winWidth;
	
	public Sprite2D(Image i, int windowWidth) {
		myImage = i;
		winWidth = windowWidth;

	}
	
	public void setPosition(int xx, int yy) {
		x=xx;
		y=yy;
	}
	
	
	public void paint(Graphics g) {
		g.drawImage(myImage, (int)x, (int)y, winWidth,winWidth, null);
	}
	
	public abstract  void setXSpeed(double dx);
	
	
	
}




