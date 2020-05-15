import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Scanner;

public class DrawCircleandRectangle extends JFrame {
    
    int sizeRecA = 0;
    int sizeRecB = 0;
    int sizeRecC = 0;
    int sizeRecD = 0;
    int sizeCircleE = 0;
    int sizeCircleF = 0;
    int sizeCircleG = 0;
    int sizeCircleH = 0;
    
    public DrawCircleandRectangle(int A, int B, int C, int D, int E, int F, int G, int H){
        super ("DrawingRect");
        setSize (1000,500);
        setVisible (true);
        
       sizeRecA = A;
       sizeRecB = B;
       sizeRecC = C;
       sizeRecD = D;
       sizeCircleE = E;
       sizeCircleF = F;
       sizeCircleG = G;
       sizeCircleH = H;
    }

    DrawCircleandRectangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g){
    super.paint(g);
        g.setColor(Color.RED);
        g.drawRect (sizeRecA,sizeRecB,sizeRecC,sizeRecD);
        g.setColor(Color.YELLOW);
//        g.fillRect(20, 100, 220, 50); 
        g.setColor(Color.BLACK);
        g.drawOval(sizeCircleE,sizeCircleF,sizeCircleG,sizeCircleH);
        g.setColor(Color.blue);
        //g.fillOval(sizeRecA,sizeRecB,sizeRecC,sizeRecD);
    } 
public static void main (String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Example using variable in java \n");
    System.out.print("Enter radius x of side : ");
    int sizeA = scanner.nextInt();
    System.out.print("Enter radius y of side : ");
    int sizeB = scanner.nextInt();
    System.out.print("Enter length of side : ");
    int sizeC = scanner.nextInt();
    System.out.print("Enter width of side : ");
    int sizeD = scanner.nextInt();
    System.out.print("Enter radius x of side : ");
    int sizeE = scanner.nextInt();
    System.out.print("Enter radius y of side : ");
    int sizeF = scanner.nextInt();
    System.out.print("Enter jari-jari of side : ");
    int sizeG = scanner.nextInt();
    System.out.print("Enter jari-jari of side : ");
    int sizeH = scanner.nextInt();

        Lingkaran2 frame = new Lingkaran2(sizeA, sizeB, sizeC, sizeD, sizeE, sizeF, sizeG, sizeH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
