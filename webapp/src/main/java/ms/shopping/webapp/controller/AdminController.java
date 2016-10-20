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
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	ProductDAO  p;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView adminProduct()
	{
		ModelAndView mv = new ModelAndView("admin");
		//ProductModel product = new ProductModel();
		mv.addObject("products", p.getAll());
		mv.addObject("product", new ProductModel());
		return mv;		
	}
	
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public ModelAndView getProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("admin");
    	mv.addObject("product", p.get(id));
    	mv.addObject("products", p.getAll());
	    return mv;		
		}
	
	@RequestMapping(value = "/delete/{pro}")
	public String deleteProduct(@PathVariable("pro") Integer id) {
	   	p.delete(id);
		return "redirect:/admin/view";		
		}
	
	@RequestMapping("/save")
	public String editProduct(@ModelAttribute("product") ProductModel prod)
	{
		if (prod.getPid()==0)
		{
			p.insert(prod);
		}
		else
		{
			p.update(prod);
		}
		return "redirect:/admin/view";
	}
	/*
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertProduct(@Valid @ModelAttribute("pid") Product product, BindingResult results, Model model) {
		if(results.hasErrors()) {
			model.addAttribute("pid", product);
			model.addAttribute("productData", productDao.getAll());
			return ("admin");
		}
		productDao.addproduct(product);
		if (product.getId() == 0) {
			productDao.addproduct(product);
		} else {

			productDao.updateProduct(product);
		}

		return "redirect:/admin/viewall";
	}
	
	@RequestMapping("/edit/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {
		model.addAttribute("pid", productDao.getProductById(id));
		model.addAttribute("productData", productDao.getAll());
		return "adminpage";
	}
*/
 /*
     @RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertProduct(@Valid @ModelAttribute("product") Product product, BindingResult results, Model model) {
		if(results.hasErrors()) {
			model.addAttribute("pid", product);
			model.addAttribute("productData", productDao.getAll());
			return ("/viewall");
		}
		productDao.addproduct(product);
		if (product.getId() == 0) {
			productDao.addproduct(product);
		} else {

			productDao.updateProduct(product);
		}

		return "redirect:/admin/viewall";
	}
   
  */
	
	
	
	
}
