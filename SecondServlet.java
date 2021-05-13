package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
    {
        // http://localhost:8084/webpro/hello?fnum=125&snum=74
        // http://localhost:8084/webpro/hello?fnum=125
        
        // http://localhost:8084/webpro/hello
        
        int x = Integer.parseInt(request.getParameter("fnum"));
        int y = Integer.parseInt(request.getParameter("snum"));
        int z = x + y;
        
        PrintWriter pw = response.getWriter();
        
        pw.write("<h1>Second Servlet </h1>");
        pw.write("<hr><h2>Result : "+z+"</h2>");
        
    }    
}
