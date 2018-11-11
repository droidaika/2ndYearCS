package Pokemonweek6;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;

import javax.swing.ImageIcon;

public abstract class Person extends Thing{

	protected Pokemon[] PlayerPokemon;
	protected ImageIcon Trainer;
	protected Image trainer;
	
	protected int pokeNumber;
	
	protected Map map;
	

	
	
	public Person(int pokeNumber/*Grid grid*/) {
		// TODO Auto-generated constructor stub
		//this.grid = grid;
		this.pokeNumber = pokeNumber;
		PlayerPokemon = new Pokemon[pokeNumber];
		for(int i =0; i<pokeNumber; i++){
			PlayerPokemon[i] = ObjectCreator.objectMaker();
		}
		
		

	}
	
	
	 public void arrayReducer() {
			
			
			
			
			for(int j = 0; j < pokeNumber-1; j++){
				PlayerPokemon[j] = PlayerPokemon[j+1];
			}
			pokeNumber--;
			PlayerPokemon = Arrays.copyOf(PlayerPokemon,pokeNumber);
			System.out.println("length after: " + PlayerPokemon.length +"\n");
			
				
			
	    }
	 public void paint(Graphics g) {
			
			
		 	
			g.drawImage(trainer, (int)x*(MovingPokemonApplication.widthApplet*1/12), (int)y*MovingPokemonApplication.heightApplet*1/15, (int)(MovingPokemonApplication.widthApplet*1/15), (int)MovingPokemonApplication.heightApplet*1/12, null);
		}
	 public int getpokemonNumber() {
			// TODO Auto-generated method stub
			return PlayerPokemon.length;
		}
	 public Pokemon getPokemon() {
			// TODO Auto-generated method stub
			return PlayerPokemon[0];
		}


	public void add(Map map) {
		// TODO Auto-generated method stub
		this.map = map;
		
	}

}
