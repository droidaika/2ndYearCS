package Pokemonweek6;

import java.awt.Image;

public class Dual_Type extends Pokemon {


private Pokemon[] types = new Pokemon[2];



	public  Dual_Type(String string, String type1, String type2, Image pokePic) {
		// TODO Auto-generated constructor stub
		super(string,pokePic);
		int x=0;
		
		if(type1 == "grass"|| type2 == "grass" ){
			Grass_Type grass = new Grass_Type("grass",pokemonPic);
			types[x] = grass;
			x++;
		}
		if(type1 == "poison"|| type2 == "poison" ){
			Poison_Type poison = new Poison_Type("poison",pokemonPic);
			types[x] = poison;
			x++;
		}
		if(type1 == "fire"|| type2 == "fire" ){
			Fire_Type fire = new Fire_Type("fire", pokemonPic );
			types[x] = fire;
			x++;
		}
		if(type1 == "flying"|| type2 == "flying" ){
			Flying_Type flying = new Flying_Type("flying", pokemonPic);
			
			types[x] = flying;
			x++;
		}
		if(type1 == "bug"|| type2 == "bug" ){
			Bug_Type bug = new Bug_Type("bug",pokemonPic);
			types[x] = bug;
			x++;
		}
		if(type1 == "dragon"|| type2 == "dragon" ){
			Dragon_Type dragon = new Dragon_Type("dragon",pokemonPic);
			types[x] = dragon;
			x++;
		}
		if(type1 == "electric"|| type2 == "electric" ){
			Electric_Type electric = new Electric_Type("electric",pokemonPic);
			types[x] = electric;
			x++;
		}
		if(type1 == "fighting"|| type2 == "fighting" ){
			Fighting_Type fighting = new Fighting_Type("fighting",pokemonPic);
			types[x] = fighting;
			x++;
		}
		if(type1 == "ground"|| type2 == "ground" ){
			Ground_Type ground = new Ground_Type("ground",pokemonPic);
			types[x] = ground;
			x++;
		}
		if(type1 == "ice"|| type2 == "ice" ){
			Ice_Type ice = new Ice_Type("ice", pokemonPic);
			types[x] = ice;
			x++;
		}
		if(type1 == "normal"|| type2 == "normal" ){
			Normal_Type normal = new Normal_Type("normal",pokemonPic);
			types[x] = normal;
			x++;
		}
		if(type1 == "psychic"|| type2 == "psychic" ){
			Psychic_Type psychic = new Psychic_Type("psychic",pokemonPic);
			types[x] = psychic;
			x++;
		}
		if(type1 == "rock"|| type2 == "rock" ){
			Rock_Type rock = new Rock_Type("rock",pokemonPic);
			types[x] = rock;
			x++;
		}
		if(type1 == "water"|| type2 == "water" ){
			Water_Type water = new Water_Type("water", pokemonPic);
			types[x] = water;
			x++;
		}
		if(type1 == "ghost"|| type2 == "ghost" ){
			Ghost_Type ghost = new Ghost_Type("ghost",pokemonPic);
			types[x] = ghost;
			x++;
		}

		
	}
	
	
	
	@Override
	public boolean eats(Pokemon poke){
		
	
		if(types[0].eats(poke)== true || types[1].eats(poke) == true ){
			return true;
		}else {
			return false;
		}
		
	}
	
	
	@Override
	public Pokemon getType1() {
		// TODO Auto-generated method stub
		
		return types[0];
	}

	@Override
	public Pokemon getType2() {
		// TODO Auto-generated method stub
		return types[1];
	}
	
}
