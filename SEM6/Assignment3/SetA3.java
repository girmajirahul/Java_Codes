import java.sql.*;

class ResultSetMetaDataInfo
{
    private Connection oConnect;
    private ResultSetMetaData rdb;
    private Statement stmt;
    private  ResultSet rs;

    public void getConnection()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            oConnect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");

        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    public void getResultSetMetaData()
    {
        String query="Select * from Mobile;";
        try
        {
            stmt=oConnect.createStatement();
            rs=stmt.executeQuery(query);
            rdb=rs.getMetaData();
            int colcnt=rdb.getColumnCount();
            System.out.println("Column Count="+colcnt);

            for(int i=1;i<=colcnt;i++)
            {
                System.out.println("column name:"+rdb.getColumnName(i));
                System.out.println("Column type:"+rdb.getColumnType(i));
                System.out.println("Column Size :"+rdb.getColumnDisplaySize(i));
            }   
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
}

public class SetA3
{
    public static void main(String[] args)
    {
        ResultSetMetaDataInfo info=new ResultSetMetaDataInfo();
        info.getConnection();
        info.getResultSetMetaData();
    }
}