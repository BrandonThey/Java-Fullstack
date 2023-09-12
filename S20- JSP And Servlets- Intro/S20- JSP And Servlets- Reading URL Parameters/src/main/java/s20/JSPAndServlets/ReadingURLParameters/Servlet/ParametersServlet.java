package s20.JSPAndServlets.ReadingURLParameters.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ParametersServlet
 */
public class ParametersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParametersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//writing some sample text to the website
		response.getWriter().println("SampleWeb.org");
		
		//the request gets the url paramater with the name of getValue1
		//so in the url if formatted like ".../Servlet?getValue1=TestingParam"
		//the written response is TestingParam
		response.getWriter().println(request.getParameter("getValue1"));
		//we can even get multiple values if formatted like
		//".../Servlet?getValue1=TestingParam&getValue2=Brandon"
		//will print "Brnadon" for value 2
		//creating a variable to hold the output writer
		PrintWriter output = response.getWriter();
		output.println("Value 2: " + request.getParameter("getValue2"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
