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
    private final int IYHEROE = this.TAMANO_COMPONENTE/2;
    private final Image[] heroe = new Image[3];
    private int xheroe;
    private int yheroe;
    
    private final int IXMALO = this.IXHEROE;
    private final int IYMALO = this.ANCHO - this.IYHEROE;
    private final Image[] malo = new Image[2];
    private int xmalo;
    private int ymalo;
    
    private final Image moneda;
    private final Image piso;
    private final Image roca;

    public Jueguito() {
        this.fondos[0] = this.loadImage("blue_background.png");
        this.fondos[1] = this.loadImage("red_background.png");
        this.nube = this.loadImage("clouds.png");
        this.heroe[0] = this.loadImage("walking.png");
        this.heroe[1] = this.loadImage("standing.png");
        this.heroe[2] = this.loadImage("jump.png");
        this.malo[0] = this.loadImage("enemy_run.png");
        this.malo[1] = this.loadImage("enemy_standing");
        this.moneda = this.loadImage("coin.png");
        this.piso = this.loadImage("ground_loop.png");
        this.roca = this.loadImage("stone.png");
        this.iniJuego();
    }

    public void iniJuego() {
        
    }
    
    private Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image imagen = ii.getImage();
        return imagen;
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

    public int getANCHO() {
        return ANCHO;
    }

    public int getALTO() {
        return ALTO;
    }

    public int getTAMANO_COMPONENTE() {
        return TAMANO_COMPONENTE;
    }

    public Timer getTimer() {
        return timer;
    }

    public Timer getTimer2() {
        return timer2;
    }

    public boolean isAtaque() {
        return ataque;
    }

    public Image[] getFondos() {
        return fondos;
    }

    public Image getNube() {
        return nube;
    }

    public int getIXHEROE() {
        return IXHEROE;
    }

    public int getIYHEROE() {
        return IYHEROE;
    }

    public Image[] getHeroe() {
        return heroe;
    }

    public int getXheroe() {
        return xheroe;
    }

    public int getYheroe() {
        return yheroe;
    }

    public int getIXMALO() {
        return IXMALO;
    }

    public int getIYMALO() {
        return IYMALO;
    }

    public Image[] getMalo() {
        return malo;
    }

    public int getXmalo() {
        return xmalo;
    }

    public int getYmalo() {
        return ymalo;
    }

    public Image getMoneda() {
        return moneda;
    }

    public Image getPiso() {
        return piso;
    }

    public Image getRoca() {
        return roca;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public void setTimer2(Timer timer2) {
        this.timer2 = timer2;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }

    public void setXheroe(int xheroe) {
        this.xheroe = xheroe;
    }

    public void setYheroe(int yheroe) {
        this.yheroe = yheroe;
    }

    public void setXmalo(int xmalo) {
        this.xmalo = xmalo;
    }

    public void setYmalo(int ymalo) {
        this.ymalo = ymalo;
    }

}
