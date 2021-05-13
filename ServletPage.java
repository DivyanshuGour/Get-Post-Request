package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPage extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
    {
        int x = Integer.parseInt(request.getParameter("fnum"));
        int y = Integer.parseInt(request.getParameter("snum"));
        int z = x + y;
        
        PrintWriter pw = response.getWriter();
        
        pw.write("<h1>Servlet Page</h1>");
        pw.write("<hr><h2>Result : "+z+"</h2>");
        
    }    
}
