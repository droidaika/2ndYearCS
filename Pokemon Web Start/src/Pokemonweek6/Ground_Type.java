package Pokemonweek6;

import java.awt.Image;

public class Ground_Type extends Pokemon{

	public Ground_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(i,pokePic);
	}
	
	@Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Fire_Type||poke instanceof Electric_Type||poke instanceof Poison_Type||poke instanceof Rock_Type){
			return true;
		}else{
			return false;
		}
		
	}
	
}