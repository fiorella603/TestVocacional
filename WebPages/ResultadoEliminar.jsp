<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado de Eliminación</title>
</head>
<body>
    <h2>Resultado de la eliminación</h2>

    <%
        Boolean exito = (Boolean) request.getAttribute("exito");
        String error = (String) request.getAttribute("error");

        if (error != null) {
    %>
        <p><%= error %></p>
    <%
        } else if (exito != null && exito) {
    %>
        <p>El tema se eliminó correctamente.</p>
    <%
        } else {
    %>
        <p>No se pudo eliminar el tema. Verifica que el ID exista.</p>
    <%
        }
    %>
</body>
</html>
