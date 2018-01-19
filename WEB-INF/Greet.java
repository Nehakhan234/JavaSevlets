import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Greet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        String username=req.getParameter("user");
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        if(username.length()>0)
        {
            pw.println("<b><h1>");
            pw.println("Nice to meet you "+username);
            pw.println("</h1>");
            pw.println("you are welcome");
            pw.println("</b>");

            
        }
        else
        {
            pw.println("You have not entered your name");
        }
        pw.close();

    }
}
