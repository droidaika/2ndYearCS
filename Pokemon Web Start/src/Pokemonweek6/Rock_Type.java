package Pokemonweek6;

import java.awt.Image;

public class Rock_Type extends Pokemon{

	public Rock_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Fire_Type||poke instanceof Ice_Type||poke instanceof Flying_Type||poke instanceof Bug_Type){
			return true;
		}else{
			return false;
		}
		
	}

	
	

}