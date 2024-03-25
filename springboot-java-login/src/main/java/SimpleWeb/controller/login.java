package SimpleWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SimpleWeb.service.LoginService;

@Controller
public class login {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String viewLoginPage(ModelMap map) {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		
		boolean isValidUser=service.validateUser(name, password);
		
		if (!isValidUser) {
			model.put("errormessage","Access Denied, Invalid Credentials");
			return "login";
			
		}
		
		model.put("name", name);
		model.put("password", password);
		
		return "Welcome";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String showLogoutPage(ModelMap model) {
		return "login";
	}
	


}
