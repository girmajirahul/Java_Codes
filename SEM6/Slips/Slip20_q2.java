import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BlinkImage extends JFrame implements Runnable{
    JLabel imageLable;
    Thread th1;
    boolean flag;

    public BlinkImage(){
        setSize(600,400);
        setTitle("Image Blinking");
        ImageIcon icon=new ImageIcon("flowers.jpg");
        imageLable=new JLabel(icon);
        add(imageLable,BorderLayout.CENTER);
        th1=new Thread(this);
        th1.start();
        setVisible(true);
    }   

    public void run(){
        while(true){
            try{
                flag=!flag;
                imageLable.setVisible(flag);
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        new BlinkImage();
    }
}
