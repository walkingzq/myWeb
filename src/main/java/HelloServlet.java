import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


/**
 * Create by Zhao Qing on 2017/11/12
 */
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //获取method并输出
        String method = req.getMethod();
        System.out.println("method:" + method);
        //获取ContextPath并输出
        System.out.println("ContextPath" + req.getContextPath());
        //获取协议并输出
        System.out.println("protocol:" + req.getProtocol());
        //获取request所有的Header并输出
        Enumeration headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String header = (String) headerNames.nextElement();
            System.out.println(header + ":" + req.getHeader(header));
        }

        //输出
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        String response = "<html><body><p>hello servlet</p></body></html>";
        writer.print(response);
//        writer.flush();

    }
}
