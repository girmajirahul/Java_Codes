import java.sql.*;

class DatabaseInfo
{
    private Connection oConnect;
    private Statement stmt;
    private DatabaseMetaData odb;
    private ResultSetMetaData rdb;
   // private ResultSet rs;

    public void getConnection()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            oConnect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public void getDatabaseMetaData()
    {
        try
        {
            odb=oConnect.getMetaData();
            System.out.println("Product name:"+odb.getDatabaseProductName());
            System.out.println("Product version :"+odb.getDatabaseProductVersion());
            System.out.println("username :"+odb.getUserName());
            
            ResultSet rs=odb.getTables(null,null,null,new String[]{"TABLE"});
            System.out.println("LIST OF TABLES:");
            while(rs.next())
            {
                System.out.print(rs.getString("TABLE_NAME")+"\n");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}

public class SetA2
{
    public static void main(String[] args)
    {
        DatabaseInfo info=new DatabaseInfo();
        info.getConnection();
        info.getDatabaseMetaData();
    }
}