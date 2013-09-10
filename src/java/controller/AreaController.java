/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AreaCalculator;


/**
 *
 * @author jorda_000
 */
@WebServlet(name = "AreaController", urlPatterns = {"/AreaController"})
public class AreaController extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String msg = "";
        String type = request.getParameter("type");


        if (type.equals("rectangle")) {
            try {

                String sLength = request.getParameter("length");
                String sWidth = request.getParameter("width");

                double length = Double.valueOf(sLength);
                double width = Double.valueOf(sWidth);

                AreaCalculator mp = new AreaCalculator();
                String sqft = Double.toString(mp.getSquareFeet(length, width));
                request.setAttribute("sqft", sqft);
                msg = "The area of a rectangle is length * width (" + length + " * " + width + ")";

            } catch (NumberFormatException e) {
                msg = "Please enter valid numbers.";
            }
        } else {
            try {

                String sRadius = request.getParameter("radius");
                double radius = Double.valueOf(sRadius);

                AreaCalculator mp = new AreaCalculator();
                String sqft = Double.toString(mp.getCircleFeet(radius));
                request.setAttribute("sqft", sqft);

                msg = "The area of a circle is 2 * PI * radius (2 * PI * " + radius + ")";
                
            } catch (NumberFormatException e) {
                msg = "Please enter valid numbers.";
            }
        }

        request.setAttribute("msg", msg);
        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }
    
    
    
    
    
    
    
    
    
    
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
