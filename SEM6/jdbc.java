import java.sql.*;
class JDBCtest{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver
            // Establlish connection url by getConnection method
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            Statement stat=con.createStatement();
            ResultSet rs=stat.executeQuery("select * from users;");
            while(rs.next()){
                System.out.println(rs.getInt("userid")+" "+rs.getString("name")+" "+rs.getInt("age"));
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}