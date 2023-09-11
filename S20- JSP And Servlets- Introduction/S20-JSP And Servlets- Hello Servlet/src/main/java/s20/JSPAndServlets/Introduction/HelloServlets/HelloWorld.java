package s20.JSPAndServlets.Introduction.HelloServlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//the process of creating a new servlet
//-Go to Project, Go to Java Resources, Create new package in src, Create servlet
//-Right click package, build path, configure build path, libraries,
//  -click on module path, add libraries, server runtime
/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //serves get requests, for example when a url is clicked, this method is called
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//a simple hello world message that is displayed on the console whenever a 
		//call to the local host url is made
		System.out.println("Hello World");
		
		//printing hello world to the webpage using HTML Tags
		response.getWriter().println("<h1>Hello World</h1>");
	}
}
