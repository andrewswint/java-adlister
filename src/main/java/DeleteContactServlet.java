import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/contacts/delete")
public class DeleteContactServlet extends HttpServlet {
    Contacts ContactListDao = DaoFactory.getContactsDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idValue");
        long idNum = Long.parseLong(id);
        ContactListDao.deleteContactById(idNum);
        response.sendRedirect("/contacts");
    }
}
