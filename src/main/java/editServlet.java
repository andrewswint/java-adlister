import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/contact/editContact")
public class editServlet extends HttpServlet {
    Contacts ContactListDao = DaoFactory.getContactsDao();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idValue");
        long idNum = Long.parseLong(id);
        Contact contacts= ContactListDao.getContactById(idNum);
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("/contact/edit.jsp").forward(request, response);
    }
}
