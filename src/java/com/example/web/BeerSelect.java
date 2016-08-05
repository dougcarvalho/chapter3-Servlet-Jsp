package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


/**
 *
 * @author Doug Carvalho
 * @since 05/08/2016
 * @version v.1
 */

public class BeerSelect extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection ADvice <br>");
        
        Iterator it = result.iterator();
        while(it.hasNext()) {
            out.println("<br> try: " + it.next());
        }
    }
}


