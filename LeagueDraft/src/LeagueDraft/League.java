package LeagueDraft;
import java.util.Arrays;


public class League {
	
private Division[] divisions;
private String name;
private int counter;
	
	public League(String string) {
		divisions = new Division[5];
		this.name = string;
		counter = 0;
	}
	
	public String getName(){
		return name;
	}

	public void addDivision(Division division) {
		// TODO Auto-generated method stub
		Arrays.copyOf(divisions, ++counter);
		divisions[counter - 1] = division;
	}

	public int getNumDivsions() {
		// TODO Auto-generated method stub
		return counter;
	}

	public int getNumTeams() {
		// TODO Auto-generated method stub
		int teams = 0;
		for(int i = 0; i <counter; i++){
			teams += divisions[i].getNumTeams();
		}
		return teams;
	}

	public double getNumGoalsForDivision(String divisionName) {
		// TODO Auto-generated method stub
		for(int i = 0; i <counter; i++){
			if(divisions[i].getName() == divisionName){
				return divisions[i].getDivisionGoals();
			}
		}
		return 0;
	}

	public double getNumGoalsForTeam(String teamName) {

		for(int i = 0; i <counter; i++){
			if(divisions[i].getTeamGoals(teamName) != -1){
				return divisions[i].getTeamGoals(teamName);
			}
			
		}
		return 0;
	}

	public double getAveAgeOfTeam(String teamName) {
		for(int i = 0; i <counter; i++){
			if(divisions[i].getAveAge(teamName) != -1){
				return divisions[i].getAveAge(teamName);
			}
			
		}
		return 0;
	}
}