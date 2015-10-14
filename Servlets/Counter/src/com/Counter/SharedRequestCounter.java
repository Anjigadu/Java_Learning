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
public class SharedRequestCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public SharedRequestCounter() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		int counter = 0;
		getServletContext().setAttribute("counter", counter);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// Get the counter value from Application scope
		Integer counter = (Integer)getServletContext().getAttribute("counter");
		// Increment the counter
		++counter;
		// Save it back
		getServletContext().setAttribute("counter", counter);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<h2>hello World</h2>");
		out.println("<p>The counter value is incremented</p>");
		out.println("</html>");

	}

}
