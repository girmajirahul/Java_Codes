import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class TableDisplay extends JFrame
{
    private JTable table;

    public TableDisplay()
    {
        setTitle("Display Data");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table =new JTable();
        JScrollPane scrollPane=new JScrollPane(table);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        try{
            Connection oConnect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
            PreparedStatement pstmt=oConnect.prepareStatement("Select * from emp;");
            ResultSet rs= pstmt.executeQuery();
            ResultSetMetaData rdb=rs.getMetaData();
            DefaultTableModel tableModel=new DefaultTableModel();

            int colcnt=rdb.getColumnCount();
            for(int i=1;i<=colcnt;i++)
            {
                tableModel.addColumn(rdb.getColumnName(i));
            }

            while(rs.next())
            {
                Object[] rows=new Object[colcnt];
                for(int i=1;i<=colcnt;i++)
                {
                    rows[i-1]=rs.getObject(i);
                }
                tableModel.addRow(rows);
            }
            table.setModel(tableModel);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        setVisible(true);
    }
}

public class Slip27_q1 {
  public static void main(String[] args){
        new TableDisplay();
  }
}
