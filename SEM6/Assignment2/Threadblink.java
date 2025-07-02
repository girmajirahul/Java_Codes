import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements Runnable,ActionListener
{
    Thread th1,th2;
    JTextField t1;
    JButton b1;

    public MyFrame(){
        setVisible(true);
        setBounds(100,100,300,400);
        t1=new JTextField(10);
        b1=new JButton("Start");
        th1=new Thread(this);
        th2=new Thread(this);
        setLayout(new FlowLayout());
        add(b1);
        add(t1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            th1.start();
            th2.start();
        }
    }

    public void run()
    {
        for(;;)
        {
            if(Thread.currentThread()==th1){
                t1.setText("Blink");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){

                }
            }
            else{
                t1.setText(" ");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){

                }
            }
        }
    }
}

public  class Threadblink {
  public static void main(String[] args){
        new MyFrame();
  }
}