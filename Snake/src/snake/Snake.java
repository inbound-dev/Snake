package snake;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jordan H.
 */
public class Snake extends KeyAdapter{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
        int windowSize = 800;
        
        System.out.println("Snake!");
        System.out.println("By: Jordan H");
        
        //Create the game window
        JFrame gameWindow = new JFrame("Snake!");
        
        gameWindow.setSize(windowSize, windowSize);
        gameWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameWindow.addKeyListener(new InputListener());
        gameWindow.getContentPane().setBackground(Color.black);
        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null);
        
        gameWindow.setVisible(true);
        
        //Fill the game window
        
    }
}
