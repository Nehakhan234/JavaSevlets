import java.io.*;

import javax.net.ssl.ExtendedSSLSession;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class GreetTime extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
    {
           int hour,min,sec;
           String ampm = new String("AM");
           PrintWriter pw = res.getWriter();
          res.setContentType("text/html");
          Calendar cal = Calendar.getInstance();
          hour = cal.get(cal.HOUR);
          min = cal.get(cal.MINUTE);
          sec = cal.get(cal.SECOND);
          pw.println("<h1>");
          if(hour>23 || hour<=6)
          pw.println("You are up late!!");
          else if(hour>6 && hour<=12)
          pw.println("Good morning");
          else if(hour>12 && hour<=18)
          pw.println("Good afternoon");
          else
          pw.println("Good eve!!");
          pw.println("</h1>");
          if(hour==0)
          hour=12;
          if(hour>12)
          {
              hour-=12;
              ampm="PM";
          }
          pw.println("Now the time is:"+hour+":"+min+":"+sec+" "+ampm);
          pw.close();

    }
}