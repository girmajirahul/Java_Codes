<%@ page import="java.sql.*" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Insert College</title>
        <style>
            body {
                display: flex;
                flex-wrap: wrap;
                gap: 10px;
            }

            .form {
                max-width: 400px;
                margin: 50px auto;
                padding: 20px;
                background: #f9f9f9;
                border-radius: 10px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            }


            .form div {
                margin-bottom: 15px;
            }


            .form label {
                font-weight: bold;
                display: block;
                margin-bottom: 5px;
                color: #333;
            }


            .form input[type="text"] {
                width: 100%;
                padding: 8px;
                border: 1px solid #ccc;
                border-radius: 5px;
                font-size: 16px;
                box-sizing: border-box;
            }


            .form input[type="submit"] {
                width: 100%;
                background: #007bff;
                color: white;
                padding: 10px;
                border: none;
                border-radius: 5px;
                font-size: 16px;
                cursor: pointer;
                transition: background 0.3s;
            }

            .form input[type="submit"]:hover {
                background: #0056b3;
            }

            .table {
                max-width: 400px;
                margin: 50px auto;
                padding: 20px;
                background: #ece4e471;
                border-radius: 10px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            }

            table {
                width: 100%;
                border-collapse: collapse;
                background: #fff;
                box-shadow: 0 4px 8px rgba(22, 10, 10, 0.1);
                border-radius: 5px;
                overflow: hidden;
            }

            tr:hover {
                background: #e0e0e0;
            }
        </style>
    </head>

    <body>
        <div class="form">
            <form action="" method="post">
                <div>
                    <label for="collage_id">Enter College ID</label>
                    <input type="text" name="cid" id="">
                </div>
                <div>
                    <label for="collage_name">Enter College Name</label>
                    <input type="text" name="cname" id="">
                </div>
                <div>
                    <label for="collage_address">Enter College Address</label>
                    <input type="text" name="caddress" id="">
                </div>
                <input type="submit" value="Submit">
            </form>
        </div>
        <%  Connection con=null; 
            PreparedStatement pstmt=null; 
            ResultSet rs=null; 
            Statement stmt=null;
            if(request.getMethod().equals("POST")){ 
                String id=request.getParameter("cid"); 
                String name=request.getParameter("cname"); 
                String address=request.getParameter("caddress"); 
                if (id==null || name==null || address==null || id.trim().isEmpty() || name.trim().isEmpty() || address.trim().isEmpty()) 
                {
                    out.println("All fields are required!"); 
                    return; 
                } 
                int cid=0; 
                try { cid=Integer.parseInt(id); } 
                catch(NumberFormatException ex) { 
                    out.println("Invalid College ID format"); 
                    return; } 
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root" , "" ); 
                        String query="INSERT INTO college VALUES (?, ?, ?);" ; 
                        pstmt=con.prepareStatement(query); pstmt.setInt(1, cid);
                        pstmt.setString(2, name); pstmt.setString(3, address); 
                        int rowsAffected=pstmt.executeUpdate(); 
                        if(rowsAffected> 0) { %>
                            <script>alert("Record inserted Successfully");</script>
                        <% } else { %>
                            <script>alert("Record is not inserted");</script>
                        <% } } catch (Exception e) { out.println("Error: " + e.getMessage());
        } 
    }  
    %>
    <div class=" table">
        <table border=" 1">
            <tr>
                <th>College ID</th>
                <th>College Name</th>
                <th>Address</th>
            </tr>

            <% try { 
                if (con==null) 
                { Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root" , "" ); } 
                String selectQuery="SELECT * FROM college" ; 
                stmt=con.createStatement();
                rs=stmt.executeQuery(selectQuery); while (rs.next()) { %>
                <tr>
                    <td>
                         <%= rs.getInt("id") %>
                    </td>
                    <td>
                        <%= rs.getString("name") %>
                    </td>
                    <td>
                        <%= rs.getString("address") %>
                    </td>
                </tr>
                <% } } catch (Exception e) { out.println("<p class='error'>Error fetching data: " +
                    e.getMessage() + "</p>");
                    } finally {
                    try {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                    } catch (SQLException ex) {
                    out.println("<p class='error'>Error closing resources: " + ex.getMessage() + "</p>");
                    }
                    }
            %>
        </table>
        </div>
    </body>

    </html>