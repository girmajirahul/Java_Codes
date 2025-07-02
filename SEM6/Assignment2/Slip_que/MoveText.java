//UI to move text on screen
//move text from left to right

import javax.swing.*;
import java.awt.*;

class MyFrame4 extends JFrame implements Runnable
{
    private Thread t;
    private String str;
    private static int x;
    private int w,h;

    public MyFrame4()
    {
        str=new String("MOVING");
        setVisible(true);
        setSize(500,500);

        w=getWidth();
        h=getHeight();

        x=0;

        t=new Thread(this);
        t.start();
    }

    public void run()
    {
        for(;;)
        {
            x++;
            repaint();
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException e)
            {}
        }
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0,0,w,h);
        g.setColor(Color.black);
        g.drawString(str,x,200);
    }

    public void update(Graphics g)
    {
        paint(g);
    }
}

public class MoveText
{
    public static void main(String[] args)
    {
        new MyFrame4();
    }
}