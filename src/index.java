

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.UserDAO;
import user.UserDTO;

/**
 * Servlet implementation class index
 */
@WebServlet("/")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    UserDAO userDAO = new UserDAO();
	    String name = request.getParameter("name");
	    String pass = request.getParameter("pass");

	    int user_id = userDAO.getUserIdByNameAndPass(name, pass);

	    if(user_id <= 0) {
	        request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
	    }

	    UserDTO userData = userDAO.getUserDataById(user_id);
	    request.setAttribute("userId", userData.getId());
	    request.setAttribute("name", userData.getName());
	    request.setAttribute("flavor", userData.getFlavor());
		request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
	}

}
