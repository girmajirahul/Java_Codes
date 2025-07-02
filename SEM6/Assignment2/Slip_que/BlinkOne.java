//UI for Blinking a text on screeen (Using Runnable Interface)
//Using 1 Thread

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends JFrame implements Runnable, ActionListener
{
    private JTextField t;
    private JButton b;
    private Thread t1;

    public MyFrame2()
    {
        t=new JTextField(10);
        b=new JButton("START");

        setLayout(new FlowLayout());

        add(t);
        add(b);

        t1=new Thread(this);
        //t2=new Thread(this);

        b.addActionListener(this);

        setSize(300,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            t1.start();
        }
    }

    public void run()
    {
        for(;;)
        {
            try
            {
                t.setText("BLINK");
                Thread.sleep(100);
                t.setText("");
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {}
        }
    }
}

public class BlinkOne
{
    public static void main(String[] args)
    {
        new MyFrame2();
    }
}