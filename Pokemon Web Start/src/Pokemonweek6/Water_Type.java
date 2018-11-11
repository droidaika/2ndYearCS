package Pokemonweek6;

import java.awt.Image;

public class Water_Type extends Pokemon{
	
	public Water_Type(String i, Image pokePic) {
	
		super(i,pokePic);
	}
		
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Fire_Type||poke instanceof Ground_Type||poke instanceof Rock_Type){
			return true;
		}else{
			return false;
		}
			
	}

		
		
}