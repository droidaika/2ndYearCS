package Pokemonweek6;

import java.awt.Image;

public class Poison_Type extends Pokemon{
	
		
	    public Poison_Type(String i, Image pokePic) {

	    	super(i,pokePic);
		}
	
	    @Override
		public boolean eats(Pokemon poke){
			if(poke instanceof Grass_Type||poke instanceof Bug_Type){
				return true;
			}else{
				return false;
			}
			
		}

		
	}