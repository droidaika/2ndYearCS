package Pokemonweek6;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class TrainerBattle{

	private Player player;
	private Enemy rival;
	private BattleMenu Battle = new BattleMenu();
	private int playerPokeNum;
	private int rivalPokeNum;
	private boolean duel = false;
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	
		
		if(Battle.Update() == true){
			
			Battle.paint(g);
		}else{
		
		if(rivalPokeNum==0||playerPokeNum==0){
			duel = false;
		}
		
		}
		
		 int fontSize = MovingPokemonApplication.widthApplet*80/600;
		 String string ="";
		if(Battle.isRun()==false){
			 
			
			 
			 g.setColor(Color.white);
			 g.fillRect(0, 0,  MovingPokemonApplication.widthApplet,MovingPokemonApplication.heightApplet);
			 
			 
			 if(Battle.TryCatchUpdate() == true){
				fontSize = MovingPokemonApplication.widthApplet*40/600;
				 string = "You can't catch a trainer's pokemon.";
				 Battle.add(player,rival.getPokemon());
			   	 
			   	 
			  }else
			 
			 if(Battle.battle() == true){
				 rival.arrayReducer();
				 rivalPokeNum= rival.getpokemonNumber();
				 if(rivalPokeNum!=0&&playerPokeNum!=0){
					 Battle.add(player,rival.getPokemon());
				 }
				
			   	 string = "YOU WON!!!";
				
			 }else{
				 
				 string = "YOU LOSE!!";
				  
				 rival.getPokemon().IncreaseLevel(player.getPokemon().getLevel()/10);
				 player.arrayReducer();
				 playerPokeNum = player.getpokemonNumber();
				 if(rivalPokeNum!=0&&playerPokeNum!=0){
					 Battle.add(player,rival.getPokemon());
				 }
				   	 
			 
			
			 }
		}else if (Battle.Update() == false){
			 g.setColor(Color.white);
			 g.fillRect(0, 0,  MovingPokemonApplication.widthApplet,MovingPokemonApplication.heightApplet);
			 
			fontSize = MovingPokemonApplication.widthApplet*40/600;
			 string = "You can not run from a trainer";
			 if(rivalPokeNum!=0&&playerPokeNum!=0){
				 Battle.add(player,rival.getPokemon());
			 }
 		}
		 g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
		 g.setColor(Color.BLACK);
		 g.drawString(string, MovingPokemonApplication.widthApplet*100/600,MovingPokemonApplication.heightApplet*300/600);
		 	 
		
	}

	public void add(Player player, Enemy rival) {
		// TODO Auto-generated method stub
		this.player = player;
		this.rival = rival;
		playerPokeNum = player.getpokemonNumber();
		rivalPokeNum= rival.getpokemonNumber();
		duel = true;
		if(rivalPokeNum!=0&&playerPokeNum!=0){
		Battle.add(player,rival.getPokemon());
		}
	}
	
/*	public void fight(Player player, Enemy rival) {
		// TODO Auto-generated method stub
		
		while( playerPokeNum > 0|| rivalPokeNum > 0 ){
			
			
		}
	}*/

	public boolean Update(){
		if(duel == false){
			
			return false;
		}else{
			return true;
		}
	}

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		Battle.keyPressed(e);
	}

	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		Battle.keyReleased(e);
	}

}
