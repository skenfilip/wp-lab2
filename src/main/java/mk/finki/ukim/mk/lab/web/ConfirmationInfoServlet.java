package mk.finki.ukim.mk.lab.web;

import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Confirmation.do")
public class ConfirmationInfoServlet extends HttpServlet {
    private final SpringTemplateEngine springTemplateEngine;

    public ConfirmationInfoServlet(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pizzaSize = (String) req.getSession().getAttribute("pizzaSize");
        String pizzaName = (String) req.getSession().getAttribute("pizzaName");
        String clientName = (String) req.getSession().getAttribute("clientName");
        String clientAddress = (String) req.getSession().getAttribute("clientAddress");
        String clientIpAddress = req.getRemoteAddr();
        String clientBrowser = req.getHeader("User-Agent");
        WebContext webContext = new WebContext(req, resp, req.getServletContext());

        webContext.setVariable("pizzaSize", pizzaSize);
        webContext.setVariable("pizzaName", pizzaName);
        webContext.setVariable("clientName", clientName);
        webContext.setVariable("clientAddress", clientAddress);
        webContext.setVariable("clientIpAddress", clientIpAddress);
        webContext.setVariable("clientBrowser", clientBrowser);

        resp.setContentType("text/html; charset=UTF-8");
        this.springTemplateEngine.process("confirmationInfo.html", webContext, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect("/*");
    }
}
