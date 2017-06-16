package intro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Headers
 */
@WebServlet("/Headers")
public class Headers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("Host: " + request.getHeader("Host") +
				"\nUser-Agent: " + request.getHeader("User-Agent") +
				"\nAccept: " + request.getHeader("Accept") +
				"\nAccept-Language: " + request.getHeader("Accept-Language") +
				"\nAccept-Encoding: " + request.getHeader("Accept-Encoding") +
				"\nConnection: " + request.getHeader("Connection"));
	}

}
