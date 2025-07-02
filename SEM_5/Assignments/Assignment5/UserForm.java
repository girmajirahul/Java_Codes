import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class UserForm{
    JFrame frame;
    JTextField nameField;
    JTextArea displayArea;
    JRadioButton fyButton,syButton,tyButton;
    
    JCheckBox musicBox,sportsBox,travelBox;
    JCheckBox boldBox,italicBox ,underlineBox;
    JComboBox<String> fontBox,sizeBox;

    public UserForm()
    {
        frame=new JFrame("Your information");
        nameField=new JTextField(20);
        frame.add(new JLabel("Name"));
        frame.add(nameField);
        fyButton =new JRadioButton("FY");
        syButton=new JRadioButton("SY");
        tyButton=new JRadioButton("TY",true);
        ButtonGroup classGroup =new ButtonGroup();
        classGroup.add(fyButton);
        classGroup.add(syButton);
        classGroup.add(tyButton);
        frame.add(new JLabel("Class:"));
        frame.add(fyButton);
        frame.add(syButton);
        frame.add(tyButton);

        musicBox=new JCheckBox("Music");
        sportsBox=new JCheckBox("Sports");
        travelBox=new JCheckBox("Travel");
        frame.add(new JLabel("Hobbies"));
        frame.add(musicBox);
        frame.add(sportsBox);
        frame.add(travelBox);

        boldBox=new JCheckBox("Bold");
        italicBox=new JCheckBox("Italic");
        underlineBox=new JCheckBox("Under line");
        fontBox =new JComboBox<>(new String[]{"Arial","Times new Roman","Verdana"});
        sizeBox=new JComboBox<>(new String[]{"12","13","14","15","16","17"});
        frame.add(new JLabel("Style:"));
        frame.add(boldBox);
        frame.add(italicBox);
        frame.add(underlineBox);
        frame.add(fontBox);
        frame.add(sizeBox);

        JButton submit=new JButton("Submit");
         submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String userClass = fyButton.isSelected() ? "FY" : syButton.isSelected() ? "SY" : "TY";
                String hobbies = (musicBox.isSelected() ? "Music " : "") + (sportsBox.isSelected() ? "Sports " : "") + (travelBox.isSelected() ? "Travelling" : "");
                String style = (boldBox.isSelected() ? "Bold " : "") + (italicBox.isSelected() ? "Italic " : "") + (underlineBox.isSelected() ? "Underline" : "");
                String font = (String) fontBox.getSelectedItem();
                String size = (String) sizeBox.getSelectedItem();

                String infoText = "Name: " + name + "\nClass: " + userClass + "\nHobbies: " + hobbies + "\nFont: " + font + "\nSize: " + size + "\nStyle: " + style;
                displayArea.setText(infoText);
            }
        });

        displayArea = new JTextArea(5, 20);
        System.out.println();
        frame.add(submit);
        frame.add(displayArea);
        frame.setVisible(true);
 
        frame.setLayout(new FlowLayout());
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setBounds(100,100,300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new UserForm();
    }
}
