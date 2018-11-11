package Pokemonweek6;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ObjectCreator {
	public static final int Fire = 1;
	public static final int Water = 2;
	public static final int Grass = 3;
	public static final int Normal = 4;
	public static final int Fighting = 5;
	public static final int Psychic = 6;
	public static final int Rock = 7;
	public static final int Ground = 8;
	public static final int Ice = 9;
	public static final int Poison = 10;
	public static final int Electric = 11;
	public static final int Ghost = 12;
	public static final int Dragon = 13;
	public static final int Bug = 14;
	
	
	private static ImageIcon pokemonIcon;
	private static Image pokemonImage;
	
	private static int pokeId;
	


	
	



	public static Pokemon objectMaker(){
		
		
	    int typeId = (int) Math.ceil(Math.random() * 14);


	    switch(typeId){
	        case Fire:
	        	  return fireMaker();
	        	  
	        case Water :
	        	
	        	return waterMaker();
	     
	        case Grass:
	        	
	        	return grassMaker();
	        case Normal:
	        	  return normalMaker();
	        	  
	        case Fighting:
	        	return fightingMaker();
	        	
	     
	        case Psychic:
	        	return psychicMaker();
	        	
	        	  
	        case Rock:
	        	return rockMaker();
	        	
	     
	        case Ground:
	        	return groundMaker();
	        	
	       case Ice:
	        	return iceMaker();
	        	  
	        case Poison:
	        	return poisonMaker();
	     
	        case Electric:
	        	return electricMaker();
	        	
	        case Ghost:
	        	return  ghostMaker();
	        	
	        case Dragon:
	        	return dragonMaker();
	        	
	     
	        case Bug:
	        	return bugMaker();
	        	
	        default:
	        	break;
		
	    }
		return null;
		
	    
	}






	private static Pokemon rockMaker() {
		pokeId = (int) Math.ceil(Math.random() * 9);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/74.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Geodude = new Dual_Type("Geodude", "rock", "ground", pokemonImage);
		        return Geodude;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/75.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Graveller = new Dual_Type("Graveller", "rock", "ground", pokemonImage);
	            return Graveller;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/76.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Golem = new Dual_Type("Golem", "rock", "ground", pokemonImage);
	        	return Golem;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/95.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	
	        	Dual_Type Onix= new Dual_Type("Onix", "rock", "ground", pokemonImage);
		        return Onix;
		        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/138.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	
	        	Dual_Type Omanyte = new Dual_Type("Omanyte", "rock", "water", pokemonImage);
	            return Omanyte;
		        
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/139.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Omastar = new Dual_Type("Omastar", "rock", "water", pokemonImage);
	        	return Omastar;
	        	
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/140.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Kabuto = new Dual_Type("Kabuto", "rock", "water", pokemonImage);
		        return Kabuto;
		        
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/141.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Kabutops = new Dual_Type("Kabutops", "rock", "water", pokemonImage);
	            return Kabutops;
		        
	        case 9:
	        	pokemonIcon = new ImageIcon("Pics/142.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Aerodactyl = new Dual_Type("Aerodactyl", "rock", "flying", pokemonImage);
	        	return Aerodactyl;
	        
	        default:
	        	break;
			}
		return null;
		
		}
	



	



	private static Pokemon psychicMaker() {
		pokeId = (int) Math.ceil(Math.random() * 9);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/63.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Abra = new Psychic_Type("Abra", pokemonImage);
		        return 	Abra;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/64.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Kadabra = new Psychic_Type("Kadabra", pokemonImage);
		        return Kadabra;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/65.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Alakazam = new Psychic_Type("Alakazam", pokemonImage);
		        return Alakazam;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/96.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Drowzee = new Psychic_Type("Drowzee", pokemonImage);
		        return 	Drowzee;
		        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/97.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Hypno = new Psychic_Type("Hypno", pokemonImage);
		        return Hypno;
		        
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/122.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type MrMime = new Psychic_Type("Mr. Mime", pokemonImage);
		        return MrMime;
		        
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/150.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Mewtwo = new Psychic_Type("Mewtwo", pokemonImage);
		        return Mewtwo;
		        
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/150.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Mew = new Psychic_Type("Mew", pokemonImage);
		        return 	Mew;
		        
	        case 9:
	        	pokemonIcon = new ImageIcon("Pics/151.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Psychic_Type Mr_Mime = new Psychic_Type("Mr. Mime", pokemonImage);
		        return Mr_Mime;
		        
	        
	        default:
	        	break;
			}
		return null;
		
		}



	private static Pokemon fightingMaker() {
		pokeId = (int) Math.ceil(Math.random() * 7);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/56.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Fighting_Type Mankey = new Fighting_Type("Mankey", pokemonImage);
		        return Mankey;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/57.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Fighting_Type Primeape = new Fighting_Type("Primeape", pokemonImage);
	            return 	Primeape;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/66.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Fighting_Type Machop = new Fighting_Type("Machop", pokemonImage);
	        	return Machop;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/67.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Fighting_Type Machoke = new Fighting_Type("Machoke", pokemonImage);
		        return Machoke;
		        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/68.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Fighting_Type Machamp = new Fighting_Type("Machamp", pokemonImage);
	            return Machamp;
	            
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/106.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Fighting_Type Hitmonlee = new Fighting_Type("Hitmonlee", pokemonImage);
		        return Hitmonlee;
		        
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/107.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Fighting_Type Hitmonchan = new Fighting_Type("Hitmonchan", pokemonImage);
	            return Hitmonchan;
	        
	        
	        default:
	        	break;
			}
		return null;
		
		}


	private static Pokemon groundMaker() {
		pokeId = (int) Math.ceil(Math.random() * 8);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/27.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Ground_Type Sandshrew = new Ground_Type("Sandshrew", pokemonImage);
		        return Sandshrew;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/28.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Ground_Type Sandslash = new Ground_Type("Sandslash", pokemonImage);
	            return Sandslash;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/50.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Ground_Type Diglett = new Ground_Type("Diglett", pokemonImage);
		        return Diglett;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/51.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Ground_Type Dugtrio = new Ground_Type("Dugtrio", pokemonImage);
	            return Dugtrio;
	        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/104.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Ground_Type Cubone = new Ground_Type("Cubone", pokemonImage);
		        return Cubone;
		        
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/105.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Ground_Type Marowak = new Ground_Type("Marowak", pokemonImage);
	            return Marowak;
	        
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/111.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Rhyhorn = new Dual_Type("Rhyhorn", "ground", "rock", pokemonImage);
		        return Rhyhorn;
		        
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/112.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Rhydon = new Dual_Type("Rhydon", "ground", "rock", pokemonImage);
	            return Rhydon;
	        
	        
	        default:
	        	break;
			}
		return null;
		
		}



	private static Pokemon iceMaker() {
		pokeId = (int) Math.ceil(Math.random() * 2);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/124.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Jynx = new Dual_Type("Jynx", "ice", "psychic", pokemonImage);
		        return 	Jynx;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/144.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Articuno = new Dual_Type("Articuno", "ice", "flying", pokemonImage);
	            return Articuno;
		        
	        
	        
	        default:
	        	break;
			}
		return null;
		
		}



	private static Pokemon poisonMaker() {
		pokeId = (int) Math.ceil(Math.random() * 14);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/23.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Ekans = new Poison_Type("Ekans", pokemonImage);
		        return Ekans;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/24.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Arbok = new Poison_Type("Arbok", pokemonImage);
	            return Arbok;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/29.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type NidoranF = new Poison_Type("NidoranF", pokemonImage);
	        	return NidoranF;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/30.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Nidorina = new Poison_Type("Nidorina", pokemonImage);
		        return Nidorina;
		        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/31.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Nidoqueen = new Dual_Type("Nidoqueen", "poison", "ground", pokemonImage);
	        	return Nidoqueen;
		        
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/32.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type NidoranM = new Poison_Type("NidoranM", pokemonImage);
	        	return NidoranM;
		       
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/33.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Nidorino = new Poison_Type("Nidorino", pokemonImage);
		        return Nidorino;
		        
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/34.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Nidoking = new Dual_Type("Nidoking", "poison", "ground", pokemonImage);
	        	return Nidoking;
		        
	        case 9:
	        	pokemonIcon = new ImageIcon("Pics/88.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Grimer = new Poison_Type("Grimer", pokemonImage);
	        	return Grimer;
		        
	        case 10:
	        	pokemonIcon = new ImageIcon("Pics/89.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Muk = new Poison_Type("Muk", pokemonImage);
		        return Muk;
		        
	        case 11:
	        	pokemonIcon = new ImageIcon("Pics/109.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Koffing = new Poison_Type("Koffing", pokemonImage);
	            return Koffing;
		        
	        case 12:
	        	pokemonIcon = new ImageIcon("Pics/110.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Poison_Type Weezing = new Poison_Type("Weezing", pokemonImage);
	        	return Weezing;
		        
	        case 13:
	        	pokemonIcon = new ImageIcon("Pics/41.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Zubat = new Dual_Type("Zubat", "poison", "flying", pokemonImage);
	        	return Zubat;
		        
	        case 14:
	        	pokemonIcon = new ImageIcon("Pics/42.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Goldbat = new Dual_Type("Goldbat", "poison", "flying", pokemonImage);
	        	return Goldbat;
		        
		    default:
	        	break;
			}
		return null;
		
		}



	private static Pokemon electricMaker() {
		pokeId = (int) Math.ceil(Math.random() * 9);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/25.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Pikachu = new Electric_Type("Pikachu", pokemonImage);
		        return Pikachu;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/26.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Raichu = new Electric_Type("Raichu", pokemonImage);
	            return Raichu;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/100.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Voltorb = new Electric_Type("Voltorb", pokemonImage);
	            return Voltorb;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/101.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Electrode = new Electric_Type("Electrode", pokemonImage);
		        return Electrode;
		        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/125.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Electabuzz = new Electric_Type("Electabuzz", pokemonImage);
	            return Electabuzz;
		        
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/135.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Jolteon = new Electric_Type("Jolteon", pokemonImage);
	            return Jolteon;
		      
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/81.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Magnemite = new Electric_Type("Magnemite", pokemonImage);
		        return Magnemite;
		        
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/82.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Electric_Type Magneton = new Electric_Type("Magneton", pokemonImage);
	            return Magneton;
		        
	        case 9:
	        	pokemonIcon = new ImageIcon("Pics/145.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Zapdos = new Dual_Type("Zapdos", "electric", "flying", pokemonImage);
	        	return Zapdos;
		      
	        
	        
	        default:
	        	break;
			}
		return null;
		
		}


	private static Pokemon ghostMaker() {
		pokeId = (int) Math.ceil(Math.random() * 3);
		switch(pokeId){
		
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/92.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Gastly = new Dual_Type("Gastly", "ghost", "poison", pokemonImage);
		        return Gastly;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/93.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Haunter = new Dual_Type("Haunter", "ghost", "poison", pokemonImage);
	            return Haunter;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/94.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Gengar = new Dual_Type("Gengar", "ghost", "poison", pokemonImage);
	        	return Gengar;
		        
	        
	        default:
	        	break;
			}
		return null;
		
		}


	private static Pokemon dragonMaker() {
		pokeId = (int) Math.ceil(Math.random() * 3);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/147.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dragon_Type Dratini = new Dragon_Type("Dratini", pokemonImage);
		        return Dratini;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/148.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dragon_Type Dragonair = new Dragon_Type("Dragonair", pokemonImage);
	            return Dragonair;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/149.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Dragonite = new Dual_Type("Dragonite", "dragon", "flying", pokemonImage);
	        	return Dragonite;
		        
	       
	        default:
	        	break;
			}
		return null;
		
		}



	private static Pokemon bugMaker() {
		pokeId = (int) Math.ceil(Math.random() * 12);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/10.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Bug_Type Caterpie = new Bug_Type("Caterpie", pokemonImage);
		        return 	Caterpie;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/11.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Bug_Type Metapod = new Bug_Type("Metapod", pokemonImage);
	            return Metapod;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/12.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Butterfree = new Dual_Type("Butterfree", "bug", "flying", pokemonImage);
	        	return Butterfree;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/127.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Bug_Type Pinsir = new Bug_Type("Pinsir", pokemonImage);
		        return 	Pinsir;
		        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/13.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Weedle = new Dual_Type("Weedle", "bug", "poison", pokemonImage);
	        	return Weedle;
		        
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/14.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Kakuna = new Dual_Type("Kakuna", "bug", "poison", pokemonImage);
	        	return Kakuna;
		        
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/15.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Beedrill = new Dual_Type("Beedrill", "bug", "poison", pokemonImage);
	        	return Beedrill;
		        
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/46.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Paras = new Dual_Type("Paras", "bug", "grass", pokemonImage);
	        	return Paras;
		        
	        case 9:
	        	pokemonIcon = new ImageIcon("Pics/47.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Parasect = new Dual_Type("Parasect", "bug", "grass", pokemonImage);
	        	return Parasect;
		        
	        case 10:
	        	pokemonIcon = new ImageIcon("Pics/48.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Venonat = new Dual_Type("Venonat", "bug", "poison", pokemonImage);
	        	return Venonat;
		        
	        case 11:
	        	pokemonIcon = new ImageIcon("Pics/49.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Venomoth = new Dual_Type("Venomoth", "bug", "poison", pokemonImage);
	        	return Venomoth;
		        
	        case 12:
	        	pokemonIcon = new ImageIcon("Pics/123.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Scyther = new Dual_Type("Scyther", "bug", "poison", pokemonImage);
	        	return Scyther;
		        
	        default:
	        	break;
			}
		return null;
		
	}



	private static Pokemon normalMaker() {
		pokeId = (int) Math.ceil(Math.random() * 22);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/19.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Rattata = new Normal_Type("Rattata", pokemonImage);
		        return Rattata;
		        
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/20.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Raticate = new Normal_Type("Raticate", pokemonImage);
	            return Raticate;
		        
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/39.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Jigglypuff = new Normal_Type("Jigglypuff", pokemonImage);
	            return Jigglypuff;
		        
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/40.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Wigglytuff = new Normal_Type("Wigglytuff", pokemonImage);
		        return Wigglytuff;
		        
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/52.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Meowth = new Normal_Type("Meowth", pokemonImage);
	            return Meowth;
	            
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/53.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Persian = new Normal_Type("Persian", pokemonImage);
	            return Persian;
		       
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/108.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Lickitung = new Normal_Type("Lickitung", pokemonImage);
		        return Lickitung;
		        
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/113.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Chansey = new Normal_Type("Chansey", pokemonImage);
	            return Chansey;
		        
	        case 9:
	        	pokemonIcon = new ImageIcon("Pics/115.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Kangaskhan = new Normal_Type("Kangaskhan", pokemonImage);
	            return Kangaskhan;
		       
	        case 10:
	        	pokemonIcon = new ImageIcon("Pics/128.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Tauros = new Normal_Type("Tauros", pokemonImage);
		        return Tauros;
		        
	        case 11:
	        	pokemonIcon = new ImageIcon("Pics/132.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Ditto = new Normal_Type("Ditto", pokemonImage);
	            return Ditto;
		        
	        case 12:
	        	pokemonIcon = new ImageIcon("Pics/133.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Eevee = new Normal_Type("Eevee", pokemonImage);
	            return Eevee;
		       
	        case 13:
	        	pokemonIcon = new ImageIcon("Pics/137.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Porygon = new Normal_Type("Porygon", pokemonImage);
	            return Porygon;
		        
	        case 14:
	        	pokemonIcon = new ImageIcon("Pics/143.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Normal_Type Snorlax = new Normal_Type("Snorlax", pokemonImage);
	            return Snorlax;
		       
	        case 15:
	        	pokemonIcon = new ImageIcon("Pics/16.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Pidgey = new Dual_Type("Pidgey","normal", "flying", pokemonImage);
	        	return Pidgey;
	        
	        case 16:
	        	pokemonIcon = new ImageIcon("Pics/17.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Pidgeotto = new Dual_Type("Pidgeotto","normal", "flying", pokemonImage);
	        	return Pidgeotto;
	        
	        case 17:
	        	pokemonIcon = new ImageIcon("Pics/18.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Pidgeot = new Dual_Type("Pidgeot","normal", "flying", pokemonImage);
	        	return Pidgeot;
	        
	        case 18:
	        	pokemonIcon = new ImageIcon("Pics/21.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Spearow = new Dual_Type("Spearow","normal", "flying", pokemonImage);
	        	return Spearow;
	        
	        case 19:
	        	pokemonIcon = new ImageIcon("Pics/22.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Fearow = new Dual_Type("Fearow","normal", "flying", pokemonImage);
	        	return Fearow;
	        
	        case 20:
	        	pokemonIcon = new ImageIcon("Pics/83.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Farfetchd = new Dual_Type("Farfetch'd","normal", "flying", pokemonImage);
	        	return Farfetchd;
	        
	        case 21:
	        	pokemonIcon = new ImageIcon("Pics/84.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Doduo = new Dual_Type("Doduo","normal", "flying", pokemonImage);
	        	return Doduo;
	        
	        case 22:
	        	pokemonIcon = new ImageIcon("Pics/85.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Dotrio = new Dual_Type("Dotrio","normal", "flying", pokemonImage);
	        	return Dotrio;
	        
	        default:
	        	break;
			}
		return null;
		
		}
		
	



	private static Pokemon fireMaker() {
		// TODO Auto-generated method stub
	pokeId = (int) Math.ceil(Math.random() * 12);
	switch(pokeId){
        case 1:
        	pokemonIcon = new ImageIcon("Pics/4.png");
    		pokemonImage = pokemonIcon.getImage();
        	Fire_Type Charmander = new Fire_Type("Charmander",pokemonImage);
        	return Charmander;
        case 2:
        	pokemonIcon = new ImageIcon("Pics/5.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Charmeleon = new Fire_Type("Charmeleon", pokemonImage);
        	return Charmeleon;
        case 3:
        	pokemonIcon = new ImageIcon("Pics/6.png");
        	pokemonImage = pokemonIcon.getImage();
        	Dual_Type Charizard = new Dual_Type("Charizard","fire", "flying",pokemonImage);
        	return Charizard;
        case 4:
        	pokemonIcon = new ImageIcon("Pics/37.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Vulpix = new Fire_Type("Vulpix", pokemonImage);
        	return Vulpix;
        case 5:
        	pokemonIcon = new ImageIcon("Pics/38.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Ninetales = new Fire_Type("Ninetales", pokemonImage);
        	return Ninetales;
        case 6:
        	pokemonIcon = new ImageIcon("Pics/58.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Growlithe = new Fire_Type("Growlithe", pokemonImage);
        	return Growlithe;
        case 7:
        	pokemonIcon = new ImageIcon("Pics/59.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Arcanine = new Fire_Type("Arcanine", pokemonImage);
        	return Arcanine;
        case 8:
        	pokemonIcon = new ImageIcon("Pics/77.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Ponyta = new Fire_Type("Ponyta", pokemonImage);
        	return Ponyta;
        case 9:
        	pokemonIcon = new ImageIcon("Pics/78.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Rapidash = new Fire_Type("Rapidash", pokemonImage);
        	return Rapidash;
        case 10:
        	pokemonIcon = new ImageIcon("Pics/126.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Magmar = new Fire_Type("Magmar", pokemonImage);
        	return Magmar;
        case 11:
        	pokemonIcon = new ImageIcon("Pics/136.png");
        	pokemonImage = pokemonIcon.getImage();
        	Fire_Type Flareon = new Fire_Type("Flareon", pokemonImage);
        	return Flareon;
        case 12:
        	pokemonIcon = new ImageIcon("Pics/146.png");
        	pokemonImage = pokemonIcon.getImage();
        	Dual_Type Moltres = new Dual_Type("Moltres","fire", "flying", pokemonImage);
        	return Moltres;
        
        default:
        	break;
		}
	return null;
	
		
	}
	
	
	private static Pokemon waterMaker() {
			// TODO Auto-generated method stub
		pokeId = (int) Math.ceil(Math.random() * 28);
		switch(pokeId){
	        case 1:
	        	pokemonIcon = new ImageIcon("Pics/7.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Squirtle = new Water_Type("Squirtle",pokemonImage);
	        	return Squirtle;
	           
	        case 2:
	        	pokemonIcon = new ImageIcon("Pics/8.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Warturtle = new Water_Type("Warturtle",pokemonImage);
	        	return Warturtle;
	            
	        case 3:
	        	pokemonIcon = new ImageIcon("Pics/9.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Blastoise = new Water_Type("Blastoise",pokemonImage);
	        	return Blastoise;
	           
	        case 4:
	        	pokemonIcon = new ImageIcon("Pics/54.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Psyduck = new Water_Type("Psyduck",pokemonImage);
	        	return Psyduck;
	           
	        case 5:
	        	pokemonIcon = new ImageIcon("Pics/55.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Golduck = new Water_Type("Golduck",pokemonImage);
	        	return Golduck;
	            
	        case 6:
	        	pokemonIcon = new ImageIcon("Pics/60.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Poliwag = new Water_Type("Poliwag",pokemonImage);
	        	return Poliwag;
	           
	        case 7:
	        	pokemonIcon = new ImageIcon("Pics/61.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Poliwhirl = new Water_Type("Poliwhirl",pokemonImage);
	        	return Poliwhirl;
	           
	        case 8:
	        	pokemonIcon = new ImageIcon("Pics/62.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Poliwrath = new Dual_Type("Poliwrath", "water", "fighting",pokemonImage);
		        return Poliwrath;
		        
	        case 9:
	        	pokemonIcon = new ImageIcon("Pics/72.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Tentacool = new Dual_Type("Tentacool", "water", "poison",pokemonImage);
		        return Tentacool;
		        
	        case 10:
	        	pokemonIcon = new ImageIcon("Pics/73.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Tentacruel = new Dual_Type("Tentacruel", "water", "poison",pokemonImage);
		        return Tentacruel;
	        case 11:
	        	pokemonIcon = new ImageIcon("Pics/79.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Slowpoke = new Dual_Type("Slowpoke", "water", "psychic",pokemonImage);
		        return Slowpoke;
	        case 12:
	        	pokemonIcon = new ImageIcon("Pics/80.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Slowbro = new Dual_Type("Slowbro", "water", "psychic",pokemonImage);
		        return Slowbro;
	        case 13:
	        	pokemonIcon = new ImageIcon("Pics/86.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Seel = new Water_Type("Seel",pokemonImage);
	        	return Seel;
	           
	        case 14:
	        	pokemonIcon = new ImageIcon("Pics/87.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Dewgong = new Dual_Type("Dewgong", "water", "ice",pokemonImage);
		        return Dewgong;
		        
	        case 15:
	        	pokemonIcon = new ImageIcon("Pics/90.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Shellder = new Water_Type("Shellder",pokemonImage);
	        	return Shellder;
	           
	        case 16:
	        	pokemonIcon = new ImageIcon("Pics/91.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Cloyster = new Dual_Type("Cloyster", "water", "ice",pokemonImage);
		        return Cloyster;
		        
	        case 17:
	        	pokemonIcon = new ImageIcon("Pics/98.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Krabby = new Water_Type("Krabby",pokemonImage);
	        	return Krabby;
	           
	        case 18:
	        	pokemonIcon = new ImageIcon("Pics/99.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Kingler = new Water_Type("Kingler",pokemonImage);
	        	return Kingler;
	            
	        case 19:
	        	pokemonIcon = new ImageIcon("Pics/116.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Horsea = new Water_Type("Horsea",pokemonImage);
	        	return Horsea;
	           
	        case 20:
	        	pokemonIcon = new ImageIcon("Pics/117.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Seadra = new Water_Type("Seadra",pokemonImage);
	        	return Seadra;
	           
	        case 21:
	        	pokemonIcon = new ImageIcon("Pics/118.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Goldeen = new Water_Type("Goldeen",pokemonImage);
	        	return Goldeen;
	            
	        case 22:
	        	pokemonIcon = new ImageIcon("Pics/119.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Seaking = new Water_Type("Seaking",pokemonImage);
	        	return Seaking;
	           
	        case 23:
	        	pokemonIcon = new ImageIcon("Pics/120.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Staryu = new Water_Type("Staryu",pokemonImage);
	        	return Staryu;
	           
	        case 24:
	        	pokemonIcon = new ImageIcon("Pics/121.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Starmie = new Dual_Type("Starmie", "water", "psychic",pokemonImage);
		        return Starmie;
		        
	        case 25:
	        	pokemonIcon = new ImageIcon("Pics/129.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Magikarp = new Water_Type("Magikarp",pokemonImage);
	        	return Magikarp;
	           
	        case 26:
	        	pokemonIcon = new ImageIcon("Pics/130.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Gyarados = new Dual_Type("Gyarados", "water", "flying",pokemonImage);
		        return Gyarados;
		       
	        case 27:
	        	pokemonIcon = new ImageIcon("Pics/134.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Water_Type Vaporeon = new Water_Type("Vaporeon",pokemonImage);
	        	return Vaporeon;
	           
	        case 28:
	        	pokemonIcon = new ImageIcon("Pics/131.png");
	    		pokemonImage = pokemonIcon.getImage();
	        	Dual_Type Lapras = new Dual_Type("Lapras", "water", "ice",pokemonImage);
		        return Lapras;
		       
	        default:
	        	break;
			}
		return null;
		
			
		}
		
	
	private static Pokemon grassMaker() {
		// TODO Auto-generated method stub
	pokeId = (int) Math.ceil(Math.random() * 12);
	switch(pokeId){
        case 1:
        	pokemonIcon = new ImageIcon("Pics/1.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Bulbasaur = new Dual_Type("Bulbasaur", "grass", "poison",pokemonImage);
	        return Bulbasaur;
	        
        case 2:
        	pokemonIcon = new ImageIcon("Pics/2.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Ivysaur = new Dual_Type("Ivysaur", "grass", "poison",pokemonImage);
            return Ivysaur;
	        
        case 3:
        	pokemonIcon = new ImageIcon("Pics/3.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Venusaur = new Dual_Type("Venusaur", "grass", "poison",pokemonImage);
        	return Venusaur;
	        
        case 4:
        	pokemonIcon = new ImageIcon("Pics/114.png");
    		pokemonImage = pokemonIcon.getImage();
        	Grass_Type Tangela = new Grass_Type("Tangela",pokemonImage);
        	return Tangela;
        	
        case 5:
        	pokemonIcon = new ImageIcon("Pics/43.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Oddish = new Dual_Type("Oddish", "grass", "poison",pokemonImage);
	        return Oddish;
	        
        case 6:
        	pokemonIcon = new ImageIcon("Pics/44.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Gloom = new Dual_Type("Gloom", "grass", "poison",pokemonImage);
            return Gloom;
	        
        case 7:
        	pokemonIcon = new ImageIcon("Pics/45.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Vileplume = new Dual_Type("Vileplume", "grass", "poison",pokemonImage);
        	return Vileplume;
	        
        case 8:
        	pokemonIcon = new ImageIcon("Pics/69.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Bellsprout = new Dual_Type("Bellsprout", "grass", "poison",pokemonImage);
	        return Bellsprout;
	        
        case 9:
        	pokemonIcon = new ImageIcon("Pics/70.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Weepinbell = new Dual_Type("Weepinbell", "grass", "poison",pokemonImage);
            return Weepinbell;
	        
        case 10:
        	pokemonIcon = new ImageIcon("Pics/71.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Victreebel = new Dual_Type("Victreebel", "grass", "poison",pokemonImage);
        	return Victreebel;
	        
        case 11:
        	pokemonIcon = new ImageIcon("Pics/102.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Exeggcute = new Dual_Type("Exeggcute", "grass", "psychic",pokemonImage);
	        return Exeggcute;
	        
        case 12:
        	pokemonIcon = new ImageIcon("Pics/103.png");
    		pokemonImage = pokemonIcon.getImage();
        	Dual_Type Exeggutor = new Dual_Type("Exeggutor", "grass", "psychic",pokemonImage);
	        return Exeggutor;
	           
        default:
        	break;
		}
	return null;
	
	}
	
	
	
	
}	

