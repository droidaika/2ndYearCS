
package Pokemonweek6;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class NatureIsCruel2dAnimated {
	
	
    private Pokemon[] pokemon;
    private Pokemon[][] pokemonGrid;
    private Player trainer;
    private BattleMenu BattleRoyale = new BattleMenu();
    private int gridX ;
    private int gridY ;
    private int beginX = 0;
    private int beginY = 0;
    
    ImageIcon Grass = new ImageIcon("Pics/grass.png");
	Image GrassPic = Grass.getImage();
	ImageIcon GrassMove = new ImageIcon("Pics/grassMove.png");
	Image GrassPicMove = GrassMove.getImage();
	
    
    private Map map;
    
    private Pokemon pokeTemp;
	
    public NatureIsCruel2dAnimated(Pokemon[] poke, Player player, int beginX, int beginY, int gridX, int gridY ){
    	this.beginX = beginX;
    	this.beginY = beginY;
    	this.gridX = gridX;
    	this.gridY = gridY;
    	trainer = player;
    	this.pokemon = poke;
    	int i = 0;
    	pokemonGrid = new Pokemon[gridX][gridY];
    	for(int j = beginX; j <gridX; j++){
    		for(int k = beginY; k < gridY;k++){
    			pokemonGrid[j][k] = null;
    		}
    	}
    	
    	while( i<poke.length){
    		int x = (int) (Math.random() * gridX);
    		int y = (int) (Math.random() * gridY);
    		
    		if(pokemonGrid[x][y] == null){
    			System.out.println("Your random x is " + x +" Your random y is " + y);
    			pokemonGrid[x][y] = poke[i];
    			poke[i].setCoord(x, y);
    			//Coordinates[i][0]=x;
    			//Coordinates[i][0]=y;
    			i++;
    		}
    	}
    	
    	for(int j = 0; j < pokemon.length; j++){
			System.out.println(pokemonGrid[pokemon[j].getCoordX()][pokemon[j].getCoordY()].getLevel());
				
			
		}
    	engage();
    	 
    }
	
    
    
   
    private void  move() {
    	
    	for(int i = 0; i < pokemon.length; i++){
    		
			int rand = (int) (Math.random()* 4);
			//System.out.println("randorig " + rand);
			if(pokemon[i].getCoordX()==0){
				
				rand =0;
			} else
			if(pokemon[i].getCoordX()==pokemonGrid.length-1||pokemonGrid[pokemon[i].getCoordX()+1][pokemon[i].getCoordY()] != null){
				rand =1;
			}else
			if(pokemonGrid[pokemon[i].getCoordX()-1][pokemon[i].getCoordY()]!= null){
					rand = 0;
			}
			else
			if(pokemon[i].getCoordY()==0){
				rand =2;
			} else
			if(pokemon[i].getCoordY()==pokemonGrid[0].length-1||pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()+1]!= null){
				rand =3;
			}else 
			if(pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()-1]!= null){
				rand =2;
			}
			
			if(rand == 0){
						
				if(map.checkCollisions(pokemon[i].getCoordX(),pokemon[i].getCoordY(),pokemon[i].getCoordX()+1,pokemon[i].getCoordY())== false){
					
					pokemonGrid[pokemon[i].getCoordX()+1][pokemon[i].getCoordY()]=  pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()];
				 pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()]= null;
				pokemon[i].setCoord(pokemon[i].getCoordX()+1,pokemon[i].getCoordY());
				}
				
			}else
			if(rand == 1) {
				if(map.checkCollisions(pokemon[i].getCoordX(),pokemon[i].getCoordY(),pokemon[i].getCoordX()-1,pokemon[i].getCoordY())== false){
					
				pokemonGrid[pokemon[i].getCoordX()-1][pokemon[i].getCoordY()]=  pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()];
				 pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()] = null;
				pokemon[i].setCoord(pokemon[i].getCoordX()-1,pokemon[i].getCoordY());
				}
				
			}else
				if(rand == 2){
					
					if(map.checkCollisions(pokemon[i].getCoordX(),pokemon[i].getCoordY(),pokemon[i].getCoordX(),pokemon[i].getCoordY()+1)== false){
					
					 pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()+1]=  pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()];
					 pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()]= null;
					pokemon[i].setCoord(pokemon[i].getCoordX(),pokemon[i].getCoordY()+1);
					}
					
				}else
				if(rand == 3) {
					
					if(map.checkCollisions(pokemon[i].getCoordX(),pokemon[i].getCoordY(),pokemon[i].getCoordX(),pokemon[i].getCoordY()-1)== false){
					
					pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()-1]=  pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()];
					 pokemonGrid[pokemon[i].getCoordX()][pokemon[i].getCoordY()]= null;
					pokemon[i].setCoord(pokemon[i].getCoordX(),pokemon[i].getCoordY()-1);
					}
					
				}
				
			}
    	
    }
        

public Pokemon engage(){
		if(trainer.getCoordY()<pokemonGrid[0].length&&trainer.getCoordY()>0&&trainer.getCoordX()<pokemonGrid.length&&trainer.getCoordX()>0){
		if(trainer.getCoordX()<pokemonGrid.length-1){
			//System.out.println("trrainx is " + trainer.getCoordX());
			if(pokemonGrid[trainer.getCoordX()+1][trainer.getCoordY()]!= null){
				return(pokemonGrid[trainer.getCoordX()+1][trainer.getCoordY()]);
			}
			if(trainer.getCoordY() >pokemonGrid[0].length-1){
				//System.out.println("trrainy is " + trainer.getCoordY());
				if(pokemonGrid[trainer.getCoordX()+1][trainer.getCoordY()+1]!= null){
					return(pokemonGrid[trainer.getCoordX()+1][trainer.getCoordY()+1]);
				}
			}
			if(trainer.getCoordY()> 0){
				//System.out.println("trrainy is " + trainer.getCoordY());
				if(pokemonGrid[trainer.getCoordX()+1][trainer.getCoordY()-1]!= null){
					return(pokemonGrid[trainer.getCoordX()+1][trainer.getCoordY()-1]);
				}
			}
		} 
		if(trainer.getCoordX() > 0){
			//System.out.println("trrainx is " + trainer.getCoordX());
			if(pokemonGrid[trainer.getCoordX()-1][trainer.getCoordY()]!= null){
				return(pokemonGrid[trainer.getCoordX()-1][trainer.getCoordY()]);
			}
			if(trainer.getCoordY() >pokemonGrid[0].length-1){
				//System.out.println("trrainy is " + trainer.getCoordY());
				if(pokemonGrid[trainer.getCoordX()-1][trainer.getCoordY()+1]!= null){
					return(pokemonGrid[trainer.getCoordX()-1][trainer.getCoordY()+1]);
				}
			}
			if(trainer.getCoordY()> 0){
				//System.out.println("trrainy is " + trainer.getCoordY());
				if(pokemonGrid[trainer.getCoordX()-1][trainer.getCoordY()-1]!= null){
					return(pokemonGrid[trainer.getCoordX()-1][trainer.getCoordY()-1]);
				}
			}
		}
		
		
		if(trainer.getCoordY() >pokemonGrid[0].length-1){
			//System.out.println("trrainy is " + trainer.getCoordY());
			if(pokemonGrid[trainer.getCoordX()][trainer.getCoordY()+1]!= null){
				return(pokemonGrid[trainer.getCoordX()][trainer.getCoordY()+1]);
			}
		}
		if(trainer.getCoordY()> 0){
			//System.out.println("trrainy is " + trainer.getCoordY());
			if(pokemonGrid[trainer.getCoordX()][trainer.getCoordY()-1]!= null){
				return(pokemonGrid[trainer.getCoordX()][trainer.getCoordY()-1]);
			}
		}
		}
		return null;
		
		
		
		
	}
    	
    
    
    private void arrayReducer(int i, int j) {
		System.out.println("length before: " + pokemon.length +"\n");
		pokemonGrid[i][j] = null;
		int length = pokemon.length;
		
		for(int k = 0; k < length; k++){
			if(i==pokemon[k].getCoordX() && j == pokemon[k].getCoordY()){
				for(int l = k; l < length-1; l++){
					pokemon[l]= pokemon[l+1];
				}
				length--;
				pokemon = Arrays.copyOf(pokemon,length);
				System.out.println("length after: " + pokemon.length +"\n");
			}
			
		}
    }
    
    
	

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		if(Update()==false){
			
			 
			
			move();
			for(int i = 0; i < gridX; i++){
				for(int j = 0; j < gridY; j++){
					if(pokemonGrid[i][j]!= null){
						//g.drawImage(GrassPicMove, ((int)i*MovingPokemonApplication.widthApplet*1/12)-10, (int)j*MovingPokemonApplication.heightApplet*2/31, (int)MovingPokemonApplication.widthApplet*3/32,(int)MovingPokemonApplication.heightApplet*4/40, null);
						g.drawImage(GrassPicMove, (int)i*MovingPokemonApplication.widthApplet*1/12 , (int)j*MovingPokemonApplication.heightApplet*1/15, (int)MovingPokemonApplication.widthApplet*1/12,(int)MovingPokemonApplication.heightApplet*3/40, null);

					}else{
						//g.drawImage(GrassPic, ((int)i*MovingPokemonApplication.widthApplet*1/12)-10, (int)j*MovingPokemonApplication.heightApplet*1/15, (int)MovingPokemonApplication.widthApplet*1/12,(int)MovingPokemonApplication.heightApplet*3/40, null);

						g.drawImage(GrassPic, (int)i*MovingPokemonApplication.widthApplet*1/12 , (int)j*MovingPokemonApplication.heightApplet*1/15, (int)MovingPokemonApplication.widthApplet*1/12,(int)MovingPokemonApplication.heightApplet*3/40, null);
				
					}
				}
			}
		 
		 
		 if(BattleRoyale.isRun()==false){
			 
			 int fontSize = MovingPokemonApplication.widthApplet*80/600;
			 
			 g.setColor(Color.white);
			 g.fillRect(0, 0,  MovingPokemonApplication.widthApplet,MovingPokemonApplication.heightApplet);
			 
			 
			 
			 String string ="";
			 if(BattleRoyale.battle() == true){
				 if(BattleRoyale.TryCatchUpdate() == true&&trainer.addPokemon(pokeTemp)==true){
					
					 string = "CAUGHT HIM";
				   	 
				   	 
				  }else{
				    
			   	 string = "YOU WON!!!";
				  }
			    //System.out.println("good");
				arrayReducer(pokeTemp.getCoordX(),pokeTemp.getCoordY());
			 }else{
				 if(BattleRoyale.TryCatchUpdate() == true){
					 fontSize = MovingPokemonApplication.widthApplet*40/600;
					 string = "YOU DID NOT CATCH HIM";
				   	 
				   	 
				  }else{
				   	 string = "YOU LOSE!!";
				  }
				 trainer.arrayReducer();
				   	 
			 }
			 g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
			 g.setColor(Color.BLACK);
			 g.drawString(string, MovingPokemonApplication.widthApplet*100/600,MovingPokemonApplication.heightApplet*300/600);
		   	 
			
			 
		 }else{
		 
		 pokeTemp = engage();
		 if(pokeTemp != null){
			 
			 BattleRoyale.add(trainer,pokeTemp);
			 
			 BattleRoyale.paint(g);
		 }
		 }
		 
		
		}
		
		 if(Update()==true){
			 BattleRoyale.paint(g);
			 
			 
		 }
		
		 
	}


	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		BattleRoyale.keyPressed(e);
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		BattleRoyale.keyReleased(e);
	}


	


	public boolean Update() {
		// TODO Auto-generated method stub
		return BattleRoyale.Update();
	}




	public Pokemon get(int i, int j) {
		// TODO Auto-generated method stub
		return pokemonGrid[i][j];
	}




	public int beginY() {
		// TODO Auto-generated method stub
		return beginY;
	}




	public int beginX() {
		// TODO Auto-generated method stub
		return beginX;
	}

	public int getCoordY() {
		// TODO Auto-generated method stub
		return gridY;
	}


	public int getCoordX() {
		// TODO Auto-generated method stub
		return gridX;
	}


	public void add(Map map) {
		// TODO Auto-generated method stub
		this.map = map;
		
		
	}
	
}