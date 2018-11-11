package Pokemonweek6;

import java.awt.Image;

public class Fire_Type extends Pokemon{
    
	
	public Fire_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Grass_Type||poke instanceof Ice_Type||poke instanceof Bug_Type){
			return true;
		}else{
			return false;
		}
		
	}
	
	
}
