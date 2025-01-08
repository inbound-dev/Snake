/*
 */
package snake;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Color;
/**
 *
 * @author Jordan
 */
public class GamePanel extends Panel{
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.drawLine(20, 50, 120, 150);
    }
}
