package animaciones;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel {
        
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(RED);
        g.fillRect(10, 100, 65, 50);
        g.fillOval(16, 150, 12, 12);
        g.fillOval(54, 150, 12, 12);
        g.fillRect(60, 110, 35, 10);
        g.setColor(BLACK);
        g.fillRect(60, 110, 15, 10);
        g.drawString("01", 10, 110);
        
        g.setColor(BLUE);
        g.fillRect(10+100, 100, 65, 50);
        g.fillOval(16+100, 150, 12, 12);
        g.fillOval(54+100, 150, 12, 12);
        g.fillRect(60+100, 110, 35, 10);
        g.setColor(ORANGE);
        g.fillRect(60+100, 110, 15, 10);
        g.drawString("02", 10+100, 110);
        
        g.setColor(DARK_GRAY);
        g.drawOval(154, 10, 20, 20);
        g.drawOval(154, 40, 20, 20);
        g.drawRect(100, 10, 10, 25);
        g.drawRect(75 , 10, 10, 25);
        g.drawRect(200, 130, 32, 32);
        g.drawString("Puntos: XXX", 300-50, 1);        
    }
    
}
