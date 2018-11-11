package Labs;

import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;
import java.util.Stack;

public class BadGuy {

	Image myImage;
	int x = 0, y = 0;
	boolean hasPath = false;

	
	
	Stack<Node> stack = new Stack<Node>();

	public BadGuy(Image i) {
		myImage = i;
		x = 30;
		y = 10;
		

	}

	public void reCalcPath(boolean map[][], int targx, int targy) {
		//initiliases node grid
		Node[][] nodeMap = new Node[40][40];
		for (int k = 0; k < 40; k++) {
			for (int j = 0; j < 40; j++) {
				nodeMap[k][j] = new Node();

				nodeMap[k][j].setCoord(k, j);
				
			}
		}
		System.out.println("HEY");
		//starts linked list
		LinkedList<Node> open = new LinkedList<Node>();
		
		
		open.add(nodeMap[x][y]);
		nodeMap[x][y].setParent(nodeMap[x][y]);
		
		//index is where in list the selected square is. Start off at first position before entering loop
		int index = 0;
		//loops until you have found the shortest path to target
		while (((Node) open.get(index)).getCoordx() != targx || ((Node) open.get(index)).getCoordy() != targy) {
			Node current = (Node) open.get(index);
			
			//looks at all squares around selected square
			for (int i = current.getCoordx() - 1; i <= current.getCoordx() + 1; i++) {
				for (int j = current.getCoordy() - 1; j <= current.getCoordy() + 1; j++) {
					//makes sure you dont look at an out of bounds square 
					if(i >=0 && j >=0 && i <40 &&j<40){
					
					
					//makes sure no wall present 
					if (map[i][j] == false) 
					//if there is no parent then the node is not in the closed list
					//as every node with a parent would have been put in a closed list if i had made one
					if(nodeMap[i][j].getParent() == null) {
						
						open.add(nodeMap[i][j]);
						
						nodeMap[i][j].setParent(current);
						
							//14 if diaganol, 10 if adjacent
							//number is added to parent g to find new g
						if (i != current.getCoordx() && j != current.getCoordy()) {
							nodeMap[i][j].setG(14+nodeMap[i][j].getParent().getG());
						} else {
							nodeMap[i][j].setG(10+nodeMap[i][j].getParent().getG());
						}
						//heuristic cost is calculated
						nodeMap[i][j].setH(10 * (Math.abs((targy - j)) + Math.abs((targx - i))));

					}else if (i != current.getCoordx() && j != current.getCoordy()) {
						//checks to see if new parent is a quicker path than old parent
						System.out.println("checkX " + i + "j " + j +  " new " +nodeMap[i][j].getG() +" current "+ current.getG()  + "x" + current.getCoordx() + "y"+ current.getCoordy());
						if(current.getG() >= 14 + nodeMap[i][j].getG()){
							System.out.println("checkA" + i + "j" + j );
							current.setParent(nodeMap[i][j] );
							current.setG(14+nodeMap[i][j].getG());
						}
						//checks to see if new parent is a quicker path than old parent
					} else if(current.getG() >= 10 + nodeMap[i][j].getG()){
						System.out.println("checkX " + i + "j " + j +  " new " +nodeMap[i][j].getG() + " current "+ current.getG()  +"x" + current.getCoordx() + "y"+ current.getCoordy());

						System.out.println("checkB" + i + "j" + j);
						current.setParent(nodeMap[i][j]);
						current.setG(10+nodeMap[i][j].getG());
					}
					}

				}
				
			}
			
			
			
			//removes node from open list as its no longer needed
			open.remove(index);
			index = 0;
			
			
			//finds node in open list with smallest f cost
			for (int i = 0; i < open.size(); i++) {
				
				if (((Node) open.get(i)).getF() <= ((Node) open.get(index)).getF()) {
					index = i;
				}
			}
			
			
		}
		
		hasPath = true;

		
		Node push = (Node) open.get(index);
		
		//deletes all items in stack in case a path ahs to be recalulated and there are items still int he stack
		while(stack.size()!=0){
			stack.pop();
		}
		
		//finds out what needs to go into the stack by following the parent route of destination square.
		//this gives us the A* path route
		while (push.getCoordx() != x || push.getCoordy() != y) {

			stack.push(push);
			push = push.getParent();
			System.out.println("x: " + push.getParent().getCoordx() + " y: " + push.getParent().getCoordy());
		}
		
		System.out.print("done");

	}

	public void move(boolean map[][], int targx, int targy) {
		if (hasPath) {
			
			if(stack.size()>0){
			System.out.println("moving");
			
			System.out.print("hasPath");
			System.out.println("Moved from y " + y + "to" + ((Node) stack.peek()).getCoordy());
			System.out.println("Moved from x " + x + "to" +  ((Node) stack.peek()).getCoordx());
			
			//moves bad guy to last node in stack which essentially makes him walk to player.
			x = ((Node) stack.peek()).getCoordx();
			y = ((Node) stack.peek()).getCoordy();
			stack.pop();
			}
			

		} else {
			// no path known, so just do a dumb 'run towards' behaviour
			int newx = x, newy = y;
			if (targx < x)
				newx--;
			else if (targx > x)
				newx++;
			if (targy < y)
				newy--;
			else if (targy > y)
				newy++;
			if (!map[newx][newy]) {
				x = newx;
				y = newy;
			}
		}
	}

	public void paint(Graphics g) {
		g.drawImage(myImage, x * 20, y * 20, null);
	}

}
