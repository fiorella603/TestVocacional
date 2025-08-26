<%
  boolean  c =(boolean)request.getAttribute("c");
  String nombre = (String) request.getAttribute("nombre");
%>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
          if(c==true){%>
           <%="Bienvenido al sistema"+nombre%>
           <%}else{%>
           <%="se produjo  un error"%>
          %>}   
    </body>
</html>
