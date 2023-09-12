package s20.JSPAndServlets.Exercise;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting the parameter page
		String param = request.getParameter("page");
		
		//conditional forwarding/redirecting based on what page parameter was entered
		if(param == null) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		} else if(param.equals("login")) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		} else if(param.equals("signup")) {
			getServletContext().getRequestDispatcher("/SignUp.jsp").forward(request, response);
		} else if(param.equals("about")) {
			getServletContext().getRequestDispatcher("/About.jsp").forward(request, response);
		} else{
			getServletContext().getRequestDispatcher("/NotFound.jsp").forward(request, response);
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
