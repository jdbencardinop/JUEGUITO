package animaciones;

import javax.swing.JFrame;

public class TestPaint extends JFrame {
    
    public Board board;

    public TestPaint() {
        this.board = new Board();        
    }
    
    public void iniTestPaint(){
        add(this.board);
        this.setTitle("Prueba de Pintura");
        this.setSize(this.board.getAncho(),this.board.getAlto());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        TestPaint cuadro = new TestPaint();
        cuadro.iniTestPaint();
    }
    
    
}

