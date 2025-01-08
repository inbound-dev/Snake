package snake;

import Classes.*;
import java.awt.Dimension;
import javax.swing.*;
/**
 *
 * @author Jordan H.
 */
public class Snake{
    //DO NOT CHANGE WINDOW SIZE 586
        public static int windowSize = 586;
        
        static int unitSize = 25;
        static int gameUnits = (windowSize * windowSize)/unitSize;
        int x[] = new int[gameUnits];
        int y[] = new int[gameUnits];

        static boolean running = true;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("Snake!");
        System.out.println("By: Jordan H");
        
        //cerates a new instance of the gameboard
        GameBoard board = new GameBoard();
        board.setSize(windowSize, windowSize);
        
        //assigns the pannel class created above to the game board
        board.setContentPane(new GamePanel());
              
        // all the misc jframe settings
        board.setVisible(true);   
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.addKeyListener(new InputListener());
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        
        //main game loop 
        while(running == true){
            
        }
    }
}
