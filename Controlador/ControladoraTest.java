package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GestionarTest;
import modelo.Test1;

/**
 *
 * @author Agus
 */
@WebServlet(name = "ControladoraTest", urlPatterns = {"/ControladoraTest"})
public class ControladoraTest extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");

        Test1 t1 = new Test1();
        t1.setNombre(nombre);
        t1.setDescripcion(descripcion);

        boolean b = false;

        try {
            GestionarTest gt = new GestionarTest();
            b = gt.insertarTest(t1);
        } catch (Exception e) {
            e.printStackTrace(); // Esto va al log de Tomcat
            request.setAttribute("error", "Ocurrió un error interno en el servidor: " + e.getMessage());
        }

        request.setAttribute("b", b);
        request.setAttribute("nombre", nombre);

        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher a = request.getRequestDispatcher("Resultado.jsp");
            a.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}