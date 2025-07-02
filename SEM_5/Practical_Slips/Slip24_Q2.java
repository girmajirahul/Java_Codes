import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ConcentricCircle extends JPanel
{
    public Graphics g;
    public int PrevX,PrevY;
    public String drawtypes;
    public ConcentricCircle()
    {
        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent me)
            {
                selectpaint();
            }
        });
    }

    public void selectpaint()
    {
        g=getGraphics();
        Dimension d=getSize();
        int x=d.width/2;
        int y=d.height/2;
        int r1=(int) ((d.width < d.height)? 0.4*d.width :0.4 *d.height);
        g.setColor(Color.red);
        g.fillOval(x-r1,y-r1,2*r1,2*r1);
        int r2=(int) ((d.width < d.height)? 0.3*d.width :0.3*d.height);
        g.setColor(Color.blue);
        g.fillOval(x-r2,y-r2,2*r2,2*r2);
        int r3=(int) ((d.width < d.height)? 0.2*d.width :0.2*d.height);
        g.setColor(Color.yellow);
        g.fillOval(x-r3,y-r3,2*r3,2*r3);

    }
    public static void main(String[] args)
    {
        ConcentricCircle cc=new ConcentricCircle();
        JFrame newFrame =new JFrame();
        newFrame.getContentPane().add(new ConcentricCircle());
        newFrame.setVisible(true);
        newFrame.setBounds(100,100,300,400);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}