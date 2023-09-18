package s23.JSPAndServlets.SessionManagement.Cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MemberAreaController
 */
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberAreaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String encodedPath = response.encodeURL(request.getContextPath());
		switch(action) {
		case "destroy":
			request.getSession().invalidate();
			response.sendRedirect(encodedPath + "/SiteController?action=login");
			break;
		case "memberArea":
			request.getRequestDispatcher("MemberArea.jsp").forward(request,response);
			break;
		case "memberOnly":
			//another case that will direct to another member only page
			request.getRequestDispatcher("MemberOnly.jsp").forward(request, response);
			break;
		default:
			response.sendRedirect(encodedPath + "/SiteController?action=login");
			break;
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
