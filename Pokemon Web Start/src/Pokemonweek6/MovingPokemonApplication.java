package Pokemonweek6;



import java.awt.Graphics;
import java.awt.Image;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import javax.swing.JApplet;



public class MovingPokemonApplication extends JApplet implements Runnable,KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5390399197886061542L;
	Graphics bufferGraphics; 
    // The image that will contain everything that has been drawn on 
    // bufferGraphics. 
    Image offscreen; 
    // To get the width and height of the applet. 
    public  static final int widthApplet = 800;
    public  static final int heightApplet = 600;
    
   

	
	private Player player;
	boolean pause = false;

	private PauseMenu Pause;
	private MoveMenu Move;
	
	
	public void init(){
		//numb = num;
		
        // We'll redraw the applet eacht time the mouse has moved. 
        
         
        // Create an offscreen image to draw on 
        // Make it the size of the applet, this is just perfect larger 
        // size could slow it down unnecessary. 
        offscreen = createImage(widthApplet, heightApplet); 
        // by doing this everything that is drawn by bufferGraphics 
        // will be written on the offscreen image. 
        bufferGraphics = offscreen.getGraphics(); 
		this.setSize(widthApplet, heightApplet);
		
		System.out.print("Enter the number of pokemon you want to play the game: \n");  
	    /*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();*/
		
		
		
		
		
		player = new Player(6);
		player.setCoord(6, 14);
		
		

		addKeyListener(this);
		setFocusable(true);
        requestFocusInWindow();
		
		
		
		Move = new MoveMenu(player);
		Pause = new PauseMenu(player);
	}
	public void start(){
		Thread t = new Thread(this);
		t.start();
	}
	
	public void run(){
		while(player.getpokemonNumber()>0){
		
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) { 
            	e.printStackTrace();
            }
            
             
            
            this.repaint();
            //System.out.println("testB");
		
		
		}
		System.out.println("game over");
		
		
	}
	
	
	
	public void paint(Graphics g){
		
		//bufferGraphics.clearRect(0,0,600,600); 
       
        
		if (pause == true) {
			Pause.paint(bufferGraphics);
			pause = Pause.Update();
		}else{
			Move.paint(bufferGraphics);
			
			pause=Move.Update();
		}
		g.drawImage(offscreen,0,0,this);
	}
		
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (pause == true) {
			Pause.keyPressed(e);
		}else{
			Move.keyPressed(e);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (pause == true) {
			Pause.keyReleased(e);
			
		}else{
			Move.keyReleased(e);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	
	
	 public void update(Graphics g) 
     { 
          paint(g); 
     } 

	
	
	

}

