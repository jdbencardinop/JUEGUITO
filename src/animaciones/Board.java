package animaciones;

import static java.awt.Color.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener, MouseListener {

    private final int INITIAL_X = 10;
    private final int INITIAL_Y = 10;
    private final int DELAY = 10;

    private Timer timer, t2;

    private int x;
    private int y;
    private boolean delante;
    
    private Rectangle objeto;
    private Image fondo;
    private Image gato;
    private Image moneda;
    private Image hombre;
    
    private int secuencia;
    
    public Board() {
        this.initBoard();
    }

    private void initBoard() {
        this.setBackground(WHITE);

        this.x = this.INITIAL_X;
        this.y = this.INITIAL_Y;
        this.delante = true;
        
        this.addMouseListener(this);
        
        this.addKeyListener(new Adaptador());
        this.setFocusable(true);
        
        this.objeto = new Rectangle(600, 130, 32, 32);
        this.fondo = this.loadImage("fondo.png");
        this.gato = this.loadImage("cats.gif");
        this.moneda = this.loadImage("FullCoins.png");
        this.hombre = this.loadImage("free_radical_game_sprites.png");
        this.secuencia = 0;
        
        timer = new Timer(DELAY, this);
        this.t2 = new Timer(100, (ActionEvent e) -> {
            if(delante){                
                if (this.secuencia == 4) {
                    this.secuencia = 0;
                } else {
                    this.secuencia++;
                }
            } else {                
                if (this.secuencia == 0) {
                    this.secuencia = 4;
                } else {
                    this.secuencia--;
                }
            }
        });
        timer.start();
        this.t2.start();        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(this.fondo, 0,0, null);
        
        //g.drawImage(gato, x, y+350, x+132, y+80+350, secuencia*132, 0, 132*(secuencia + 1), 80, this);
        
        int i = 0;
        
        switch(secuencia){
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            default:
                break;                
        }
        
        g.drawImage(hombre, x, y+100, x+64, y + 100 + 64, 32, (i + 4)*32, 64, (i + 5)*32, this);
//        g.setColor(RED);
//        g.fillRect(10 + this.x - this.INITIAL_X, 100, 65, 50);
//        g.fillOval(16 + this.x - this.INITIAL_X, 150, 12, 12);
//        g.fillOval(54 + this.x - this.INITIAL_X, 150, 12, 12);
//        g.fillRect(60 + this.x - this.INITIAL_X, 110, 35, 10);
//        g.setColor(BLACK);
//        g.fillRect(60 + this.x - this.INITIAL_X, 110, 15, 10);
//        g.drawString("01", 10 + this.x - this.INITIAL_X, 110);

//        g.setColor(BLUE);
//        g.fillRect(10 + 100 + this.x - this.INITIAL_X, 100, 65, 50);
//        g.fillOval(16 + 100 + this.x - this.INITIAL_X, 150, 12, 12);
//        g.fillOval(54 + 100 + this.x - this.INITIAL_X, 150, 12, 12);
//        g.fillRect(60 + 100 + this.x - this.INITIAL_X, 110, 35, 10);
//        g.setColor(ORANGE);
//        g.fillRect(60 + 100 + this.x - this.INITIAL_X, 110, 15, 10);
//        g.drawString("02", 10 + 100 + this.x - this.INITIAL_X, 110);

//        g.setColor(DARK_GRAY);
//        g.drawOval(154, 10, 20, 20);
//        g.drawOval(154, 40, 20, 20);
//        g.drawRect(100, 10, 10, 25);
//        g.drawRect(75 , 10, 10, 25);
//        g.fillRect(600, 130, 32, 32);
//        g.setColor(BLACK);
//        g.drawLine(-1, 162, 1000, 162);
//        g.drawString("Puntos: XXX", 300-50, 1);        
    }
    
    public Rectangle getRecBounds() {
        return new Rectangle(this.x, this.INITIAL_Y, 85, 62);
    }
    
    public boolean checkCollisions() {
        return this.getRecBounds().contains(this.objeto);
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image imagen = ii.getImage();
        return imagen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
//        if (this.x == 800 - 200) {
//            this.delante = false;
//        }
//        if (this.x == 0) {
//            this.delante = true;
//        }
//        if (this.checkCollisions()) {
//            this.delante = !this.delante;
//        }
//        if (delante) {
//            this.x++;
//        } else {
//            this.x--;
//        }

        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp = e.getPoint();
        if (this.getRecBounds().contains(mp)) {
            this.timer.stop();
        } else {
            this.delante = !this.delante;
        }        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public int getAlto(){
        return this.fondo.getHeight(this);
    }
    
    public int getAncho(){
        return this.fondo.getWidth(this);
    }

    private class Adaptador extends KeyAdapter {

        public Adaptador() {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                x -= 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                x += 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                y -= 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                y += 5;
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e); //To change body of generated methods, choose Tools | Templates.
        }
        
        
    }
}
