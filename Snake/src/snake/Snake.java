package snake;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Jordan H.
 */
public class Snake extends KeyAdapter{
    //DO NOT CHANGE WINDOW SIZE
        static int windowSize = 600;
        
        static int unitSize = 25;
        static int gameUnits = windowSize/unitSize;
        int x[] = new int[gameUnits];
        int y[] = new int[gameUnits];

        static boolean running = true;
        
        static GamePanel gamePanel = new GamePanel();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("Snake!");
        System.out.println("By: Jordan H");
        
        GameBoard board = new GameBoard();
        board.setVisible(true);
        
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.addKeyListener(new InputListener());
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        board.setSize(windowSize, windowSize);
        
        
        //pre game loop steps
        //DrawBoard();
        //CreateApple();
        
        //assigns the pannel class created above to the game board
        board.setContentPane(gamePanel);
        gamePanel.setBackground(Color.black);

        
        //main game loop 
        while(running == true){
            
        }
    }
    
    
    //draws the game board
    public void DrawBoard(Graphics g){
        for(int i = 0; i <= gameUnits; i++){
            g.drawLine(i*gameUnits, 0, i*unitSize, windowSize);
        }
    }
    
    public static void CreateApple(){
        
    }
    
}
