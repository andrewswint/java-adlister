import javax.script.ScriptContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/ping")
public class ping extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(
                "<form method=\"get\" action=\"./pong\">" +
                        "<input type=\"submit\" value=\"PONG\">" +
                        "</form>");
                response.setHeader("content-type", "text/html");
    }
}

