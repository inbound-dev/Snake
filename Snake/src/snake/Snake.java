package snake;

import Classes.*;
import java.awt.Dimension;
import javax.swing.*;
import java.util.Random;
import java.awt.Graphics;
/**
 *
 * @author Jordan H.
 */
public class Snake{
    //DO NOT CHANGE WINDOW SIZE 586
        public static int windowSize = 586;
        static int unitSize = 25;
        public static int boardUnitLength = (windowSize/unitSize);
      
        static int gameUnits = boardUnitLength/unitSize;
        public static int x[] = new int[boardUnitLength];
        public static int y[] = new int[boardUnitLength];
        static Dimension size = new Dimension(windowSize,windowSize);

        static boolean running = true;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("Snake!");
        System.out.println("By: Jordan H");
        
        //cerates a new instance of the gameboard
        GameBoard board = new GameBoard();
        
        GamePanel gamePanel = new GamePanel();
        board.setPreferredSize(size);
        
        //assigns the pannel class created above to the game board
        board.setContentPane(gamePanel);
        
        board.pack();
              
        // all the misc jframe settings
        board.setVisible(true);   
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.addKeyListener(new InputListener());
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        
        
        //for trouble shooting apple
        for(int i = 0; i <= x.length - 1; i++){
            System.out.println(x[i]);
        }
        
        System.out.println("-------");
        
        for(int i = 0; i <= y.length - 1; i++){
            System.out.println(y[i]);
        }
        
        //main game loop 
        while(running == true){
            
        }
    }
}
