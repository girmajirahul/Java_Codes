import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;

class MoveText extends JFrame implements Runnable
{
    private String str;
    private Thread th1;
    private static int y;
    private int w,h;

    public MoveText()
    {
        str=new String("Welcome To Java");
        setVisible(true);
        setSize(500,500);
        w=getWidth();
        h=getHeight();
        y=0;
        th1=new Thread(this);
        th1.start();
    }

    public void run()
    {
        while(true){
            y++;
            repaint();
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0,0,w,h);
        g.setColor(Color.black);
        g.drawString(str,y,200);
    }

    public void update(Graphics g){
        paint(g);
    }

    public static void main(String[] args){
        new MoveText();
    }
}
