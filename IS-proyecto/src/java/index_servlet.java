
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
        
        //String user = request.getParameter("user");
        //String pass = request.getParameter("password");
      
		//	System.out.println(user+pass);
			
		//PRUEBAS PARA REGISTRAR.HTML
		
		String nombre = request.getParameter("nombre");
		String priape = request.getParameter("priape");
		String segape = request.getParameter("segape");
		String password = request.getParameter("password");
		String cel = request.getParameter("cel");
		String email = request.getParameter("email");
		String[] check = request.getParameterValues("check");
		String nProf = request.getParameter("numprof");
		String a;
		if(check != null)
			 a = nombre+priape+segape+password+cel+email+check[0]+nProf;
		else
			a = nombre+priape+segape+password+cel+email+"off"+nProf;
		
        response.setContentType("text/plain");
        response.getWriter().write(a);

    }
    
}