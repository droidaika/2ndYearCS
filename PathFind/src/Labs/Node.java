package Labs;

public class Node {

	private int x,y;
	private int g =0,h = 0;
	private Node pa = null;
	public void setCoord(int k, int j) {
		// TODO Auto-generated method stub
		x=k;
		y=j;
	}
	public int getCoordx() {
		// TODO Auto-generated method stub
		return x;
	}
	public int getCoordy() {
		// TODO Auto-generated method stub
		return y;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getF() {
		return g+h;
	}
	public void setParent(Node pa) {
		this.pa = pa;
	}
	public Node getParent() {
		return pa;
	}
	
}
