import java.awt.*;
import javax.swing.*;

class slip18_Q1 extends JFrame{

    public slip18_Q1()
    {
        setLayout(new BorderLayout());
        JButton b1=new JButton("button 1");
        JButton b2=new JButton("button 2");
        JButton b3=new JButton("button 3");
        JButton b4=new JButton("button 4");
        JTextField t1=new JTextField(20);
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(t1,BorderLayout.CENTER);

       
        setTitle("Border Layout Example");
        setVisible(true);
        setBounds(100,100,400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new slip18_Q1();
    }
}
