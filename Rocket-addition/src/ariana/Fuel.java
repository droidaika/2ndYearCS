package ariana;

public class Fuel {
	
	
	private double currentFuel;
	private double fuelUse;

	public Fuel(double fuel) {
		// TODO Auto-generated constructor stub
		this.currentFuel = fuel;
	}



	public void decreaseFuel(double velocity) {
		// TODO Auto-generated method stub
		fuelUse =  (Math.pow(1.1, velocity));
		currentFuel = currentFuel - fuelUse ;
		
	}



	public double getFuelUse() {
		// TODO Auto-generated method stub
		return this.fuelUse;
	}



	public double getCurrentFuel() {
		// TODO Auto-generated method stub
		return this.currentFuel;
	}
}
