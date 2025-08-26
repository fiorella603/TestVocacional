<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Recuperar los datos pasados desde el controlador
    modelo.Tema tema = (modelo.Tema) request.getAttribute("tema");
    boolean exito = (boolean) request.getAttribute("exito");
    String nombre = (String) request.getAttribute("nombre");  // El nombre que se intenta modificar
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado de la Modificación</title>
</head>
<body>
    <h2>Resultado de la modificación</h2>

    <% if (exito) { %>
        
        <p>El tema fue modificado correctamente.</p>
        <p>Detalles del tema modificado:</p>
        <ul>
            <li>Nuevo nombre: <%= tema.getNombre() %></li>
        </ul>
    <% } else { %>
        
        <p>No se pudo modificar el tema con el nombre "<%= nombre %>".</p>
    <% } %>
</body>
</html>
