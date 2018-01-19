import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class PassPara extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        Enumeration e = req.getParameterNames();
        pw.println("<h1>personal Details</h1>");
        pw.println("<hr><pre>");
        while(e.hasMoreElements())
        {
      String pname= (String) e.nextElement();
      pw.print(pname + " = ");
      String pvalue=req.getParameter(pname);
      pw.println(pvalue + "<br>");
        }
       pw.println("</pre>");
        pw.close();
    }
}