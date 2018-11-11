package Space;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class InvadersApplication extends JFrame implements Runnable,KeyListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6761438081531589796L;
	private static String workingDirectory;
	public static final Dimension WindowSize = new Dimension(800,600);
	private static final int NUMALIENS = 20;
	//private Alien[] AliensArray  = new Alien[NUMALIENS];
	private ArrayList<Alien> AliensArray  = new ArrayList<Alien>();

	private Spaceship PlayerShip;
	private BufferStrategy strategy; 
	private boolean collision = false;
	private boolean paint =false;
	private ArrayList<PlayerBullet> BulletList = new ArrayList<PlayerBullet>();
	private Image bulletImage;
	private Image alienImage;
	private Image alien2Image;
	private ImageIcon icon;
	private ImageIcon icon2;
	private boolean gameOver = false;
	private int score;
	private int highScore;
	
	
	public  InvadersApplication(){
		
		this.setTitle("Space Invaders");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Display the window, centred on the screen
		Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int x = screensize.width/2 - WindowSize.width/2;
		int y = screensize.height/2 - WindowSize.height/2;
		setBounds(x, y, WindowSize.width, WindowSize.height);
		setVisible(true);
		
		
		icon = new ImageIcon(workingDirectory + "\\alien_ship_1.png");
		alienImage = icon.getImage();
		icon2 = new ImageIcon(workingDirectory + "\\alien_ship_2.png");
		alien2Image = icon2.getImage();
		for(int i = 0; i < NUMALIENS; i++)
	    {
			AliensArray.add(new Alien(alienImage,alien2Image,50));
			AliensArray.get(i).setPosition(50*(i%5),60+50*((int)Math.floor(i/5)));
			
	    }
		
		
		ImageIcon playerIcon = new ImageIcon(workingDirectory + "\\player_ship.png");
		Image playerImage = playerIcon.getImage();
		ImageIcon bulleticon = new ImageIcon(workingDirectory + "\\bullet.png");
		bulletImage = bulleticon.getImage();
		PlayerShip = new Spaceship(playerImage, 50);
		PlayerShip.setPosition(300,550);
		addKeyListener(this);
		Thread t = new Thread(this);
		t.start();
		createBufferStrategy(2);
        
		strategy = getBufferStrategy();
		paint = true;
	}
	
	public void run(){
		while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) { 
            	e.printStackTrace();
            }
            
            PlayerShip.move();
            
            for(int i=0; i< AliensArray.size(); i++){
            
              	 for(PlayerBullet bullets:BulletList){
              		Alien alien = AliensArray.get(i);
                   	if(((bullets.x<=alien.x+25&&bullets.x>alien.x)|| (bullets.x>=alien.x-25&&bullets.x<alien.x))&&((bullets.y<=alien.y+50&&bullets.y>alien.y)||(bullets.y>=alien.y-50&&bullets.y<alien.y))){
                   		score+= 20; 
                   		AliensArray.remove(alien);
                   		i++;
                   		BulletList.remove(bullets);
                   		break;
                   		
                   	}
           		}
              }
              for(Alien alien:AliensArray){
              	if( alien.move()){
              		collision = true;
              	}
       		
              }
              
              for(int i=0; i< AliensArray.size(); i++){
                		Alien alien = AliensArray.get(i);
                		if(((PlayerShip.x<=alien.x+25&&PlayerShip.x>alien.x)|| (PlayerShip.x>=alien.x-25&&PlayerShip.x<alien.x))&&((PlayerShip.y<=alien.y+50&&PlayerShip.y>alien.y)||(PlayerShip.y>=alien.y-50&&PlayerShip.y<alien.y))){
                			gameOver = true;
                			
                			break;
                		}
              }
          		
              
              
            this.repaint();
            
		}
		
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_ENTER && gameOver==true){
			

			startNewGame();
			
		
		}
		 if(e.getKeyCode()== KeyEvent.VK_RIGHT){
	            PlayerShip.setXSpeed(1);
		 }
	     if(e.getKeyCode()== KeyEvent.VK_LEFT){
	        	PlayerShip.setXSpeed(-1);
	     }
	    if(e.getKeyCode()== KeyEvent.VK_SPACE){
	        	shootBullet();
	     }
		 
	}
	public void keyReleased(KeyEvent e) {
		PlayerShip.setXSpeed(0);
		
	}
	public void keyTyped(KeyEvent e) {
		 
		 
		 
	       
	}
	public void shootBullet(){
		if(BulletList.size()==0){
			PlayerBullet bullet = new PlayerBullet(bulletImage,10);
			bullet.setPosition((int) PlayerShip.x+PlayerShip.winWidth/2, 550);
			BulletList.add(bullet);
			
		}else
		
		if(BulletList.get(BulletList.size() - 1).y <520){
		PlayerBullet bullet = new PlayerBullet(bulletImage,10);
		bullet.setPosition((int) PlayerShip.x+PlayerShip.winWidth/2, 550);
		BulletList.add(bullet);
		
		}
		
	}
	
	public void paint(Graphics g){
		if(paint == true){
		if(gameOver == false){
		
		
		g = strategy.getDrawGraphics();
		Font font = new Font("Verdana", Font.BOLD, 40);
	    
		g.setColor(Color.black);
        g.fillRect(0, 0, WindowSize.width, WindowSize.height);

        g.setColor (Color.white);
	    g.setFont(font);
	    g.drawString("score: " + (score), 100,60);
	    g.drawString("high score: " + (score), 400,60);
	    
       
         for(Alien alien:AliensArray){
        
        if(collision){
        	alien.reverseDirection();
        }
        	alien.paint(g);
		}
        
        for(PlayerBullet bullets:BulletList){
        	if(bullets.move() == true){
				BulletList.remove(bullets);
			}else{
        	bullets.paint(g);
			}
		}
        
		
		
		collision = false;
		PlayerShip.paint(g);
		
		if(AliensArray.size() == 0){
			startNewGame();
		}
		g.dispose();
		strategy.show();
		
		}else{
			
			
			g = strategy.getDrawGraphics();
			g.setColor(Color.black);
	        g.fillRect(0, 0, WindowSize.width, WindowSize.height);
	        
	       
	        Font font = new Font("Verdana", Font.BOLD, 50);
	        g.setColor (Color.white);
	        g.setFont(font);
	        g.drawString("game over", 200,200);
	        g.drawString("press enter to reset", 200,400);
	        g.dispose();
			strategy.show();
		}
		}
		
	}
	public void startNewWave(){
		
        	
        	for(int i = 0; i < NUMALIENS; i++)
		    {
				AliensArray.add(new Alien(alienImage,alien2Image,50));
				AliensArray.get(i).setPosition(50*(i%5),60+50*((int)Math.floor(i/5)));
				
		    }
        
        for(int i = 0; i < NUMALIENS; i++)
	    {
			
			AliensArray.get(i).setXSpeed(2);
			
	    } 
        
	
		
	}
	public void startNewGame(){
		while(0< AliensArray.size()){

    		AliensArray.remove(AliensArray.size()-1);
		}
		
		
		for(int i = 0; i < NUMALIENS; i++)
	    {
			AliensArray.add(new Alien(alienImage,alien2Image,50));
			AliensArray.get(i).setPosition(50*(i%5),60+50*((int)Math.floor(i/5)));
			
	    }
		score = 0;
        gameOver = false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		workingDirectory = System.getProperty("user.dir");
		System.out.println("Working Directory = " + workingDirectory);
		InvadersApplication w = new InvadersApplication();
		
	}
	

}