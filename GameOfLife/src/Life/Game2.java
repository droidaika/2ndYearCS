package Life;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;



public class Game2 extends JFrame implements MouseListener, MouseMotionListener, Runnable{


	private static String workingDirectory;
	public static final Dimension WindowSize = new Dimension(800,800);
	private boolean[][][] truth = new boolean[40][40][2];
	private boolean paint = false;
	private boolean playing = false;
	private BufferStrategy strategy; 


	
	public  Game2(){
		
		this.setTitle("Game Of Life");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Display the window, centred on the screen
		Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int x = screensize.width/2 - WindowSize.width/2;
		int y = screensize.height/2 - WindowSize.height/2;
		setBounds(x, y, WindowSize.width, WindowSize.height);
		setVisible(true);
		
		for(int i = 0; i<40; i++){
			for(int j = 0; j<40; j++){
				truth[i][j][0] = false;
				truth[i][j][1] = false;
			}
		}
		addMouseMotionListener( this);
		addMouseListener(this);
		
		Thread t = new Thread(this);
		t.start();
		createBufferStrategy(2);
        
		strategy = getBufferStrategy();
		paint = true;
	}
	
	public void run(){
		while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) { 
            	e.printStackTrace();
            }
            
          
            for (int x=0;x<40;x++) {
            	for (int y=0;y<40;y++) {
            		truth[x][y][0] =  truth[x][y][1];
            	}
            }
            this.repaint();
            
            if(playing){
            	
            for (int x=0;x<40;x++) {
            	for (int y=0;y<40;y++) {
            		int neighbours = 0;
            		
            		for (int xx=-1;xx<=1;xx++) {
            				for (int yy=-1;yy<=1;yy++) {
            					if(x+xx>0 &&x+xx<40 &&y+yy>0 &&y+yy<40 ){
            						if (xx!=0 || yy!=0) {
            							if(truth[x+xx][y+yy][0] == true){
            								neighbours++;

            							}
            					
            						}
            					}
            				}
            		}

            		if(truth[x][y][0] == true){
            		if(neighbours < 2 || neighbours > 3){
            			truth[x][y][1] = false;
            		}else{
            		
                	truth[x][y][1] = true;
            		}
            		}else{
            			if(neighbours == 3){
            				truth[x][y][1] = true;
            			}
            		}
            	}
            }
            
            
            }
            
		}
		
	}
	
	
	
	public void paint(Graphics g){
		
		if(paint){
			g = strategy.getDrawGraphics();
			
			g.setColor(Color.black);
			g.fillRect(0, 0, WindowSize.width, WindowSize.height);
			
			g.setColor(Color.green);
			g.fillRect(20, 40, 40, 20);
			g.fillRect(80, 40, 70, 20);
			g.fillRect(200, 40, 40, 20);
			g.fillRect(260, 40, 40, 20);
			g.setFont(new Font("Serif", Font.PLAIN, 20));
			g.setColor(Color.black);
			if(playing){
				g.drawString("Stop", 20, 55);
			}else{
				g.drawString("Start", 20, 55);
			}
			g.drawString("Random", 80, 55);
			
			g.drawString("Load", 200, 55);
			g.drawString("Save", 260, 55);
			
	        for(int i = 0; i<40; i++){
				for(int j = 0; j<40; j++){
					if(truth[i][j][0] == true){
						g.setColor(Color.white);
						g.fillRect(i*20, j*20, 20, 20);
					}
				}
			}
	        
	        g.dispose();
			strategy.show();
		
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
			
		truth[(int) Math.floor(e.getX()/20)][(int) Math.floor(e.getY()/20)][1] ^= true;
		
		if(e.getX() > 20 && e.getX() < 60 && e.getY() > 40 && e.getY() <60){
			playing ^= true;
		}
		if(e.getX() > 80 && e.getX() < 150 && e.getY() > 40 && e.getY() <60){
			
			for(int i = 0; i< 160; i++){
				
				int j = (int) (Math.random()*40);
				int k = (int) (Math.random()*40);
						
				truth[j][k][1] ^= true;
						
			}
		}
		
		if(e.getX() > 200 && e.getX() < 240 && e.getY() > 40 && e.getY() <60){
			System.out.println("load");
			String line="";
			String filename = "C:\\Users\\Kevin\\Desktop\\lifegame.txt";
			try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			do {
			try {
			line = reader.readLine();
			// do something with String here!
			for (int x = 0; x < truth.length; x++) {
				for (int y = 0; y < truth[0].length; y++) {
					 	
						String[] tokens = line.split(" ");
						
						truth[x][y][1] = Boolean.parseBoolean(tokens[(x*40)+y]);
						
				}
	        }
			break;
			} catch (IOException e1) { }
			}
			while (line != null);
			reader.close();
			} catch (IOException e1) { }
				
				
		}
		if(e.getX() > 260 && e.getX() < 300 && e.getY() > 40 && e.getY() <60){
			System.out.println("save");
			
			String line="";
			String filename = "C:\\Users\\Kevin\\Desktop\\lifegame.txt";
			try {
			BufferedWriter reader = new BufferedWriter(new FileWriter(filename));
			do {
			try {
			

			for (int x = 0; x < truth.length; x++) {
				for (int y = 0; y < truth[0].length; y++) {
					
						line += truth[x][y][0] + " ";
						
					
				}
	        }
			reader.write(line);
			
			break;
			} catch (IOException e1) {System.out.println("first error"); }
			}
			
			while (line != "");
			reader.close();
			} catch (IOException e1) {System.out.println("second error"); }
			
			
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseMoved(MouseEvent e){


	}
	public void mouseDragged(MouseEvent e){

		truth[(int) Math.floor(e.getX()/20)][(int) Math.floor(e.getY()/20)][1] ^= true;

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		workingDirectory = System.getProperty("user.dir");
		System.out.println("Working Directory = " + workingDirectory);
		Game2 w = new Game2();
		
	}
}