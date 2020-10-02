package controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
public class LoginController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,HttpServletResponse arg1)throws Exception {
		System.out.println("login......");
		return new ModelAndView("/HTML/login.html");
	}
}
