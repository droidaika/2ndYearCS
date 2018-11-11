package Pokemonweek6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class MoveMenu  implements MenuInterface{

	private Boolean pause = false;
	private Player player;
	private NatureIsCruel2dAnimated[] Anime;
	private Enemy[] rival = new Enemy[3];
	private TrainerBattle Duel;
	private Map[] grid;
	ImageIcon Grass = new ImageIcon(getClass().getResource("/Pics/ground.png"));

	Image GrassPic = Grass.getImage();
	private int levelNo = 5;
	
	
	//ImageIcon Ground = new ImageIcon("Pics/ground.png");
	//Image GroundPic = Ground.getImage();
	
	private int[] pokeNum = new int[levelNo];
	  
	
	public MoveMenu(Player trainer){
		System.out.println("working");
		//number of pokemon in each map
		pokeNum[0] = 5;
		pokeNum[1] = 2;
		pokeNum[2] = 1;
		pokeNum[3] = 12;
		//pokeNum[4] = 12;
		//creates pokemon
		Pokemon[] poke = new Pokemon[pokeNum[0]];
		
		for (int i =0; i< pokeNum[0]; i++){
			poke[i] = ObjectCreator.objectMaker();
			
				  
		}
		Pokemon[] poke2 = new Pokemon[pokeNum[1]];
		
		for (int i =0; i< pokeNum[1]; i++){
			poke2[i] = ObjectCreator.objectMaker();
			
				  
		}
		Pokemon[] poke3 = new Pokemon[pokeNum[2]];
		
		for (int i =0; i< pokeNum[2]; i++){
			poke3[i] = ObjectCreator.objectMaker();
			
				  
		}
		Pokemon[] poke4 = new Pokemon[pokeNum[3]];
		
		for (int i =0; i< pokeNum[3]; i++){
			poke4[i] = ObjectCreator.objectMaker();
			
				  
		}
		/*Pokemon[] poke5 = new Pokemon[pokeNum[4]];
		
		for (int i =0; i< pokeNum[3]; i++){
			poke4[i] = ObjectCreator.objectMaker();
			
				  
		}*/
		//each grid edetails what size map and what is in it
		grid = new Map[levelNo];
		grid[0] = new Map(20,20);
		grid[1] = new Map(20,20);
		grid[2] = new Map(20,20);
		grid[3] = new Map(20,20);
		this.player = trainer;
		rival[0] = new Enemy(6);
		rival[0].setCoord(5, 10);
		rival[1] = new Enemy(6);
		rival[1].setCoord(8, 10);
		rival[2] = new Enemy(6);
		rival[2].setCoord(5, 10);
		
		Anime = new NatureIsCruel2dAnimated[levelNo];
		Anime[0] = new  NatureIsCruel2dAnimated(poke,trainer,0,0,12,12);
		Anime[1] = new  NatureIsCruel2dAnimated(poke2,trainer,0,0,12,5);
		Anime[2] = new  NatureIsCruel2dAnimated(poke3,trainer,0,0,18,18);
		Anime[3] = new  NatureIsCruel2dAnimated(poke4,trainer,0,0,5,5);
		//Anime[4] = new  NatureIsCruel2dAnimated(poke5,trainer,10,10,5,5);
		Duel = new TrainerBattle();
	}
	
	
	public void keyPressed(KeyEvent e) {
	if(Duel.Update() == true){
		Duel.keyPressed(e);
	}else{
	if(Anime[player.Update()].Update()==false){
	 //System.out.println("keyPressed");
	 //System.out.println("keyTyped " + e.getKeyCode());
	 if(e.getKeyCode()== KeyEvent.VK_RIGHT){
           player.setXSpeed(1);
	 }
    else if(e.getKeyCode()== KeyEvent.VK_LEFT){
       	player.setXSpeed(-1);
    }
	 if(e.getKeyCode()== KeyEvent.VK_DOWN){
           player.setYSpeed(1);
	 }
    else if(e.getKeyCode()== KeyEvent.VK_UP){
       	player.setYSpeed(-1);
    }
	 if(e.getKeyCode()== KeyEvent.VK_ENTER){
		 
       	pause = true;
       	System.out.print("paused");
		 
    }
	 if(e.getKeyCode()== KeyEvent.VK_A){
		 
	       	Duel.add(player,rival[0]);
	       	
	    }
	}else{
		
    	Anime[player.Update()].keyPressed(e);
    
	}
	}
	
	 
}
	
	public void keyReleased(KeyEvent e) {
	if(Duel.Update() == true){
	Duel.keyReleased(e);
	}else{
	if(Anime[player.Update()].Update()==false){
	
	player.setXSpeed(0);
	player.setYSpeed(0);
	}else
	{
		Anime[player.Update()].keyReleased(e);
	}
	}
	
}

	

	@Override
	public boolean Update() {
		// TODO Auto-generated method stub
		if(pause == true){
			pause = false;
			return true;
		}else{
			return false;
		}
	}
	
	public void paint(Graphics g){
		
		if(Duel.Update() == false){
		
		if(Anime[player.Update() ].Update()==false){
		grid[player.Update()].add(Anime[player.Update()]);
		/*if(player.Update() ==3){
			grid[player.Update()].add(Anime[4]);
		}*/
		System.out.println(player.Update());
		grid[player.Update()].add(Anime[player.Update()]);
		grid[player.Update()].add(player);
		g.setColor(Color.green);
        g.fillRect(0, 0,(int) MovingPokemonApplication.widthApplet,MovingPokemonApplication.heightApplet);
        
       
        
        
		
		if(player.Update() == 0){
		
		
		
		grid[0].add(rival[0]);
		
		
		Anime[0].paint(g);
		
		
		//map.paint[g] will do rival player and anime potentially. UFrther thought needed;
		rival[0].paint(g);
		player.paint(g);
		player.movePlayer();
		
		
		}else if(player.Update() == 1){
			
			/*for(int i = 0; i < 6; i++){
				for(int j = 0; j < 2; j++){
					g.drawImage(GrassPic,  i*MovingPokemonApplication.widthApplet*1/6,j*MovingPokemonApplication.heightApplet*1/5, MovingPokemonApplication.widthApplet*1/6, MovingPokemonApplication.heightApplet*1/5, null);
				}
			}*/
			
			player.paint(g);
			player.movePlayer();
			Anime[1].paint(g);
		}else if(player.Update() == 2){
			grid[2].add(rival[1]);
			grid[2].add(rival[2]);
			
			
			
			/*for(int i = 0; i < 6; i++){
				for(int j = 0; j < 5; j++){
					g.drawImage(GrassPic,  i*MovingPokemonApplication.widthApplet*1/6,j*MovingPokemonApplication.heightApplet*1/5, MovingPokemonApplication.widthApplet*1/6, MovingPokemonApplication.heightApplet*1/5, null);
				}
			}*/
			
			//map.paint[g] will do rival player and anime potentially. UFrther thought needed;
			rival[1].paint(g);
			rival[2].paint(g);
			player.paint(g);
			player.movePlayer();
			Anime[2].paint(g);
		}else{
			
			
			
			player.paint(g);
			player.movePlayer();
			Anime[3].paint(g);
			for(int i = 5; i<10; i++){
				for(int j = 0; j <15; j++){
					//g.drawImage(GroundPic, (int)i*MovingPokemonApplication.widthApplet*1/12 , (int)j*MovingPokemonApplication.heightApplet*1/15, (int)MovingPokemonApplication.widthApplet*1/12,(int)MovingPokemonApplication.heightApplet*3/40, null);
				}
			}
		}
		
		
		}else{
			Anime[player.Update()].paint(g);
		}
		}else{
			Duel.paint(g);
		}
		
		
	}


	

}
