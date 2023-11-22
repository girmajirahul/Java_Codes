/*Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci) 
 subjects. Display the selected subject in a text field.*/
 

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 class combobox{
    JFrame frame;
    JTextArea displayArea;
     JComboBox <String>jcb;
    public combobox()
    {
        frame=new JFrame();

        jcb=new JComboBox(new String[]{"OS","JAVA","TCS","PHP","PYTHON"} );
        JButton submit=new JButton("Submit");
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String sub=(String) jcb.getSelectedItem();
                String infoText="Subject : "+sub;
                displayArea.setText(infoText);
            }

        });
        displayArea =new JTextArea(5,20);    
        frame.add(new JLabel("TY.Bsc(Computer Science SUbjects)"));
        frame.add(jcb);
        frame.add(submit);
        frame.add(displayArea);
        frame.setLayout(new FlowLayout()); 
        frame.setVisible(true);
        frame.setBounds(100,100,300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new combobox();
    }
 }