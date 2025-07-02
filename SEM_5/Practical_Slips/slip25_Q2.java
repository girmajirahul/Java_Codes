import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class userform{

    JFrame frame;
    JTextField nameField;
    JRadioButton FY,SY,TY;
    JCheckBox  music,dance,Sport;    
    JTextArea displayArea;
    public userform()
    {
        frame=new JFrame("User Information");

        nameField=new JTextField(20);
        frame.add(new JLabel("user name"));
        frame.add(nameField);

        FY=new JRadioButton("FY");
        SY=new JRadioButton("SY");
        TY=new JRadioButton("TY");
        ButtonGroup classGroup=new ButtonGroup();
        classGroup.add(FY);
        classGroup.add(SY);
        classGroup.add(TY);
        frame.add(new JLabel("Class:"));
        frame.add(FY);
        frame.add(SY);
        frame.add(TY);

        music=new JCheckBox("music");
        dance=new JCheckBox("Dance");
        Sport=new JCheckBox("Sports");
        frame.add(new JLabel("Hobbies"));
        frame.add(music);
        frame.add(dance);
        frame.add(Sport);

        JButton submit=new JButton("Submit");
         submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String userClass = FY.isSelected() ? "FY" : SY.isSelected() ? "SY" : "TY";
                String hobbies = (music.isSelected() ? "Music " : "") + (Sport.isSelected() ? "Sports " : "") + (dance.isSelected() ? "Dance" : "");
               

                String infoText = "Name: " + name + "\tClass: " + userClass + "\tHobbies: " + hobbies;
                displayArea.setText(infoText);
            }
        });

        displayArea=new JTextArea(5, 20);
        frame.add(submit);

        frame.add(displayArea);

        frame.setLayout(new FlowLayout());
        frame.setBounds(100,100,300,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String[] args)
    {
        new userform();
    }
}