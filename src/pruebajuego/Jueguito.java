package pruebajuego;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Jueguito extends JPanel implements ActionListener, KeyListener {

    private final int ANCHO = 256;
    private final int ALTO = this.ANCHO * 9 / 12;
    private final int TAMANO_COMPONENTE = 32;
    
    private Timer timer, timer2;

    private boolean ataque;
    
    private final Image[] fondos = new Image[2];
    private final Image nube;
    
    private final int IXHEROE = this.ALTO - (2 * this.TAMANO_COMPONENTE);
    private final int IYHEROE = 0;
    private final Image[] heroe = new Image[3];
    
    private final Image[] malo = new Image[2];
    private final Image moneda;
    private final Image piso;
    private final Image roca;

    public Jueguito() {
        
    }

    public void iniJuego() {

    }

    public void dibujarFondo() {
            
    }
    
    protected void PaintComponent(Graphics g) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
