/*
 */
package snake;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Color;
import java.util.Random;
import static snake.Snake.boardUnitLength;
import static snake.Snake.unitSize;
import static snake.Snake.windowSize;
/**
 *
 * @author Jordan
 */
public class GamePanel extends Panel{
    private final Color panelColor = Color.BLACK;
    public Color currColor = Color.GRAY;
    
    //overrides the defualt paint method to paint desired objects on the screen
    @Override public void paint(Graphics g){
        super.setBackground(panelColor);
        super.paint(g);
        g.setColor(currColor);
        DrawBoard(g);
    }
     
    //draws the game board
    public void DrawBoard(Graphics g){
        for(int i = 0; i <= (windowSize/unitSize); i++){
            g.drawLine(i*unitSize, 0, i*unitSize, windowSize);
            g.drawLine(0, i*unitSize, windowSize, i*unitSize);
        }
    }
    
    public static void drawApple(Graphics g){
        Random randint = new Random();  
        int randX = randint.nextInt(boardUnitLength);
        int randY = randint.nextInt(boardUnitLength);

        System.out.println("Current Apple Coords: " + randX + ", " + randY);
        
    }
}
