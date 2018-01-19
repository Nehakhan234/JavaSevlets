import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
public class Session extends HttpServlet {
public void doGet (HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
{
HttpSession session = req.getSession(true);
res.setContentType("text/html");
PrintWriter pw = res.getWriter();

pw.println("<h1> SessionServlet output </h1>");

Integer ival = (Integer) session.getValue("sessiontest.counter");
if (ival==null) ival = new Integer(1);
else ival = new Integer(ival.intValue() + 1);
session.putValue("sessiontest.counter", ival);


pw.println("You have hit this page <b>" + ival + "</b> times.<p>");
pw.println("<p>");
pw.println("<h3>Session Data:</h3>");
pw.println("New Session: " + session.isNew());
pw.println("<br>Session ID: " + session.getId());
pw.println("<br>Creation Time: " + session.getCreationTime());
pw.println("<br>Last Accessed Time: " + session.getLastAccessedTime());
pw.close();
}
}



