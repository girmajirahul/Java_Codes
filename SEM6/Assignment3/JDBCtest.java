import java.sql.*;
public class JDBCtest {
    private Connection oConnect;
    private Statement stmt;
    private ResultSet rs;

    public  JDBCtest()
    {

    }
    public void getConnection()
    {
        try{
            Class.forName("org.postgresql.Driver");
            oConnect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public void display()
    {
        String query="Select * from emp;";
        try{
            stmt=oConnect.createStatement();
            rs=stmt.executeQuery(query);
            System.out.println("ID\tName");
            while(rs.next())
            {
                int id=rs.getInt(1);
                String ename=rs.getString(2);
                
                System.out.println(id+"\t"+ename);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

  public static void main(String[] args){
        JDBCtest test=new JDBCtest();
        test.getConnection();
        test.display();
  }
}