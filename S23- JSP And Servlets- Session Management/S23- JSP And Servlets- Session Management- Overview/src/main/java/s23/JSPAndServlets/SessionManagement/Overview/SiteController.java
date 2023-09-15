package s23.JSPAndServlets.SessionManagement.Overview;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting the username and password from any login post requests
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//some basic username and password validation 
		if(username.equals("Brandon") && password.equals("12345")) {
			//invalidating any previous available sessions to create a new one
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
			
			//creating a maximum inactive timer, so the session times out after a certain time
			//here it will be 300 seconds
			newSession.setMaxInactiveInterval(300);
			
			//once everything else has been completed and the user is verified, we redirect
			//them to a member only page
			response.sendRedirect("MemberArea.jsp");
		} else {//if the username and password are invalid then we will redirect them back to the login page
			response.sendRedirect("Login.jsp");
		}
	}

}
