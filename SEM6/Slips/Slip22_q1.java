// Write a Menu Driven program in Java for the following: Assume Employee table with
// attributes (ENo, EName, Salary) is already created. 1. Insert 2. Update 3. Display 4.
// Exit. 

import java.io.*;
import java.util.*;
import java.sql.*;

class JDBCTest
{
    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public void getConnection()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","admin");
        }
        catch(ClassNotFoundException cse)
        {
            System.out.println(cse);
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
    }

    public void display()
    {
        String query="SELECT * FROM emp;";
        try
        {
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            System.out.println("Emp_id\tEname\tSalary");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    public void Insert(int eno,String ename,Float Salary)
    {
        String query="INSERT INTO emp VALUES(?,?,?);";
        try{
            pstmt =con.prepareStatement(query);
            pstmt.setInt(1,eno);
            pstmt.setString(2,ename);
            pstmt.setFloat(3,Salary);
            int res=pstmt.executeUpdate();
            if(res>0)
                System.out.println("Data Inserted into table.");
            else
                System.out.println("Data is not inserted.");
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    } 

    public void updateRecord(int id)
    {
        String query="update emp set salary=salary+(salary * 0.1) where eno='"+id+"';";
        try
        {
            pstmt=con.prepareStatement(query);
            int res=pstmt.executeUpdate();
            if(res>0)
                System.out.println("Record updated .");
            else
                System.out.println("Not Updated");
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }

    public static  void main(String[] args)
    {
        JDBCTest t=new JDBCTest();
        Scanner sc=new Scanner(System.in);
        t.getConnection();
        while(true)
        {   System.out.println("1.Insert\n2.Display\n3.Update\n4.Exit");
            System.out.print("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter employee id :");
                    int eid=sc.nextInt();
                    System.out.print("Enter employee name:");
                    String name=sc.next();
                    System.out.print("Enter employee Salary:");
                    Float sal=sc.nextFloat();
                    t.Insert(eid,name,sal);
                    break;
                case 2:
                    t.display();
                    break;
                case 3:
                    System.out.print("Enter employee id:");
                    int eno=sc.nextInt();
                    t.updateRecord(eno);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}