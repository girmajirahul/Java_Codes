import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class EmployeeDetailsForm extends JFrame implements ActionListener
{
    private JTextField eno,ename,designation,salary;
    private JButton b1;
    private Connection con;
    private PreparedStatement pstmt;

    public EmployeeDetailsForm()
    {
        setVisible(true);
        setTitle("Employee Details Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setBounds(100,100,300,400);
        setSize(400,200);
        eno=new JTextField(10);
        ename=new JTextField(10);
        designation=new JTextField(10);
        salary=new JTextField(10);
        
        b1=new JButton("Save");
        b1.addActionListener(this);
        JPanel panel=new JPanel(new GridLayout(5,2));
        panel.add(new JLabel("Eno"));
        panel.add(eno);
        panel.add(new JLabel("Ename"));
        panel.add(ename);
        panel.add(new JLabel("Desiganatin"));
        panel.add(designation);
        panel.add(new JLabel("Salary"));
        panel.add(salary);
        panel.add(b1);
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
                pstmt=con.prepareStatement("INSERT INTO employee values(?,?,?,?)");
                pstmt.setInt(1,Integer.parseInt(eno.getText()));
                pstmt.setString(2,ename.getText());
                pstmt.setString(3,designation.getText());
                pstmt.setFloat(4,Float.parseFloat(salary.getText()));
                int res=pstmt.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(this,"Employee Details saved Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Failes to saved Employee Details.");

                }

            }
            catch(ClassNotFoundException cse)
            {
                System.out.print(cse);
            }
            catch(SQLException se)
            {
                System.out.println(se);
            }
        }
    }

    public static void main(String[] args)
    {
        new EmployeeDetailsForm();
    }
}