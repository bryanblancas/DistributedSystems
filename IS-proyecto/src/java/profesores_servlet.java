
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profesores_servlet")
public class profesores_servlet extends  HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
			String id = "juanito";	
			String hola = "<tr>\n" +
"			            <td>Alvin</td>\n" +
"			            <td>Eclair</td>\n" +
"			            <td>$0.87</td>\n" +
"			            <td><i class='fa fa-eye fa-2x icon-blue visualizar' iduser='"+id+"'></i></td>\n" +
"			            <td><i class='fa fa-pencil fa-2x icon-blue editar' iduser='idusuario1'></i></td>\n" +
"			            <td><i class='fa fa-trash fa-2x icon-blue eliminar' iduser='idusuario1'></i></td>\n" +
"			            <td><form><p><label><input type='checkbox' class='filled-in'/><span></span></label></p></form></td>\n" +
"		          	</tr>";
   
			
        response.setContentType("text/plain");
        response.getWriter().write(hola);

    }
    
}