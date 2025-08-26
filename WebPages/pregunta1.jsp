<%@page import="modelo.Pregunta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Tema"%>
<%
  String nombre = (String) request.getAttribute("nombre");
  String apellido = (String) request.getAttribute("apellido");
  ArrayList <Pregunta> pregunta = (ArrayList <Pregunta>) request.getAttribute("pregunta");
  Tema t1 = (Tema) request.getAttribute("t1");
%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Prueba de formulario</title>
  <meta charset="UTF-8">
  <link href="css/preguntas.css" rel="stylesheet" type="text/css"/>
</head>
 <body>
<header>
  <a href="inicio.html">
    <img src="imagenes/logo.png" alt="Logo" class="logo"/>
  </a>
</header>
<div class="boxtitulo">
    <h2 class="titulo"><%= t1.getNombre() %></h2>
</div>

<!-- Contenedor para las preguntas -->
<div class="preguntas-container">
    <form action="registrardatos.php" method="post">
        <% for (int i = 0; i < pregunta.size(); i++) { %>
            <div class="question">
                <div class="title">
                    <span class="number"><%= i + 1 %>.</span>
                    <span class="title"><%= pregunta.get(i).getPregunta() %></span>
                    <input type="hidden" name="test2020_t_answers::answer_id[1]" value="">
                </div>

                <div class="answersi">
                    <label for="wpt-test-question-59-answer-130">
                        <input type="radio" id="wpt-test-question-59-answer-130" 
                               data-errormessage="Por favor, elija una sola respuesta." 
                               required="required" 
                               aria-required="true" 
                               name="p<%=i+1%>" 
                               value="<%= pregunta.get(i).getValor() %>">Sí
                    </label>
                </div>

                <div class="answerno">
                    <label for="wpt-test-question-59-answer-131">
                        <input type="radio" id="wpt-test-question-59-answer-131" 
                               data-errormessage="Por favor, elija una sola respuesta." 
                               name="p<%=i+1%>" value="0">No
                    </label>
                </div>
            </div>
        <% } %>
    </form>
                              <div class="form-boton">
        <input type="submit" value="Enviar" name="modificar" class="boton-enviar" />
      </div>
</div>
</html>


