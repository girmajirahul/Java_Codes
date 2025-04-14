import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public  class CountCookies extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
    {
        PrintWriter out=resp.getWriter();
        Cookie []arr=req.getCookies();
        if(arr==null){
            Cookie c=new Cookie("count","1");
            out.println("Welcome you have visited for first time");
            resp.addCookie(c);
        }
        else{
            int flag=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i].getName().equals("count"))
                {
                    String str=arr[i].getValue();
                    int cnt=Integer.parseInt(str);
                    cnt++;
                    out.println("You visted this page "+cnt+" times");
                    Cookie c=new Cookie("count",String.valueOf(cnt));
                    resp.addCookie(c);
                    flag=1;
                    break;
               }
            }
            if(flag==0){
                Cookie c=new Cookie("count","1");
                out.println("Welcome You have visited first time");
                resp.addCookie(c);
            }
        }
    }
}
