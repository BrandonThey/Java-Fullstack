package s23.JSPAndServlets.SessionManagement.FixingLinks;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SiteController
 */
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		//creating a switch that directs the user based on the request
		switch(action) {
		case "login":
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		//creating a switch that directs the user based on the request
		//if loginSubmit, then authenticate and get session information
		switch(action) {
		case "loginSubmit":
			authenticate(request, response);
			break;
			
		default:
			break;
		}
	}

	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//creating a string to hold the encoded url
		//we do this to be able to use our site without using cookies and is best practice
		String encodedPath = response.encodeURL(request.getContextPath());
		
		if(username.equals("Brandon") && password.equals("12345")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);	
			newSession.setMaxInactiveInterval(300);
			newSession.setAttribute("username", username);
			
			//redirects to the member area controller and gives the action parameter of memberArea to forward
			//to the member area page
			response.sendRedirect(encodedPath + "/MemberAreaController?action=memberArea");
		} else {
			//whenever possible we want to use the url to redirect rather than the file name
			//so instead of using:
			//response.sendRedirect("Login.jsp");
			response.sendRedirect(encodedPath + "/SiteController?action=login");
		}

	}
}
