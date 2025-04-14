import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ServletInfo extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException
    {
        PrintWriter out=resp.getWriter();
        String ipAddres=req.getRemoteAddr();
        String browserType=req.getHeader("User-Agent");

        String serverInfo=getServletContext().getServerInfo();
        String osType=System.getProperty("os.name");

        Enumeration<String> servletNames=getServletContext().getServletNames();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Client side info</h1>");
        out.println("<h2>IpAddress :"+ipAddres+"</h2>");
        out.println("<h2> BrowserType:"+browserType+"</h2>");
        out.println("<p>Server info"+serverInfo+"</p>");
        out.println("<p>Operating System "+osType+"</p>");
        out.println("<h1>Loaded Servlets :</h1>");
        out.println("<ul>");
        while(servletNames.hasMoreElements()){
            String servletName=servletNames.nextElement();
            out.println("<li>"+servletName+"</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}