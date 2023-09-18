package s23.JSPAndServlets.SessionManagement.Filters;

import jakarta.servlet.Filter;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import jakarta.servlet.*;
/**
 * Servlet Filter implementation class MemberAreaFilter
 */

//this web filter is required, this means that the filter is based on the MemberAreaController
@WebFilter("/MemberAreaController")
public class MemberAreaFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MemberAreaFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		//type casting the servlet request and response to Http servlet request and response objects
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;
		
		//filtering out all requests to any links on the website if the username is null
		//if it is null redirect all traffic to the site controller and thus the login page
		//this prevents users from directly accessing a member area by url
		//for example a user can directly access our second member only area if they have the
		//url or search parameters since that page does not have any logic protecting it
		if(request.getSession().getAttribute("username") == null) {
			response.sendRedirect(request.getContextPath() + "/SiteController?action=login");
		} else {
			//if everything is good then we chain the response to the MemberAreaController
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
