import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/contacts")
public class ContactServlet extends HttpServlet {
    Contacts ContactListDao = DaoFactory.getContactsDao();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Contact> contacts = ContactListDao.getContacts();
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("/contact/contacts.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        Contact newContact = new Contact(firstName,lastName,phoneNumber);
        ContactListDao.saveContact(newContact);
    }
}
