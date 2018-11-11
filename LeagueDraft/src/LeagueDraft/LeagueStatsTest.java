package LeagueDraft;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LeagueStatsTest {
	
	LeagueStats leagueStats;
	League league;

	Division divisionA;

	
	Team Manchester;
	Player Rooney;
	Player Scholes;
	Player Giggs;
	
	Team Liverpool;
	Player Gerard;
	Player Torres;
	Player Rush;
	
	Division divisionB;
	
	Team Chelsea;
	Player Terry;
	Player Pedro;
	Player Moses;
	
	Team Arsenal;
	Player Henry;
	Player Ramsey;
	Player Walcott;
	
	@Before
	
	public void setUp() throws Exception {
		
		leagueStats = new LeagueStats();
		
		divisionA = new Division("Division A");
		divisionB = new Division("Division B");
		league = new League("Champion");
		
		leagueStats.addLeague(league);
		
		league.addDivision(divisionA);
		league.addDivision(divisionB);
		
		Manchester = new Team("Manchester");
		Liverpool = new Team("Liverpool");
	
		
		divisionA.addTeam(Manchester);
		divisionA.addTeam(Liverpool);
		
		Rooney = new Player(30, 10, 3);
		Scholes = new Player(41, 18, 1);
		Giggs = new Player(42, 11, 2);
		
		
		Manchester.addPlayer(Rooney);
		Manchester.addPlayer(Scholes);
		Manchester.addPlayer(Giggs);
		
		Gerard = new Player(31, 10, 6);
		Torres = new Player(41, 18, 0);
		Rush = new Player(42, 11, 5);
		
		
		Liverpool.addPlayer(Gerard);
		Liverpool.addPlayer(Torres);
		Liverpool.addPlayer(Rush);

		Chelsea = new Team("Chelsea");
		Arsenal = new Team("Arsenal");
	
		
		divisionB.addTeam(Chelsea);
		divisionB.addTeam(Arsenal);
		
		Terry = new Player(21, 10, 2);
		Pedro = new Player(31, 18, 6);
		Moses = new Player(32, 11, 1);
		
		Chelsea.addPlayer(Terry);
		Chelsea.addPlayer(Pedro);
		Chelsea.addPlayer(Moses);
		
		Henry = new Player(26, 10, 2);
		Ramsey = new Player(36, 18, 3);
		Walcott = new Player(37, 11, 5);
		
		
		Arsenal.addPlayer(Henry);
		Arsenal.addPlayer(Ramsey);
		Arsenal.addPlayer(Walcott);
		

	}
	@Test
	public void NumTeamTest() {
		
		int actual = leagueStats.getNumTeams();
		int expected = 4;
		assertEquals(expected,actual);
	}
	
	@Test
	public void NumDivisionTest() {
		
		int actual = leagueStats.getNumDivsions();
		int expected = 2;
		assertEquals(expected,actual);
	}
	@Test
	public void testNumberGoalsDivisionTest() {
		
		double actual = leagueStats.getNumGoalsForDivision("Division A");
		double expected = 17;
		assertEquals(expected,actual, 0);
		double actual2 = leagueStats.getNumGoalsForDivision("Division B");
		double expected2 = 19;
		assertEquals(expected2,actual2, 0);
	}
	
	@Test
	public void testNumberGoalsTeamTest() {
		
		double actual = leagueStats.getNumGoalsForTeam("Manchester");
		double expected = 6;
		assertEquals(expected,actual, 0);
		double actual2 = leagueStats.getNumGoalsForTeam("Liverpool");
		double expected2 = 11;
		assertEquals(expected2,actual2, 0);
		double actual3 = leagueStats.getNumGoalsForTeam("Chelsea");
		double expected3 = 9;
		assertEquals(expected3,actual3, 0);
		double actual4 = leagueStats.getNumGoalsForTeam("Arsenal");
		double expected4 = 10;
		assertEquals(expected4,actual4, 0);
	}
	
	@Test
	public void AveAgeTest() {
		
		double actual = leagueStats.getAveAgeOfTeam("Manchester");
		double expected = 113/3;
		assertEquals(expected,actual, 0);
		double actual2 = leagueStats.getAveAgeOfTeam("Liverpool");
		double expected2 = 38;
		assertEquals(expected2,actual2, 0);
		double actual3 = leagueStats.getAveAgeOfTeam("Chelsea");
		double expected3 = 28;
		assertEquals(expected3,actual3, 0);
		double actual4 = leagueStats.getAveAgeOfTeam("Arsenal");
		double expected4 = 33;
		assertEquals(expected4,actual4, 0);
	}


}
