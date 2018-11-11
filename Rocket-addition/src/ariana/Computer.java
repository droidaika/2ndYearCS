package ariana;

public class Computer{

	private static int TIME_BETWEEN_READINGS = 5;
	private int numReadings;

	private Oxygen oxygen;
	private Fuel fuel;
	private Thrusters thrusters;
	private double altitude;
	private double ave_acceleration;
	private double velocity;
	private boolean criticalError;
	private double thrust;
	private int destination;

	private double alt = 0;
	private double oldVelocity;

	public Computer(int oxygen, double fuel, int destination) {
		this.thrusters = new Thrusters(this);
		this.oxygen = new Oxygen(oxygen);
		this.fuel = new Fuel(fuel);
		this.destination = destination;
		this.thrust = 0;
		this.velocity=0;
		this.oldVelocity = 0;
		this.ave_acceleration=0;
		this.altitude = 0;
		this.numReadings= 0;
		this.criticalError = false;
	}
	






	private double calculateAltitude (double acceleration){
		
		oxygen.decreaseOxygen(TIME_BETWEEN_READINGS);
		 alt = alt + (oldVelocity*TIME_BETWEEN_READINGS) + (0.5 * acceleration * TIME_BETWEEN_READINGS * TIME_BETWEEN_READINGS);
		return alt;
	}

	private boolean getAltitudeError(double alt) {
		if (alt< altitude){
			System.out.println("Major Telemetry Malfunction: altitude dropping ");
			return true;
		}else
		if (oxygen.getTimeLeft() <= 0){
			System.out.println("Major Telemetry Malfunction: no oxygen ");
			return true;
		}else if( fuel.getCurrentFuel() <= 0){
			System.out.println("Major Telemetry Malfunction: no fuel ");
			return true;
		}
		return false;
	}



	public void goThrusters() {
		
		if(estTime()< (oxygen.getTimeLeft()) && oxygen.getTimeLeft() > 20){ 
			
			int estFuelCost = (int) (estTime()*fuel.getFuelUse());
			if(estFuelCost > fuel.getCurrentFuel()){
				
				System.out.println("The estimate amount of fuel that will be used throughout the journey \n is " + estFuelCost + ". This is unsustainable as the current amount of fuel is less\n and therefor the thrust must be decreased." );
				thrusters.go(0);
			}
		    else{
			thrusters.go(1);
			}
		}else{
		thrusters.go(2);
		}
	}
	
	public double estTime(){
		
		double estTime = (2 *(this.destination-this.altitude))/(velocity+oldVelocity);
		return estTime;
	}

	public double getVelocity(){
		return velocity;
	}

	public double getAverageAcceleration(){
		return ave_acceleration;
	}

	public double getAltitude(){
		return altitude;
	}

	private double calculateAverageAcceleration(double newVelocity){
		
		double current_acceleration = ( (newVelocity - velocity))/(  TIME_BETWEEN_READINGS );
		++numReadings;
		return current_acceleration;
	}

	private void updateTelemetryData(double thrust) {
		double newVelocity = calculateVelocity(thrust);
		this.ave_acceleration= calculateAverageAcceleration(newVelocity);
		fuel.decreaseFuel(newVelocity);
		 this.oldVelocity = velocity;
		 alt= calculateAltitude(ave_acceleration);
		
		this.criticalError = getAltitudeError(alt);
		this.altitude = alt;
		this.velocity = newVelocity;
		this.thrust = thrust;
	}

	public void setThrust(double thrust) {
		updateTelemetryData(thrust);
	}

	private double calculateVelocity(double thrust) {
		// very simplistic thrust calculation!
		return thrust/100;

	}

	public boolean getMalfunctionStatus(){
		return this.criticalError;
	}


	public double getThrust() {
		return this.thrust;
	}


	public int getTimeSinceLaunch() {
		return numReadings*TIME_BETWEEN_READINGS;
	}



	public double getDestination() {
		// TODO Auto-generated method stub
		return this.destination;
	}







	public void getOxyFuel() {
		// TODO Auto-generated method stub
		System.out.printf("oxygen: %f \n", oxygen.getTimeLeft());
		System.out.printf("fuel: %f \n", fuel.getCurrentFuel());
	}


}
