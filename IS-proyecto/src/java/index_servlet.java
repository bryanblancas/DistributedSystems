
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index_servlet")
public class index_servlet extends  HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String user = request.getParameter("user");
        String pass = request.getParameter("password");
      
			System.out.println(user+pass);
			
        response.setContentType("text/plain");
        response.getWriter().write("exito");

    }
    
}