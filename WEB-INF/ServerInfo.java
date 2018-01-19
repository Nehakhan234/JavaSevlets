import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServerInfo extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String method=req.getMethod();
        String uri= req.getRequestURI();
        String protocol=req.getProtocol();
        String servername=req.getServerName();
        String remoteuser=req.getRemoteUser();
        String remoteaddr=req.getRemoteAddr();
       
        pw.println("<h1> Server Information</h1>");
        pw.println("<hr><h3>");
        pw.println("Request method = "+ method + "<br>");
        pw.println("URI = "+ uri + "<br>");
        pw.println("Server protocol = " + protocol + "<br>");
        pw.println("Server Name = " + servername + "<br>");
        pw.println("Remote address = " + remoteaddr + "<br>");
        pw.println("Remote user = " + remoteuser + "<br>");
        pw.println("<hr></h3>");
        pw.close();
     

    }
}