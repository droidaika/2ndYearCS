package Space;

import java.awt.Image;

public class PlayerBullet extends Sprite2D{

	public PlayerBullet(Image i, int WindowWidth){
		super(i,WindowWidth);
	}
	
	public boolean move(){
		y-=5;
		if(x== InvadersApplication.WindowSize.width-50|| x== 0 ){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public void setXSpeed(double dx) {
		// TODO Auto-generated method stub
		
	}

	
}
