import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ChangeColor extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        String color=req.getParameter("color");
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        pw.println("<html>");
        pw.println("<body bgcolor=" + color +">");
        pw.println("<h2>The selected color is "+color+"</h2>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }
}