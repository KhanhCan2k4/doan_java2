package home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;

/**
 * Servlet implementation class AddToCart
 */
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();

		if (session.getAttribute("user") != null) {

			int id;

			try {
				id = Integer.parseInt(request.getParameter("id"));

				if (session.getAttribute("user") == null) {
					response.sendRedirect(request.getHeader("Referer"));
				}

				HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");

				if (cart == null) {
					cart = new HashMap<>();
				}

				if (cart.containsKey(id)) {
					cart.replace(id, cart.get(id) + 1);
				} else {
					cart.put(id, 1);
				}

				session.setAttribute("cart", cart);
			} catch (Exception e) {
				// TODO: handle exception
				id = 0;
			}
			response.sendRedirect(request.getHeader("Referer"));
		} else {
			request.getRequestDispatcher("Login").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
