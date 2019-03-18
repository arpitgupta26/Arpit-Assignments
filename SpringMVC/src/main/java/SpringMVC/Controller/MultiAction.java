package SpringMVC.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultiAction extends MultiActionController{
    
    public ModelAndView renderPage (HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    
    public void response(HttpServletRequest request,HttpServletResponse response)throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h3>Hi i am from response object</h3>");
    }

}
