package Pokemonweek6;

import java.awt.Graphics;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Player extends Person{


	
	private double xSpeed = 0;
	private double ySpeed = 0;
    
	private int level = 0;
	
	private int pokeBalls = 2;

	
	public Player(int pokeNumber) {
		// TODO Auto-generated constructor stub
		
		super(pokeNumber);
		
		Trainer = new ImageIcon("Pics/trainer.png");
		trainer = Trainer.getImage();
		
	}
	
	
	
	
	
	
	
	
	public void movePlayer() {
		
		if(y+ySpeed==-1 ){
			level++;
			x=5;
			y=14;
		}else if(y+ySpeed == 15 && level != 0 ){
			System.out.println("level down");
			level--;
			x=5;
			y=0;
			
		}else
		if(map.checkCollisions(x,y,(int)(x+xSpeed),(int)(y+ySpeed)) == false ){
		x+=xSpeed;
		y+=ySpeed;
		//System.out.println("level "+level );
		}else if (xSpeed != 0 || ySpeed != 0){
			System.out.println("blocked");
		}
		
	}
	public void setXSpeed(double dx) {
		xSpeed =dx;
		
	}
	

	



	public void setYSpeed(int dy) {
		// TODO Auto-generated method stub
		ySpeed =dy;
	}
	
	public double getYSpeed() {
		// TODO Auto-generated method stub
		return ySpeed;
	}




	






	

	public void Reorganise(int i){
		Pokemon temp = PlayerPokemon[0];
		PlayerPokemon[0] =PlayerPokemon[i];
		PlayerPokemon[i] = temp;
	}




	public void paintPokemon(Graphics g) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<pokeNumber; i++){
			PlayerPokemon[i].paintPoke(g,MovingPokemonApplication.widthApplet*85/600,MovingPokemonApplication.heightApplet*15/600+ (i*MovingPokemonApplication.heightApplet*70/600), MovingPokemonApplication.widthApplet*70/600,MovingPokemonApplication.heightApplet*70/600);
			PlayerPokemon[i].paintLvl( g,MovingPokemonApplication.widthApplet*155/600,MovingPokemonApplication.heightApplet*85/600+ (i*MovingPokemonApplication.heightApplet*70/600), MovingPokemonApplication.widthApplet*50/600);
		}
	}
	
	






	public boolean addPokemon(Pokemon Add) {
		// TODO Auto-generated method stub
		if(pokeNumber<6 && pokeBalls > 0){
		pokeBalls--;
		pokeNumber++;
		PlayerPokemon = Arrays.copyOf(PlayerPokemon,pokeNumber);
		System.out.println("length after: " + PlayerPokemon.length +"\n");
		PlayerPokemon[pokeNumber-1]=Add;
		return true;
		}
		return false;
	}

	public int Update(){
		return level;
	}

	
	
	
	
	
	
	
}
