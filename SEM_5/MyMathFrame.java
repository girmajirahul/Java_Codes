import java.awt.*;
import javax.swing.*;
public class MyMathFrame extends JFrame{
    //step 1 create references
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;

    MyMathFrame()
    {
        //step 2 create objects

        l1=new JLabel("Enter the first number:");
        t1=new JTextField(20);
        l2=new JLabel("Enter the second number:");
        t2=new JTextField(20);
        b1=new JButton("ADD");
        b2=new JButton("SUB");
        b3=new JButton("DIV");
        b4=new JButton("MULT");
       
        //step 3: add components inside Frame

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        JTextArea t=new JTextArea(10,20);
        t.setText("Sampletxt");
        add(t);
        setLayout(new FlowLayout());
       // setLayout(new GridLayout(2,3,2,2));
        setTitle("Math frame");
        setBounds(100,100,300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

  public static void main(String[] args){
  
    new MyMathFrame();

  }
}