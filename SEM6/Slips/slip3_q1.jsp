<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Document</title>
</head>
<body>
<%
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");

        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from patient;");
    %>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Adress</th>
                <th>Age</th>
                <th>Disease</th>
                <!-- Add more column headers if needed -->
            </tr>
        </thead>
        <tbody>
            <% while(rs.next()) { %>
                <tr>
                    <td><%= rs.getInt(1) %></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getInt(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <!-- Add more columns if needed -->
                </tr>
            <% } %>
        </tbody>
    </table>
    <% 
    } catch (ClassNotFoundException | SQLException e) {
        out.println("An error occurred: " + e.getMessage());
    } 
%>
</body>
</html>
