import javax.script.ScriptContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/pong")
public class pong extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(
                "<form method=\"get\" action=\"./ping\">" +
                        "<input type=\"submit\" value=\"PING\">" +
                        "</form>");
        response.setHeader("content-type", "text/html");
    }
}