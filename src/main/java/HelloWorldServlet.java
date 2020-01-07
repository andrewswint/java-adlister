import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//the url for the page
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

//    page count
    private int hitCount;

//    page counter
    public void init() {
    hitCount = 0;
}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");

        if (name == null || name.equalsIgnoreCase("")) {
            response.setContentType("text/html");
            hitCount ++;
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello, World!</h1> <p>Page view counter: " + hitCount + "</p>");
        } else {
            response.setContentType("text/html");
            hitCount ++;
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello " + name +"</h1> <p>Page view counter: " + hitCount + "</p>");
        }

    }

}
