package Pokemonweek6;

import java.awt.Image;

public class Dragon_Type extends Pokemon{

	public Dragon_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Dragon_Type){
			return true;
		}else{
			return false;
		}
	}
	
}