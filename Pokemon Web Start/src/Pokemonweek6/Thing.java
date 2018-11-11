package Pokemonweek6;

public abstract class Thing {
	
	protected int x,y;
	
	public int getCoordX() {
		// TODO Auto-generated method stub
		return (int)x;
	}
	
	public int getCoordY() {
		// TODO Auto-generated method stub
		return (int)y;
	}
	
	public void setCoord(int x, int y) {
		// TODO Auto-generated method stub
		this.x =x; this.y =y;
	}
	

}
