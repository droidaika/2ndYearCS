package ariana;

public class Oxygen {

	
	private int O2;
	public Oxygen(int maxO2) {
		// TODO Auto-generated constructor stub
		this.O2 =maxO2;
	}
	public void decreaseOxygen(int time) {
		// TODO Auto-generated method stub
		this.O2 = this.O2 - time;
	}
	public double getTimeLeft() {
		// TODO Auto-generated method stub
		return this.O2;
	}
	

}
