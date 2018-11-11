package ariana;

public class Thrusters {

	private double thrust;
	private final static double MAX_THRUST= 100000 ;
	private Computer computer;

	public Thrusters(Computer computer){
		this.computer = computer;
		thrust = 0;
	}

	public void go(int num){
		generateThrust (num);
	}

	private void generateThrust (int num){
		
		if(num == 2){
			System.out.println("estimate time of journey left is: " + computer.estTime() + " seconds.\n Danger of running out of oxygen, must increase thrust");
			thrust  = thrust + 1000* Math.random();
			System.out.println("Increasing thrust \n");
		
		} else 
			if(  thrust < 1000||(num == 1 && computer.getAltitude() < (3*computer.getDestination())/ 4)){
				thrust  = thrust + 1000* Math.random();
				System.out.println("Increasing thrust \n");
				
				
		} else {
			thrust  = thrust - 1000* Math.random();
			
			System.out.println("Decreasing thrust \n");
		}
		
		computer.setThrust(thrust);
		
	
	}
	

}
