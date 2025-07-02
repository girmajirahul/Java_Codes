import java.sql.*;
import java.util.*;
class MobileDatebase
{
    private Connection oConnect;
    private Statement stmt;
    private PreparedStatement  pstmt;
    private ResultSet rs;

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
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    public void insert(int no,String name,String color,String sim_type,String network_type,String ram,String storage)
    {
        String query="insert into Mobile values(?,?,?,?,?,?,?);";
        try
        {
            pstmt=oConnect.prepareStatement(query);
            pstmt.setInt(1,no);
            pstmt.setString(2,name);
            pstmt.setString(3,color);
            pstmt.setString(4,sim_type);
            pstmt.setString(5,network_type);
            pstmt.setString(6,ram);
            pstmt.setString(7,storage);
            int b=pstmt.executeUpdate();
            if(b>0)
                System.out.println("RECORD IS INSERTED.");
            else
                System.out.println("RECORD IS NOT INSERTED.");
           

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    public void UpdateData(String model_color,int model_no)
    {
        String query="update Mobile set model_color=? where model_no=?;";
        try
        {
            pstmt=oConnect.prepareStatement(query);
            pstmt.setString(1,model_color);
            pstmt.setInt(2,model_no);
            int res=pstmt.executeUpdate();
            if(res>0)
                System.out.println("Record is updated.");
            else    
                System.out.println("Record is not Updated.");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public void display()
    {
        String query="Select * from Mobile;";
        try
        {
            stmt=oConnect.createStatement();
            rs=stmt.executeQuery(query);
           // System.out.println("Model_no\tModel_name\tModel_color\tsim_type\tnetwork+type\tRam\tStorage");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
            }

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }   

    public void Delete(int no)
    {
        String query="delete from Mobile where model_no=?;";
        try
        {
            pstmt=oConnect.prepareStatement(query);
            pstmt.setInt(1,no);
            int res=pstmt.executeUpdate();
            if(res>0)
                System.out.println("Record is deleted.");
            else
                System.out.print("Record is not deleted.");
        }
        catch(SQLException e)
        {
            System.out .println(e);
        }
    }

    public void search(String mname)
    {
        String query="Select * from Mobile where model_name=?;";
        try
        {
            pstmt=oConnect.prepareStatement(query);
            pstmt.setString(1,mname);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                
                System.out.println("Model number:"+rs.getInt(1));
                System.out.println("Model Color:"+rs.getString(3));
                System.out.println("Sim-type "+rs.getString("sim_type")+"\nRam "+rs.getString("ram")+"\nStorage:"+rs.getString("storage"));
               
            }

        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
}

public class SetB1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MobileDatebase mdb=new MobileDatebase();
        mdb.getConnection();
       // mdb.insert(1,"VIVO","ORANGE","Dual-Nano","XYZ","6GB","128GB");
       // mdb.display();
        while(true)
        {
            System.out.print("1.Insert\n2.Modidy\n3.Delete\n4.Search\n5.view All\n6.Exit\n");
            System.out.print("\nEnter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                        System.out.print("Enter Records to insert..\n");
                        System.out.print("Model Number:");
                        int mno=sc.nextInt();
                        System.out.print("Model Name:");
                        String mname=sc.next();
                        System.out.print("Model color:");
                        String mcolor=sc.next();
                        System.out.print("Sim type:");
                        String stype=sc.next();
                        System.out.print("Network Type:");
                        String ntype=sc.next();
                        System.out.print("RAM:");
                        String ram=sc.next();
                        System.out.print("Storage:");
                        String str=sc.next();

                        mdb.insert(mno,mname,mcolor,stype,ntype,ram,str);

                        break;
                case 2:
                    //Modify
                    System.out.print("Enter model number:");
                    int model_no=sc.nextInt();
                    System.out.println("Enter new Model Color:");
                    String color=sc.next();
                    mdb.UpdateData(color,model_no);
                    break;
                case 3:
                    System.out.print("Enter model number to delete the record:");
                    int n=sc.nextInt();
                    mdb.Delete(n);

                    break;
                case 4:
                    //Search:
                    System.out.print("Enter model name to search:");
                    String model_name=sc.next();
                    mdb.search(model_name);
                    break;
                case 5:
                        mdb.display();
                        break;
                case 6:
                        System.exit(0);
            }
        }
    }
}