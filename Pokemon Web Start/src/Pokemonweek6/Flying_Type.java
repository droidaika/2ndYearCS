package Pokemonweek6;

import java.awt.Image;

public class Flying_Type extends Pokemon {
	
	public Flying_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Grass_Type||poke instanceof Fighting_Type||poke instanceof Bug_Type){
			return true;
		}else{
			return false;
		}
		
	}
	
	
}