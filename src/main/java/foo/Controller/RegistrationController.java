package foo.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import foo.Model.User;
import foo.Service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());
		
		return mav;
	}
	
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("user") User user) {
	  Map<String, Object> modelMap = new HashMap<String, Object>();
	  userService.register(user);

	  modelMap.put("firstname", user.getFirstname());
	  modelMap.put("lastname", user.getLastname());
	  modelMap.put("email", user.getEmail());
	  return new ModelAndView("welcome", "modelMap",modelMap);
	  }

}
