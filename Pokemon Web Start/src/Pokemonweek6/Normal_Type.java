package Pokemonweek6;

import java.awt.Image;

public class Normal_Type extends Pokemon{

	public Normal_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		
			return false;
		
	}
	
}