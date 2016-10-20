package ms.shopping.webapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ms.shopping.dao.*;
import ms.shopping.model.*;

@Controller
@RequestMapping("/signupdetail")

public class UserDetailController {

	@Autowired
	UserDetailDAO  pud;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminUserDetail()
	{
		ModelAndView mv = new ModelAndView("signup");
		//UserDetailModel UserDetail = new UserDetailModel();
		mv.addObject("userdetails", pud.getUDAll());
		mv.addObject("userdetail", new UserDetailModel());
		return mv;		
	}
	
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public ModelAndView getUserDetail(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("admin");
    	mv.addObject("UserDetail", pud.getUD(id));
    	mv.addObject("UserDetails", pud.getUDAll());
	    return mv;		
		}
	
	@RequestMapping(value = "/delete/{ud}")
	public String deleteUserDetail(@PathVariable("ud") Integer id) {
	   	pud.deleteUD(id);
		return "redirect:/signup/view";		
		}
	
	@RequestMapping("/save")
	public String editUserDetail(@ModelAttribute("UserDetail") UserDetailModel prod)
	{
		if (prod.getUserid()==0)
		{
			pud.insertUD(prod);
		}
		else
		{
			pud.updateUD(prod);
		}
		return "redirect:/signup/view";
	}
}
