package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //インスタンス化
        EmpBean bean = new EmpBean();

        //NameとAgeを設定
        bean.setName("KnowledgeTaro");
        bean.setAge(20);

        //requestオブジェクトにを値を設定(key：emp  value：bean)
        req.setAttribute("emp", bean);

        //RequestDispatcherを用いて遷移先を指定
        RequestDispatcher rd = req.getRequestDispatcher("useBean.jsp");

        //RequestDispatcherを用いて遷移先に値を投げる
        rd.forward(req, resp);
    }
}
