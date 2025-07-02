import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class slip17_Q2 extends JFrame{

    JTextField t1,t2,t3;
    public slip17_Q2()
    {
        setLayout(new GridLayout(4,2));

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        add(new JLabel("first string"));
        add(t1);
        add(new JLabel("Second String"));
        add(t2);
        add(new JLabel("Result"));
        add(t3);
        
        JButton cmd1=new JButton("Concatenation");
        JButton cmd2=new JButton("Reverse");
        add(cmd1);
        add(cmd2);

        cmd1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {   
                String result=t1.getText() + t2.getText();
               t3.setText(result);
            }
        });
        cmd2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {   
                String original=t1.getText() ;
                StringBuilder result=new StringBuilder(original).reverse();
               t3.setText(result.toString());
            }
        });
        
        setVisible(true);
        setTitle("");
       setBounds(100,100,500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   

    public static void main(String[] args)
    {
        new slip17_Q2();
    }
}
