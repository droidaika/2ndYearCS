package Pokemonweek6;


import javax.swing.ImageIcon;

public class Enemy extends Person{

	 
	
	public Enemy(int pokeNumber){
		super(pokeNumber);
		
		Trainer = new ImageIcon("Pics/trainer.png");
		trainer = Trainer.getImage();
		
	}
	

}
