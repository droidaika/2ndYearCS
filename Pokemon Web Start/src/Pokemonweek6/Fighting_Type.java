package Pokemonweek6;

import java.awt.Image;

public class Fighting_Type extends Pokemon{

	public Fighting_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Normal_Type||poke instanceof Ice_Type||poke instanceof Rock_Type){
			return true;
		}else{
			return false;
		}
	}
	
}