<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Recuperar el objeto 'temaEncontrado' desde la solicitud
    modelo.Tema temaEncontrado = (modelo.Tema) request.getAttribute("temaEncontrado");
    String nombre = (String) request.getAttribute("nombre");
    
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado de búsqueda</title>
</head>
<body>
    <h2>Resultado de búsqueda</h2>

    <% if (temaEncontrado != null) { %>
        <!-- Si el tema fue encontrado, mostrar los detalles -->
        <p>El tema "<%= nombre %>" fue encontrado correctamente.</p>
        <p>Detalles del tema:</p>
        <ul>
            <li>ID: <%= temaEncontrado.getId() %></li>
            <li>Nombre: <%= temaEncontrado.getNombre() %></li>
            <li>ID del Test: <%= temaEncontrado.getIdtest() %></li>
        </ul>
    <% } else { %>
        <!-- Si el tema no fue encontrado -->
        <p>No se encontró el tema "<%= nombre %>".</p>
    <% } %>
</body>
</html>
