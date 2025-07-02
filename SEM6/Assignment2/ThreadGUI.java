import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Myframe  implements Runnable,ActionListener
{   
    private JButton b1;
    private JTextField t1;
    private Thread th1;
    JFrame frame;
    public Myframe()
    {
        frame=new JFrame();
        t1=new JTextField(10);
        b1=new JButton("Start");
        frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.add(t1);
        th1=new Thread(this);
        b1.addActionListener(this);
        frame.setVisible(true);
        frame.setBounds(100,100,300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

     public void actionPerformed(ActionEvent e){
               if(e.getSource()==b1){
                th1.start();
            }
        }
    public void run(){
        for(int i=1;i<=100;i++){
            t1.setText(i+"");
            try{
                Thread.sleep(600);
            }
            catch(InterruptedException e){

            }
        }
    }
}

public class ThreadGUI
{
    public static void main(String[] args)
    {
        new Myframe();
    }
}