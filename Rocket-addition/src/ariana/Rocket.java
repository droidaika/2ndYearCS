package ariana;

public class Rocket {

	private double altitude;
	private double acceleration;
	private double velocity;
	private double thrust;
	

	private Computer computer;
	private int time;
	
	
	public Rocket(int oxygen, double fuel, int destination){
		this.computer = new Computer(oxygen,fuel,destination);
		this.time = 0;
		this.thrust = 0;
		this.altitude = 0;
		this.acceleration = 0;
		this.velocity = 0;
		
	}
	
	

	
	public double getAltitude() {
		return this.altitude;
	}

	public void reportStatus(){
		System.out.printf("Ariana 5: Time: %d seconds \n", time);
		if (!computer.getMalfunctionStatus()){
			System.out.printf("All systems go. \n");
		}else{
			System.out.printf("Major error reported by computer \n");
			System.out.printf("Mission abort\n");
			System.out.printf("Reporting telemetry status:\n");
		}
		computer.getOxyFuel();
		System.out.printf("thrust: %f \n", thrust);
		System.out.printf("velocity: %f \n", velocity);
		System.out.printf("acceleration: %f \n", acceleration);
		System.out.printf("altitude: %f \n\n", altitude);
	}

	public void blastOff() {
		System.out.printf("\nAriana 5 Blastoff! \n\n");
		computer.goThrusters();
	}
	
	public void getTelemetry() {
		
		this.time = computer.getTimeSinceLaunch();
		this.altitude = computer.getAltitude();
		this.velocity = computer.getVelocity();
		this.thrust = computer.getThrust();
		this.acceleration = computer.getAverageAcceleration();
	}

	public boolean hasMajorError() {
		return computer.getMalfunctionStatus();
	}

	public boolean isMissionAccomplished() {
		if (this.getAltitude() < computer.getDestination()){
			computer.goThrusters();
			return false;
		}else{
			System.out.println("mission accomplished. Ariana reached " + computer.getDestination());
			return true;
		}	
	}

}
