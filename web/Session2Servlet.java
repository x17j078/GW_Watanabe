package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            //セッション取得(セッションが生成されているか)
            HttpSession ses = req.getSession(false);

            //サーブレットでHTMLが記述できるようにする
            resp.setContentType("text/html; charset = UTF-8");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<head><title>Session Servlet 2</title></head>");
            out.println("<body>");
            out.println("<h1>Session Servlet 2</h1>");

            //セッションが生成されていなかった場合、分岐し、終了
            if(ses == null) {
                out.println("<p>セッションが開始されていません</p>");
                out.println("</body>");
                out.println("</html>");
                return;
            }

            out.println("<p>セッションが継続しています</p>");
            //セッションに設定した値を呼び出し
            out.println("<p>"+ ses.getAttribute("loginUser") +"</p>");
            out.println("</body>");
            out.println("</html>");



    }
}
