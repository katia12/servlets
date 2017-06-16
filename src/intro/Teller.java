package intro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Teller
 */
@WebServlet("/Teller")
public class Teller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int count = 0; 
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Deze pagina is " + ++count + " keer bezocht");
	}

}
