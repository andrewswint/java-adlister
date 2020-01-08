import javax.script.ScriptContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/order-summary")
public class orderSummary extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("test");
        String name = request.getParameter("name");
        String amount = request.getParameter("amount");
        PrintWriter out = response.getWriter();
        out.println(name + " " + amount);
    }
}
