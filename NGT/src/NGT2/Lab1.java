package NGT2;


import java.awt.*;
import javax.swing.*;
public class Lab1 extends JFrame {
	private static final Dimension WindowSize = new Dimension(600,600);
	
	Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	
	public Lab1() {
		//Create and set up the window.
		this.setTitle("Colour grid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Display the window, centred on the screen
		
		int x = screensize.width/2 - WindowSize.width/2;
		int y = screensize.height/2 - WindowSize.height/2;
		setBounds(x, y, WindowSize.width, WindowSize.height);
		setVisible(true);
	}
	public void paint ( Graphics g) {
		for (int row = 8; row < screensize.width+8; row=row+20) {
            for (int col = 30; col < screensize.height; col=col+20) {
            	Color c = new Color((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256));
                g.setColor(c);
                g.fillRect(row, col, 20, 20);
                
                                
            }
        }
	}


	public static void main(String [ ] args) {
		Lab1 w = new Lab1();
	}

}
