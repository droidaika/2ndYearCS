package Pokemonweek6;



public class Map {

	
    private Thing[][] mapGrid;
    //private Person person;
	public Map(int gridX, int gridY){
		
		mapGrid = new Thing[gridX][gridY];
    	for(int j = 0; j <gridX; j++){
    		for(int k = 0; k < gridY;k++){
    			mapGrid[j][k] = null;
    		}
    	}
    	
	}
	public void add(Person person) {
		//this.person = person;
		mapGrid[person.getCoordX()][person.getCoordY()]=person;
		
		person.add(this);
	}
	
	public void add(NatureIsCruel2dAnimated anime) {
		
		for (int i = anime.beginX(); i<anime.getCoordX() + anime.beginX(); i++){
			for (int j = anime.beginY(); j<anime.getCoordY() + anime.beginY(); j++){
				mapGrid[i][j] = anime.get(i,j);
			}
		}
		
		anime.add(this);
	}
	
	public boolean checkCollisions(int x, int y,int i, int j) {
		//System.out.println(person.getCoordX() + " " + person.getCoordY() + " next ");
		
		if (mapGrid[i][j] == null){
			//System.out.println("moved");
			
			mapGrid[i][j] = mapGrid[x][y];
			mapGrid[x][y] = null;
			
			return false;
		}else{
			
			return true;
		}
		
		
	}
	

}
