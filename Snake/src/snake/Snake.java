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
public class Snake{
    //DO NOT CHANGE WINDOW SIZE
        public static int windowSize = 600;
        
        static int unitSize = 25;
        static int gameUnits = (windowSize * windowSize)/unitSize;
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
        
        //cerates a new instance of the gameboard
        GameBoard board = new GameBoard();
        
        //assigns the pannel class created above to the game board
        board.setContentPane(new GamePanel());
              
        board.setVisible(true);   
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.addKeyListener(new InputListener());
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        board.setSize(windowSize, windowSize);
        
        
        //pre game loop steps
        //DrawBoard();
        //CreateApple();

        
        //main game loop 
        while(running == true){
            
        }
    }
}
