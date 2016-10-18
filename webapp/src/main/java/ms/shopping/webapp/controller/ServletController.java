package ms.shopping.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ServletController {
	
	@RequestMapping(value={"/"})
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
	
	@RequestMapping(value="/viewall/{pid}")
	public ModelAndView viewall(@PathVariable("pid") String pid)
	{
		ModelAndView obj = new ModelAndView("viewall");
		obj.addObject("pid",""+pid);
		return obj;
	}
	
	@RequestMapping(value="/view/{pid}")
	public ModelAndView display(@PathVariable("pid") String pid)
	{
		ModelAndView obj = new ModelAndView("view");
		obj.addObject("pid",""+pid);
		return obj;
	}
	
	@RequestMapping(value="/viewall")
	public ModelAndView viewall()
	{
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

