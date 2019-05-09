package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            //セッションを取得
            HttpSession ses = req.getSession(false);

            //セッションが生成されていたら、セッションを終了
            if(ses != null) {
                ses.invalidate();
            }

            //サーブレットでHTMが記述できるようにするL
            resp.setContentType("text/html; charset = UTF-8");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<head><title>Session Servlet 3</title></head>");
            out.println("<body>");
            out.println("<h1>Session Servlet 3</h1>");
            out.println("<p>セッションを終了しました</p>");
            out.println("</body>");
            out.println("</html>");



        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
