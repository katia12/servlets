package webshop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webshop.model.DefaultProduct;
import webshop.model.Product;

/**
 * Servlet implementation class index
 */
@WebServlet("/index.html")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Product[] voorraad = new Product[] { new DefaultProduct("Koffie", 3, ""), new DefaultProduct("Thee", 7, "") };

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter()
				.print("<html><head><meta charset=\"UTF-8\"><title>Webshop</title></head>"
						+ "<body><h2>Welkom in de webshop!</h2>" + "<h3>Producten</h3>"
						+ "<ul><li><a href=\"/Servlet/Product?koffie\">Koffie</a></li>"
						+ "<li><a href=\"/Servlet/Product?thee\">Thee</a></li></ul></body></html>");
	}

}
