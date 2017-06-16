package intro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WarmUp
 */
@WebServlet("/WarmUp")
public class WarmUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String arrow = "->";
		if (java.time.LocalTime.now().getSecond()%2 == 0) {
			arrow = "<-";
		}
		response.getWriter().print(arrow);
	}

}
