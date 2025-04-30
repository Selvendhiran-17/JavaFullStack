<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page  import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
123<br>
selva<br>
88<br>

<%
String url="jdbc:mysql://localhost:3306/selva";
String username="root";
String password="Selva17@#";
String sql="select * from employee where EmpId=1";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
rs.next();
%>


Employee FN : <%= rs.getString(2) %> <br>
Employee LN : <%=rs.getString(3) %><br>

</body>
</html> 