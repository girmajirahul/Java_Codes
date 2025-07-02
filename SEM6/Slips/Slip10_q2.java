import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class StudentText extends JFrame implements ActionListener
{
    private JTextField RollNo,Sname,Sper;
    private JButton b1,clear;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public StudentText()
    {
        setVisible(true);
        setTitle("Display First Record");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        RollNo =new JTextField(20);
        Sname=new JTextField(20);
        Sper=new JTextField(20);
        b1=new JButton("Display");
        b1.addActionListener(this);
        clear=new JButton("Clear");
        JPanel panel=new JPanel(new GridLayout(4,2));
        panel.add(new JLabel("Roll number"));
        panel.add(RollNo);
        panel.add(new JLabel("Student name"));
        panel.add(Sname);
        panel.add(new JLabel("Student Percentage"));
        panel.add(Sper);
        panel.add(b1);
        panel.add(clear);
        add(panel);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            try
            {
                Class.forName("org.postgresql.Driver");
                con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT * FROM student LIMIT 1;");

                if(rs.next())
                {
                    RollNo.setText(rs.getString(1));
                    Sname.setText(rs.getString(2));
                    Sper.setText(rs.getString(3));
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Error:Record not Found. ");
                }
            }
            catch(ClassNotFoundException cse)
            {
                JOptionPane.showMessageDialog(this,"Error: "+cse.getMessage());

            }
            catch(SQLException se)
            {
                JOptionPane.showMessageDialog(this,"Error: "+se.getMessage());
                
            }
        }
    }
    public static void main(String[] args)
    {
        new StudentText();
    }
}