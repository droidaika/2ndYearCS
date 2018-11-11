package Pokemonweek6;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;



public class PokemonMenu  implements MenuInterface {
		
		
		
	private Cursor cursor;
	private Player player;
	private Boolean pause = true;
		
		public  PokemonMenu(Player player){
			cursor = new Cursor(player);
			this.player = player;
			
			
			
		}
		
		
		public void paint(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0, 0,(int) MovingPokemonApplication.widthApplet,MovingPokemonApplication.heightApplet);
			ImageIcon Menu = new ImageIcon("Pics/menu.png");
			Image MenuPic = Menu.getImage();
			g.drawImage(MenuPic, 0, MovingPokemonApplication.heightApplet*435/600,  MovingPokemonApplication.widthApplet,MovingPokemonApplication.heightApplet* 165/600, null);
			player.paintPokemon(g);
		
			if(player.getYSpeed() != 0){
				cursor.moveCursor(player.getYSpeed());
			}
			cursor.paint(g);
			
		}
		
		

		
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("working keys");
			if(e.getKeyCode()== KeyEvent.VK_DOWN){
	            player.setYSpeed(1);
			}
			else if(e.getKeyCode()== KeyEvent.VK_UP){
	        	player.setYSpeed(-1);
			}
			if(e.getKeyCode()== KeyEvent.VK_ENTER){
					pause = false;
					System.out.print("unpaused");
				
			}
			if(e.getKeyCode()== KeyEvent.VK_A){
	            cursor.select();
			}
		 
		}

		
		public void keyReleased(KeyEvent e) {
			player.setYSpeed(0);
			
			
		}

		
		
		public boolean Update(){
			if(pause == false){
				pause = true;
				return false;
			}else{
				return true;
			}
		}


		

	
}
