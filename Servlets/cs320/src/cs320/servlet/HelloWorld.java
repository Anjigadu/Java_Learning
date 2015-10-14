package cs320.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloWorld() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.println("<html>");
//		out.println("<h2>hello World</h2>");
//		out.println("</html>");

		out.println("<html><body>");
		out.println("<br>Server Port: " + request.getServerPort());
		out.println("<br>Server Name: " + request.getServerName());
		out.println("<br>Protocol: " + request.getProtocol());
		out.println("<br>Character Encoding: " + request.getCharacterEncoding());
		out.println("<br>Content Type: " + request.getContentType());
		out.println("<br>Content Length: " + request.getContentLength());
		out.println("<br>Remote Address: " + request.getRemoteAddr());
		out.println("<br>Remote Host: " + request.getRemoteHost());
		out.println("<br>Scheme: " + request.getScheme());
		
		response.getWriter().println("Hello World");
	}

}
