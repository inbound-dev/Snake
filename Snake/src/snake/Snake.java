package snake;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
/**
 *
 * @author Jordan H.
 */
public class Snake extends KeyAdapter{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        //DO NOT CHANGE WINDOW SIZE
        int windowSize = 600;
        
        int unitSize = 25;
        int gameUnits = windowSize/unitSize;
        int x[] = new int[unitSize];
        int y[] = new int[unitSize];
    
        
        System.out.println("Snake!");
        System.out.println("By: Jordan H");
        
        GameBoard board = new GameBoard();
        board.setVisible(true);
        
        board.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        board.addKeyListener(new InputListener());
        board.getContentPane().setBackground(Color.black);
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        board.setSize(windowSize, windowSize);
        
        // fill game board
        DrawBoard(gameUnits);
        
    }
    
    public static void DrawBoard(int gameUnits){
        
            for(int i = 0; i <= gameUnits; i++){
            
            }
        }
    
        public static void CreateApple(){
        
        }
    
}
