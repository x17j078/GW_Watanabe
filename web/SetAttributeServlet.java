package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetAttributeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession ses = req.getSession(true);
		ses.setAttribute("name", "KnowledgeTaro");
		req.setAttribute("age", 20);

		//遷移先を決める
		RequestDispatcher rd = req.getRequestDispatcher("dispatch.jsp");
		//遷移先に値を投げる
		rd.forward(req, resp);


	}
}
