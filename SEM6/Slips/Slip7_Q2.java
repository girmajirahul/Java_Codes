// Write a java program for the following:
// i. To create a Product(Pid, Pname, Price) table.
// ii. Insert at least five records into the table.
// iii. Display all the records from a table. 

import java.io.*;
import java.util.*;
import java.sql.*;

class JDBCtest
{   
    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public void getConnection(){
        try
        {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public void createtable(){
        String query="Create table Product(pid int ,pname char(10),price float);";
        try{
           stmt=con.createStatement();
           rs=stmt.executeQuery(query);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    public void insert(int Pid, String Pname, float Price)
    {
        String query="insert into product values(?,?,?);";
        try{
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,Pid);
            pstmt.setString(2,Pname);
            pstmt.setFloat(3,Price);
            int res=pstmt.executeUpdate();
            if(res>0)
                System.out.println("Record is inserted.");
            else
                System.out.println("Record is not inserted");
        }
        catch(SQLException e){
            System.out.print(e);
        }
    }

    public void displayData()
    {
        String query="Select * from product;";
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            while(rs.next())
            {
                int id=rs.getInt(1);
                String name=rs.getString(2);
                float price=rs.getFloat(3);
                System.out.println(id+"\t"+name+"\t"+price);
            }
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
    public static void main(String[] args)
    {
        JDBCtest ts=new JDBCtest();
        ts.getConnection();
        Scanner sc=new Scanner(System.in);
        //ts.createtable();
        System.out.print("Enter the pid:");
        int pid=sc.nextInt();
        System.out.print("Enter the pname:");
        String pname=sc.next();
        System.out.print("Enter the price:");
        float price=sc.nextFloat();
        ts.insert(pid,pname,price);

        ts.displayData();
    }
}