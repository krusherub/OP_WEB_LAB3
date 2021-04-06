package com.example.OP_WEB_LAB3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", value = "/CalculateServlet")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double from_a,from_b,from_c,from_d,result;
        double to_a,to_b,to_c,to_d;
        double step_a,step_b,step_c,step_d;
        String radio,pre;
        StringBuffer res;
        try{
            from_a = Double.parseDouble(request.getParameter("from_a"));
            from_b = Double.parseDouble(request.getParameter("from_b"));
            from_c = Double.parseDouble(request.getParameter("from_c"));
            from_d = Double.parseDouble(request.getParameter("from_d"));

            to_a = Double.parseDouble(request.getParameter("to_a"));
            to_b = Double.parseDouble(request.getParameter("to_b"));
            to_c = Double.parseDouble(request.getParameter("to_c"));
            to_d = Double.parseDouble(request.getParameter("to_d"));

            step_a = Double.parseDouble(request.getParameter("step_a"));
            step_b = Double.parseDouble(request.getParameter("step_b"));
            step_c = Double.parseDouble(request.getParameter("step_c"));
            step_d = Double.parseDouble(request.getParameter("step_d"));

            radio = request.getParameter("equation") == null ? "-1" : request.getParameter("equation");

            pre = "<table border=\\\"1\\\">\n" +
                    "    <tbody><tr>\n" +
                    "    <td>a\n" +
                    "     <td>b\n" +
                    "     <td>c\n" +
                    "     <td>d\n" +
                    "     <td>result\n" +
                    "     </tr></tbody>\n" +
                    "</table>";

            res = new StringBuffer("");


            for(double a = from_a; a <= to_a; a+=step_a)
                for(double b = from_b; b <= to_b; b+=step_b)
                    for(double c = from_c; c <= to_c; c+=step_c)
                        for(double d = from_d;d <= to_d; d+=step_d){
                            result = Calculator.calculate(a,b,c,d,radio);
                            res.append("<table border=\"1\">" +
                                    "    <tbody><tr>" +
                                    "        <td>" + a +
                                    "        <td>" + b +
                                    "        <td>" + c +
                                    "        <td>" + d +
                                    "        <td>" + result +
                                    "    </tr></tbody>" +
                                    "</table>");
                        }
            res.insert(0,pre);
            request.setAttribute("res",res);
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }catch (NumberFormatException e){
            request.getRequestDispatcher("WEB-INF/html/NumberFormatException.html").forward(request, response);
        }catch (IllegalArgumentException e){
            request.getRequestDispatcher("WEB-INF/html/IllegalArgumentException.html").forward(request, response);
        }
    }
}
