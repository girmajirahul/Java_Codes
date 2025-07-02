import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioButton implements ItemListener{
    JFrame f;
    JRadioButton r[] = new JRadioButton[5];
    ButtonGroup grp1,grp2;
    JLabel l1,l2;
    JTextField t1;
    JPanel p1,p2;

    RadioButton(){
        f=new JFrame("Radio Button Demo");
        f.setLayout(new GridLayout(5,1));
        p1=new JPanel();
        p2=new JPanel();
        r[0]=new JRadioButton("FY");
        r[1]=new JRadioButton("SY");
        r[2]=new JRadioButton("TY");
        r[3]=new JRadioButton("A");
        r[4]=new JRadioButton("B");
        grp1=new ButtonGroup();
        grp2=new ButtonGroup();
        for(int i=0;i<3;i++)
        {
            p1.add(r[i]);
            grp1.add(r[i]);
            r[i].addItemListener(this);
        }
        r[3].addItemListener(this);
        r[4].addItemListener(this);
        p2.add(r[3]);
        grp2.add(r[3]);
        p2.add(r[4]);
        grp2.add(r[4]);
        t1=new JTextField(20);
        l1=new JLabel("Select your class",JLabel.CENTER);
        l2=new JLabel("Select your Division",JLabel.CENTER);
        f.add(l1);
        f.add(p1);
        f.add(l2);
        f.add(p2);
        f.add(t1);
       // f.pack(); //set frame size to minimum size required to hold components
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,300,400);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        String message="You are in class :";
        for(int i=0;i<5;i++)
            if(r[i].isSelected())
                message+=r[i].getText() + " ";
            t1.setText(message);
    }
    public static void main(String[] args)
    {
        new RadioButton();
    }
}