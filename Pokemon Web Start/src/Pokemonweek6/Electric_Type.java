package Pokemonweek6;

import java.awt.Image;

public class Electric_Type extends Pokemon{

	public Electric_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Water_Type||poke instanceof Flying_Type){
			return true;
		}else{
			return false;
		}
	}
	
	
}