<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
 <table>
            <tr>
                <td>Welcome ${modelMap.firstname}</td>
            </tr>
            <tr>
               <td>Welcome ${modelMap.lastname}</td>
            </tr>
            <tr>
              <td>Welcome ${modelMap.email}</td>
            </tr>
            <tr>
                <td><a href="index.jsp">Home</a>
                </td>
            </tr>
        </table>
</body>
</html>