package ifsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie")
public class cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String theme = request.getParameter("theme");
		
		System.out.print(theme);
		
		Cookie c1 = new Cookie("matheus", theme );
		
		response.addCookie(c1);
		
		response.sendRedirect(request.getContextPath()+ "/cor.jsp");
		
	}

}
