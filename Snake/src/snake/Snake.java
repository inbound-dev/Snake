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
        //DO NOT CHANGE WINDOW SIZE
        int windowSize = 599;
        
        System.out.println("Snake!");
        System.out.println("By: Jordan H");
        
        GameBoard board = new GameBoard();
        board.setVisible(true);
        
        board.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        board.addKeyListener(new InputListener());
        board.getContentPane().setBackground(Color.black);
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        
        // fill game board
        GameFunctions.DrawBoard();
    }
}
