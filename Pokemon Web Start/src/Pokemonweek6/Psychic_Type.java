package Pokemonweek6;

import java.awt.Image;

public class Psychic_Type extends Pokemon{

	public Psychic_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Fighting_Type||poke instanceof Poison_Type){
			return true;
		}else{
			return false;
		}
		
	}

	
}