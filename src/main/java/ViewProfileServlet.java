import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object registeredUser = request.getSession().getAttribute("users");
        if (registeredUser != null) {
            if ((boolean) registeredUser) {
                request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
            }
        } else {
            response.sendRedirect("/login");
        }

    }


}
