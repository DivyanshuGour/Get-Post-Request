package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter pw = response.getWriter();
        
        pw.write("<h1>My first servlet response !</h1>");
        pw.write("<hr> <b> My name is Vikas.</b>");
        
    }    
}
