import java.io.*;
import java.sql.*;

class DonarMetaData{
    public static void main(String[] args){

         Connection con;
         PreparedStatement pstmt;
         ResultSet rs;
         Statement stmt;
         ResultSetMetaData rmd;

        try
        {
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select * from employee;");
            rmd=rs.getMetaData();
            int n=rmd.getColumnCount();
            System.out.println("Number of columns "+n);
            for(int i=1;i<=n;i++){
                System.out.println("Name:"+rmd.getColumnName(i));
                System.out.println("Type "+rmd.getColumnType(i));
                System.out.println("Type "+rmd.getColumnDisplaySize(i));
            }
        }
        catch(SQLException se){
            System.out.println(se);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}