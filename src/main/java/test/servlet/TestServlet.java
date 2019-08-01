package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	private String userName;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");

		this.userName = req.getParameter("user_name");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new ServletException(e);
		}

		resp.setCharacterEncoding("UTF-8");
		try (PrintWriter pw = resp.getWriter()) {

			pw.println("welcome " + this.userName);
		}
	}
}
