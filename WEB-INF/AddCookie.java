import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddCookie extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String data = req.getParameter("data");
        //Cookie cookie =  new Cookie("MyCookie",data);
        //res.addCookie(cookie);
        pw.println("<b> My Cookie has been set to</b>");
        pw.println(data);
        pw.close();
     

    }
}