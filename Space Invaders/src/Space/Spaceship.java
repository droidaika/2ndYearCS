package Space;

import java.awt.Image;

public class Spaceship extends Sprite2D{

	public Spaceship(Image i, int WindowWidth) {
		super(i, WindowWidth);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void setXSpeed(double dx) {
		xSpeed =dx;
		
	}

	
	public void move() {
		// TODO Auto-generated method stub
		if(x>0 && xSpeed<0 ||x< InvadersApplication.WindowSize.width-50 && xSpeed >0 ){
			x+=15*xSpeed;
			}
			
	}



	
	
}
