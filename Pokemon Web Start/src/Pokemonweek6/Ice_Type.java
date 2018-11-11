package Pokemonweek6;

import java.awt.Image;

public class Ice_Type extends Pokemon{
	
	public Ice_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Grass_Type||poke instanceof Ground_Type||poke instanceof Flying_Type||poke instanceof Dragon_Type){
			return true;
		}else{
			return false;
		}
		
	}
	
}