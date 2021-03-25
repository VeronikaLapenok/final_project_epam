package by.lapenok.epam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(name = "controller", urlPatterns = {"/controller"})
public class Controller extends HttpServlet {
  private static Logger logger = LogManager.getLogger();
  private static final long serialVersionUID = 1L;
      
  public Controller() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String numStr = request.getParameter("number");
    int num = Integer.parseInt(numStr);
    num*=2;
    logger.debug("hello");
    request.setAttribute("numResult", num);
    request.getRequestDispatcher("/pages/main.jsp").forward(request, response);
  }
}
