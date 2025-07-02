import java.sql.*;
import java.io.*;

class DataMetaTest{
    public static void main(String[] args){
        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;
        DatabaseMetaData db;
        try{
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
            db=con.getMetaData();
            System.out.println("Product name:"+db.getDatabaseProductName());
            System.out.println("Product Version "+db.getDatabaseProductVersion());
            System.out.println("username "+db.getUserName());

            rs=db.getTables(null,null,null,new String[]{"TABLE"});
                System.out.println("List of tables");
            while(rs.next())
            {
                System.out.println(rs.getString("TABLE_NAME"));
            }       
        }
        catch(SQLException se){
            System.out.print(se);

        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}