/*
 */
package snake;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Color;
import static snake.Snake.gameUnits;
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
        for(int i = 0; i <= windowSize/unitSize; i++){
            g.drawLine(i*unitSize, 0, i*unitSize, windowSize);
            //System.out.println(i*unitSize);
        }
    }
}
