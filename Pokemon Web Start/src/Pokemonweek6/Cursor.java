package Pokemonweek6;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;



public class Cursor {

	
	private int y=0;
	private String workingDirectory;
	private Player trainer;
	private ImageIcon Cursor;
	private Image cursorPic;
	
	
	public void moveCursor(double ySpeed) {
		System.out.println(trainer.getpokemonNumber());
		if(y < trainer.getpokemonNumber()-1 && ySpeed == 1 ||y != 0 && ySpeed == -1){
		y+=1*ySpeed;
		}
	}
	
	public Cursor(Player player){
		
		
		Cursor = new ImageIcon("Pics/cursor.png");
		cursorPic = Cursor.getImage();
		trainer = player;
		
		
	}
	
	public void paint(Graphics g) {
		
		
		
		g.drawImage(cursorPic, MovingPokemonApplication.widthApplet*15/600, MovingPokemonApplication.heightApplet*15/600+ (y*MovingPokemonApplication.heightApplet*70/600),  MovingPokemonApplication.widthApplet*70/600,MovingPokemonApplication.heightApplet*85/600, null);
		
	}

	public void select() {
		// TODO Auto-generated method stub
		trainer.Reorganise(y);
	}

}
