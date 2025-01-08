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
   @Override public void paint(Graphics g){
        System.out.print("hello?");
        super.paint(g);
        g.setColor(Color.blue);
        g.drawLine(20, 50, 120, 150);
    }
}
