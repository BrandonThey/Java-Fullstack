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
		//getting what action to take from the requesting member area jsp
//		String action = request.getParameter("action");
//		System.out.println(action);
		//if the action is to destroy then we return to the login page and 
		//remove previously made user cookies
//		switch(action) {
//		case "destroy":
//			Cookie[] cookies = request.getCookies();
//			//resetting username cookies
//			for(Cookie cookie : cookies) {
//				if(cookie.getName().equals("username")) {
//					cookie.setValue(null);
//					cookie.setMaxAge(0);
//					response.addCookie(cookie);
//				}
//			}
//			
//			response.sendRedirect("Login.jsp");
//			break;
//		default:
//			break;
//		}
		
		//refactoring the cookies to instead
		//invalidate the member area page and redirecting
		request.getSession().invalidate();
		response.sendRedirect("Login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
