import javax.swing.*;
import java.awt.*;

public class ThreadTextMove extends JFrame implements Runnable{
    private Thread th1;
    private String str;
    private static int x;
    private int w,h;
    
    public ThreadTextMove(){
        str=new String("Welcome to java");
        setVisible(true);
        setBounds(100,100,300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w=getWidth();
        h=getHeight();
        x=0;
        th1=new Thread(this);
        th1.start();
    }

    public void run(){
        for(;;)
        {
            x++;
            repaint();
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){

            }
        }
    }

    public void paint(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,w,h);
            g.setColor(Color.black);
            g.drawString(str,x,100);

    }

    public void update(Graphics g){
        paint(g);
    }
  public static void main(String[] args){
       ThreadTextMove t =new ThreadTextMove();
  }
}
