//Multithreading, GUI program
//Display 1 to 100 numbers continously
//Use Runnable Interface

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements Runnable,ActionListener
{
    private JTextField t;
    private JButton b;
    private Thread th;

    public MyFrame()
    {
        t=new JTextField(10);
        b=new JButton("START");

        setLayout(new FlowLayout());

        add(t);
        add(b);

        th=new Thread(this);

        b.addActionListener(this);

        setSize(300,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            th.start();
        }
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            t.setText(i+" ");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {}
        }
    }
}

public class Numbers
{
    public static void main(String[] args)
    {
        new MyFrame();
    }
}