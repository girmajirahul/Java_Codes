//UI for Blinking a text on screeen (Using Runnable Interface)
//Using 2 Threads
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends JFrame implements Runnable, ActionListener
{
    private JTextField t;
    private JButton b;
    private Thread t1,t2;

    public MyFrame1()
    {
        t=new JTextField(10);
        b=new JButton("START");

        setLayout(new FlowLayout());

        add(t);
        add(b);

        t1=new Thread(this);
        t2=new Thread(this);

        b.addActionListener(this);

        setSize(300,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            t1.start();
            //t1.join();
            t2.start();
        }
    }

    public void run()
    {
        for(;;)
        {
            if(Thread.currentThread()==t1)
            {
                t.setText("BLINK");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {}
            }
            else
            {
                t.setText("");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {}
            }
        }
    }
}

public class Blink
{
    public static void main(String[] args)
    {
        new MyFrame1();
    }
}