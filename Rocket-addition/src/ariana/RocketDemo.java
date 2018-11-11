package ariana;

import java.util.Scanner;

public class RocketDemo {

	public static void main(String[] args) {
		
	    System.out.print("Enter Destination Altitude as an interger value: \n");  
	    Scanner scan = new Scanner(System.in);
		int destination = scan.nextInt(); 
		
        System.out.print("Enter the number of oxygen as an interger value: \n");  
		int oxygen = scan.nextInt(); 
		
		
		System.out.print("Enter the tonnes of litres of fuel as an interger value: \n");  
		double fuel = scan.nextFloat(); 
		scan.close();

		Rocket ariana = new Rocket(oxygen,fuel, destination);
		ariana.blastOff();
	
		while (!ariana.hasMajorError() && !ariana.isMissionAccomplished()){
			ariana.getTelemetry();
			ariana.reportStatus();
		}	
		
	}

}
