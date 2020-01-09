import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/ads")
public class IndexServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        Ads listAdsDao = DaoFactory.getAdsDao();
        List<Ad> ads = listAdsDao.all();
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, resp);
    }
}
