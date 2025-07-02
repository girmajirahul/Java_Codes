import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame1 extends JFrame implements Runnable,ActionListener
{
    private JTextField t1;
    private JButton b1;
    private Thread th1;
    public MyFrame1()
    {
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        t1=new JTextField(20);
        b1=new JButton("start");
        add(t1);
        add(b1);
        th1=new Thread(this);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            th1.start();
        }
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            t1.setText(i+"");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ae)
            {

            }
        }
    }

    public static void main(String[] args)
    {
        new MyFrame1();
    }
}