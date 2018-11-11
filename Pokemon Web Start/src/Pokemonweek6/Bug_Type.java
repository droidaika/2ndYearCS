package Pokemonweek6;

import java.awt.Image;

public class Bug_Type extends Pokemon{

	public Bug_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Grass_Type||poke instanceof Ground_Type||poke instanceof Psychic_Type){
			return true;
		}else{
			return false;
		}
	}
	
}