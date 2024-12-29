package Classes;

import java.awt.event.*;
/**
 *
 * @author Jordan H.
 * 
 * This Class is responsible for taking in user input
 */
public class InputListener extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e){
            int currKey = e.getKeyCode();
            
            //close the game when the user hits escape
            if(currKey == 27){
                System.out.println("Closing The Game!");
                System.exit(0);
            }
            
            System.out.println("Holding: " + currKey);
        } 
    }