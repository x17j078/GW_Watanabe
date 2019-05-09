package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//文字コードの設定
		req.setCharacterEncoding("UTF-8");

		//変数の宣言、パラメーター取得
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String java = req.getParameter("java");
		String php = req.getParameter("php");
		String c = req.getParameter("c");
		String message = req.getParameter("message");

		//言語にチェックが入っていなかったら""を代入
		if(java == null) {
			java = "";
		}
        if(php == null) {
			php = "";
		}
        if(c == null) {
			c = "";
		}

		//
		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
    	out.println("<head><title>送信結果だよ</title></head>");
    	out.println("<body>");
    	out.println("<h2>名前</h2>");
    	out.println(name);
    	out.println("<h2>年齢</h2>");
    	out.println(age);
    	out.println("<h2>性別</h2>");
    	out.println(gender);
    	out.println("<h2>興味のある言語</h2>");
    	out.println(java + " " + php + " " + c);
    	out.println("<h2>何か一言</h2>");
    	out.println(message);
    	out.println("</body>");
		out.println("</html>");

	}
}
