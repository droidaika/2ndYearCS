package Pokemonweek6;

import java.awt.Image;

public class Ghost_Type extends Pokemon{

	public Ghost_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Ghost_Type){
			return true;
		}else{
			return false;
		}
		
	}
	
	
}