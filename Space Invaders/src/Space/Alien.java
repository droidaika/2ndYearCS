package Space;

import java.awt.Image;

public class Alien extends Sprite2D {
	
	
	
	Image imageB;
	int framesDrawn =0;
	public Alien(Image i,Image i2, int WindowWidth) {
		super(i, WindowWidth);
		
		imageB =i2;
		
		xSpeed = 1;
	    
	}

	public void reverseDirection(){
		y+=10;
		xSpeed *= -1;
	}
	
	
	public boolean move(){
		
			framesDrawn++;
			if ( framesDrawn ==50 ){
				Image temp = myImage;
				myImage = imageB;
				imageB = temp;
				framesDrawn =0;
			
			}
			x +=10*xSpeed;
			if(x>= InvadersApplication.WindowSize.width-50|| x<= 0 ){
				return true;
			}else{
				return false;
			}
		
		
		
	
		
	}

	@Override
	public void setXSpeed(double dx) {
		// TODO Auto-generated method stub
		xSpeed *= dx;
	}
	
	

}
