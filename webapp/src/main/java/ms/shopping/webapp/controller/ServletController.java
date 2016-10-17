package ms.shopping.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServletController {
	
	@RequestMapping(value={"/welcome","/"})
	public ModelAndView gotoindex()
	{
		ModelAndView obj = new ModelAndView();
		obj.setViewName("homepage");
		return obj;
	}

	@RequestMapping("/aboutus")
	public ModelAndView aboutUs(){
		
		ModelAndView obj = new ModelAndView();
		obj.setViewName("aboutus");
		return obj;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contactus(){
		
		ModelAndView obj = new ModelAndView();
		obj.setViewName("contactus");
		return obj;
	}
	
	@RequestMapping("/viewall")
	public ModelAndView viewall(){
		
		ModelAndView obj = new ModelAndView();
		obj.setViewName("viewall");
		return obj;
	}
	
	@RequestMapping("/signin")
	public ModelAndView signin(){
		
		ModelAndView obj = new ModelAndView();
		obj.setViewName("signin");
		return obj;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signup(){
		
		ModelAndView obj = new ModelAndView();
		obj.setViewName("signup");
		return obj;
	}
	

}

