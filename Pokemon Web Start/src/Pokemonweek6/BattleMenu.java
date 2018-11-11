package Pokemonweek6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class BattleMenu extends JFrame implements MenuInterface {
		
		
		
		
		/**
	 * 
	 */
	private static final long serialVersionUID = -6728246175341934765L;
		private PokemonMenu Swap;
		private ItemMenu items;
		private boolean tryCatch = false;
		
		private boolean win;
		private boolean battle = false;
		private boolean run = true;
		private boolean swap = false;
		private boolean item = false;
		private int pos = 0;
		private Player trainer; 
		private Pokemon pokemon;
		
		public void add(Player trainer, Pokemon pokemon) {
			
			//items = new ItemMenu(trainer);
			Swap= new PokemonMenu(trainer);
			battle=true;
			this.trainer = trainer;
			this.pokemon = pokemon;
		}
		
		
		public void paint(Graphics g){
			if(swap == true){
				
				Swap.paint(g);
				swap = Swap.Update();
				
				
			}else if(item == true){
				items.paint(g);
			}else{
			
			g.setColor(Color.white);
			 g.fillRect(0, 0,(int) MovingPokemonApplication.widthApplet,MovingPokemonApplication.heightApplet);
			ImageIcon Menu = new ImageIcon("Pics/battlemenu.jpg");
			Image MenuPic = Menu.getImage();
			g.drawImage(MenuPic, 0,  MovingPokemonApplication.heightApplet*435/600,  MovingPokemonApplication.widthApplet*600/600,MovingPokemonApplication.heightApplet*165/600, null);
			trainer.getPokemon().paintPoke(g, MovingPokemonApplication.widthApplet*100/600,MovingPokemonApplication.heightApplet*200/600, MovingPokemonApplication.widthApplet*200/600,MovingPokemonApplication.heightApplet*200/600);
			trainer.getPokemon().paintLvl(g, MovingPokemonApplication.widthApplet*350/600,MovingPokemonApplication.heightApplet*350/600, MovingPokemonApplication.widthApplet*50/600);
			
			pokemon.paintPoke(g, MovingPokemonApplication.widthApplet*300/600,MovingPokemonApplication.heightApplet*50/600,  MovingPokemonApplication.widthApplet*200/600,MovingPokemonApplication.heightApplet*200/600);
			pokemon.paintLvl(g, MovingPokemonApplication.widthApplet*100/600,MovingPokemonApplication.heightApplet*150/600, MovingPokemonApplication.widthApplet*50/600);
			
			//pokemon.paintPos(g, 3);
			
			
			ImageIcon Cursor = new ImageIcon("Pics/cursor.png");
			Image cursorPic = Cursor.getImage();
			//System.out.println(pos + " is");
			if(pos == 0){
				g.drawImage(cursorPic,  MovingPokemonApplication.widthApplet*280/600,MovingPokemonApplication.heightApplet*470/600,   MovingPokemonApplication.widthApplet*20/600,MovingPokemonApplication.heightApplet*70/600, null);
			}else
			if(pos == 1){
				g.drawImage(cursorPic,  MovingPokemonApplication.widthApplet*460/600,MovingPokemonApplication.heightApplet*470/600,   MovingPokemonApplication.widthApplet*20/600,MovingPokemonApplication.heightApplet*70/600, null);
			}else
			if(pos == 2){
				g.drawImage(cursorPic,  MovingPokemonApplication.widthApplet*280/600,MovingPokemonApplication.heightApplet*510/600,   MovingPokemonApplication.widthApplet*20/600,MovingPokemonApplication.heightApplet*70/600, null);
			}else
			if(pos == 3){
				g.drawImage(cursorPic,  MovingPokemonApplication.widthApplet*460/600,MovingPokemonApplication.heightApplet*510/600,  MovingPokemonApplication.widthApplet*20/600,MovingPokemonApplication.heightApplet*70/600, null);
			}
			}
			
			
			
		}
		
		

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("pressed");
			if(swap==true){
		
				Swap.keyPressed(e);
			}else if(item == true){
				items.keyPressed(e);
			}
			else
			{
			if(e.getKeyCode()== KeyEvent.VK_RIGHT){
	            if(pos==0||pos==2){
	            pos++;
	            }
			}
			if(e.getKeyCode()== KeyEvent.VK_LEFT){
	            if(pos==1||pos==3){
	            pos--;
	            }
			}
		 	if(e.getKeyCode()== KeyEvent.VK_UP){
	        	if(pos==2||pos==3){
	            pos=pos-2;
	            }
			}
			if(e.getKeyCode()== KeyEvent.VK_DOWN){
	        	if(pos==0||pos==1){
	            pos=pos+2;
	            }
			}
			if(e.getKeyCode()== KeyEvent.VK_ENTER){
				if(pos==0){
					//System.out.println("run is flase");
					run = false;
					battle=false;
					
				
				}else if(pos==1){
					
					swap = true;
				}
				else if(pos==2){
					//item = true;
					tryCatch = true;
					
					run = false;
					battle = false;
				}
				else if(pos==3){
					
					battle=false;
					
				}
			}
			}
			
		 
		}

		@Override
		public void keyReleased(KeyEvent e) {
			Swap.keyReleased(e);	
			
			
			
		}

		@Override
		public boolean Update(){
			//System.out.println("pause " + battle);
			if(battle == false){
				
				return false;
			}else{
				
				
				return true;
			}
		}
		
		public boolean TryCatchUpdate(){
			//System.out.println("pause " + battle);
			if(tryCatch == false){
				
				return false;
			}else{
				
				tryCatch = false;
				return true;
			}
		}
		
		
		
		
		
		public boolean battle() {
			// TODO Auto-generated method stub
	    	int level1= trainer.getPokemon().getLevel();
	    	
	    	int level2= pokemon.getLevel();
	    	
	    	System.out.println("your lvl." + trainer.getPokemon().getLevel()  + " " + trainer.getPokemon().getId()  + " vs. a lvl." + pokemon.getLevel() + " "+  pokemon.getId() + " " );
	    	if(trainer.getPokemon() instanceof Dual_Type){
	    		if(pokemon.eats(trainer.getPokemon().getType1()) == true||pokemon.eats(trainer.getPokemon().getType2()) == true){
	    			System.out.println("\n" + pokemon.getId() + " has type advantage.");
		   		
	    			level2 *= 2;
	    		}
			   
	    	}else{
	    		if(pokemon.eats(trainer.getPokemon()) == true){
			    		
	    			System.out.println("\n" + pokemon.getId() + " has type advantage.");
			    	level2 *= 2; 
			    }
			   
	    	}
		   
	    	if(pokemon instanceof Dual_Type){
	    		if(pokemon.eats(pokemon.getType1()) == true||trainer.getPokemon().eats(pokemon.getType2()) == true){
	    			System.out.println("\n" + trainer.getPokemon().getId() + " has type advantage.");
				
	    			level1 *= 2;
	    		}	
	    	}else{
	    		if(trainer.getPokemon().eats(pokemon) == true){
			    		System.out.println("\n" + trainer.getPokemon().getId() + " has type advantage.");
			    		
			    		level1 *= 2;
	    		} 
	    	}
	    	if(level1 > level2){
	    		System.out.println(trainer.getPokemon().getId() + "You won. \n");
	    		trainer.getPokemon().IncreaseLevel(level2/10);
	    		win = true;
	    		
	    		
	    		
	    	}
	    		
	    	if(level2 > level1){
	    		System.out.println(pokemon.getId() + " wins.\n");
			
	    		System.out.println("you lost");
	    		win = false;
	    		
	    	}
	    	if(level2 == level1 ){
	    		int dec = (int) Math.floor((Math.random() * 2));
	    		if(dec == 1){

	    		System.out.println(trainer.getPokemon().getId() + " was equally matched but won solely on luck.\n");
	    		trainer.getPokemon().IncreaseLevel(level2/10);
	    		win = true;
	    		
	    		} else {
	    			System.out.println(pokemon.getId() + " was equally matched but won solely on luck.\n");
	    		    
	    			win = false;
		    		
	    		}
	    		
	    	}
	    	return win;
	    	
		}


		public boolean isRun() {
			if(run == false){
				run = true;
				return false;
			}else{
				
				
				return true;
			}
			
		}




		
		
		
		


		

	
}
