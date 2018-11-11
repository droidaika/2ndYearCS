package Pokemonweek6;

import java.awt.Image;

public class Grass_Type extends Pokemon{
   
	
    public Grass_Type(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
    	super(i,pokePic);
	}
	
    @Override
	public boolean eats(Pokemon poke){
		if(poke instanceof Water_Type||poke instanceof Ground_Type||poke instanceof Rock_Type){
			return true;
		}else{
			return false;
		}
		
	}
	
	
}