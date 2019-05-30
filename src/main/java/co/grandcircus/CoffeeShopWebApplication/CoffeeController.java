package co.grandcircus.CoffeeShopWebApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// This annotation lets the application know where to look for the methods,
//  required for the controller classes
@Controller
public class CoffeeController {

	// This is how we are calling the methods in the controller class
	// @RequestMapping is routing URLs for the application
	@RequestMapping("/") // The forward slash is referencing the landing page
	public ModelAndView index() {
		return new ModelAndView("coffee");
	}
	
	// The forward slash is referencing the register page
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	
	// This method will accept data from the register page using Post
	// The data uses request parameters that match the name attribute in the
	//  form input fields
	@PostMapping("forminfo")
	public ModelAndView formDetails(@RequestParam("firstName") String fName,
			@RequestParam("lastName") String lName,
			@RequestParam("email") String emailAddress,
			@RequestParam("phone") int phoneNumber,
			@RequestParam("password") String passwordString /*,
			@RequestParam("birthday") String bDay,
			@RequestParam("address") String streetAddress,
			@RequestParam("state") String stateName,
			@RequestParam("zipCode") int zCode,
			@RequestParam("gender") String genderType*/) {
		
		User newUser = new User();
		
		dao.addUser(fName,lName, emailAddress, phoneNumber, passwordString);
		
		// Redirects user back to the home page
		return new ModelAndView("redirect:/");
	}
	
	// JDBC methods
	
	@Autowired
	CoffeeJdbcDao dao;
	
}
