package Pokemonweek6;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public abstract  class Pokemon extends Thing{

	protected String id;
	
	protected int squareSize = 20;
	protected int level;
    protected Image pokemonPic;
	
    public Pokemon(String i, Image pokePic) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.level = (int) (Math.random()* 100);
		pokemonPic = pokePic;
	}
	
	public abstract boolean eats(Pokemon poke);
	
	
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public int getLevel() {
		// TODO Auto-generated method stub
		return level;
	}
	
	
	
	public void paint(Graphics g){
		//System.out.print("yes");
		
		g.drawImage(pokemonPic, (int)x*MovingPokemonApplication.widthApplet*1/12, (int)y*MovingPokemonApplication.heightApplet*1/15, (int)MovingPokemonApplication.widthApplet*1/12,(int)MovingPokemonApplication.heightApplet*3/40, null);
	        
	}
	public void IncreaseLevel(int gainsLevel) {
		// TODO Auto-generated method stub
		if(level+gainsLevel<100){
			level+=gainsLevel;
		}else{
			level=100;
		}
	}


	public void paintPoke(Graphics g,int x,int y, int sizeX, int sizeY) {
		// TODO Auto-generated method stub
		g.drawImage(pokemonPic, x,y,sizeX,sizeY, null);
	
	}
	
	public void paintLvl(Graphics g,int x,int y, int size){
		int fontSize = size;

	    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	    g.setColor(Color.BLACK);
	    
		g.drawString("level is " + getLevel(),x,y);
	}


	public Pokemon getType1() {
		// TODO Auto-generated method stub
		return null;
	}


	public Pokemon getType2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
