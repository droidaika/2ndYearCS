package Pokemonweek6;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;



public class PauseMenu  implements MenuInterface {
		
		
		
		

	private Boolean order = true;
	private Boolean swap = false;
	//private Boolean item =false;
	private int pos=0;
	private PokemonMenu Swap;
	//private ItemMenu Item;
		
		public  PauseMenu(Player player){
			
			Swap = new PokemonMenu(player);
			//Item = new ItemMenu();
			
			
		}
		
		
		public void paint(Graphics g){
			
			if(swap == false){
			ImageIcon Menu = new ImageIcon("Pics/menu.jpg");
			Image MenuPic = Menu.getImage();
			g.drawImage(MenuPic, MovingPokemonApplication.widthApplet*400/600, 0,  MovingPokemonApplication.widthApplet*200/600, MovingPokemonApplication.heightApplet*300/600, null);
			
			ImageIcon Cursor = new ImageIcon("Pics/cursor.png");
			Image cursorPic = Cursor.getImage();
			//System.out.println(pos + " is");
			if(pos == 0){
				g.drawImage(cursorPic, MovingPokemonApplication.widthApplet*420/600,MovingPokemonApplication.heightApplet*50/600,  MovingPokemonApplication.widthApplet*20/600,MovingPokemonApplication.heightApplet*70/600, null);
			}else
			if(pos == 1){
				g.drawImage(cursorPic, MovingPokemonApplication.widthApplet*420/600,MovingPokemonApplication.heightApplet*130/600,  MovingPokemonApplication.widthApplet*20/600,MovingPokemonApplication.heightApplet*70/600, null);
			}else
			if(pos == 2){
				g.drawImage(cursorPic, MovingPokemonApplication.widthApplet*420/600,MovingPokemonApplication.heightApplet*200/600,  MovingPokemonApplication.widthApplet*20/600,MovingPokemonApplication.heightApplet*70/600, null);
			}
			}/*else if(item==true){
				Item.paint(g);
			}*/else if(swap==true){
				
				Swap.paint(g);
				swap = Swap.Update();
				if(swap==false){
					order = false;
					
				}
				
			}
			
			
		}
		
		

		
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(swap==false){
			if(e.getKeyCode()== KeyEvent.VK_DOWN){
				if(pos!= 2){
					pos++;
					}
			}
			else if(e.getKeyCode()== KeyEvent.VK_UP){
				if(pos!= 0){
					pos--;
					}
			}
			else if(e.getKeyCode()== KeyEvent.VK_ENTER){
				if(pos== 0){
					swap=true;
					}
				if(pos==1){
					//item = true;
				}
				if(pos==2){
					order = false;
				}
			}
			}else{
				
				Swap.keyPressed(e);
			}
			
		 
		}

		
		

		
		
		public boolean Update(){
			if(order == false){
				order = true;
				return false;
			}else{
				return true;
			}
		}


		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(swap==true){
			Swap.keyReleased(e);
			}
		}


		
		

		

	
}
