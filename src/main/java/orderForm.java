import javax.script.ScriptContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/order-form")
public class orderForm extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<form method=\"post\" action=\"/order-summary\">\n" +
                "                    <label for=\"name\"><b>Name of product</b></label>\n" +
                "                    <input type=\"text\" placeholder=\"Enter name of product\" id=\"name\" name=\"name\" required><br><br>\n" +
                "                    <label for=\"amount\"><b>Amount</b></label>\n" +
                "                    <input type=\"text\" placeholder=\"Enter amount\" id=\"amount\" name=\"amount\" required>\n" +
                "                    <br><br>\n" +
                "                    <button type=\"submit\">Submit</button>\n" +
                "                </form>");
        response.setHeader("content-type", "text/html");
    }
}
