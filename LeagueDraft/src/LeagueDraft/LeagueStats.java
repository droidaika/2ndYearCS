package LeagueDraft;


public class LeagueStats {
	
	private League league;

	public int getNumDivsions() {
		// TODO Auto-generated method stub
		
		return league.getNumDivsions();
	}
	
	public int getNumTeams() {
		// TODO Auto-generated method stub
		return league.getNumTeams();
	}
	
	public double getNumGoalsForDivision(String Name) {
		// TODO Auto-generated method stub
		return league.getNumGoalsForDivision(Name);
	}
	public double getNumGoalsForTeam(String Name) {
		// TODO Auto-generated method stub
		return league.getNumGoalsForTeam(Name);
	}
	public double getAveAgeOfTeam(String Name) {
		// TODO Auto-generated method stub
		return league.getAveAgeOfTeam(Name);
	}

	public void addLeague(League league) {
		// TODO Auto-generated method stub
		this.league = league;
		
	}

}
