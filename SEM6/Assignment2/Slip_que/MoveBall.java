//UI to move a ball on screen
//add button to start movement
//move ball from top to bottom

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends JFrame implements Runnable,ActionListener
{
    private JButton b;
    private Thread t;
    //private String str;
    private static int y;
    private int w,h;

    public MyFrame3()
    {
        setLayout(new FlowLayout());

        b=new JButton("MOVE");
        add(b);

        //str=new String("O");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w=getWidth();
        h=getHeight();
        y=0;

        t=new Thread(this);

        b.addActionListener(this);
        //t.start();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            t.start();
        }
    }

    public void run()
    {
        for(;;)
        {
            y++;
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
        g.setColor(Color.red);
        //g.drawString(str,100,y);

        int diameter=30;
        g.fillOval(100,y,diameter,diameter);
    }

    public void update(Graphics g)
    {
        paint(g);
    }
}

public class MoveBall
{
    public static void main(String[] args)
    {
        new MyFrame3();
    }
}
