package com.Counter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestCounter")
public class RequestCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int counter;

	public RequestCounter() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		counter = 0;
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		counter = counter + 1;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<h2>hello World</h2>");
		out.println("<p>You are visitor number = " + counter + "</p>");
		out.println("</html>");

	}

}
