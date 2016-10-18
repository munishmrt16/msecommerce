package ms.shopping.webapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ms.shopping.dao.ProductDAO;
import ms.shopping.model.ProductModel;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView adminProduct() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("ifAdminClickedProduct",true);
		ProductModel product = new ProductModel();
		product.setNewProduct(true);
		mv.addObject("ProductModel", product);
		mv.addObject("Products", productDAO.getAll());
		return mv;		
		
	}

	@RequestMapping(value = "/product/edit/{id}", method = RequestMethod.GET)
	public ModelAndView adminEditProduct(@PathVariable("id") int id) {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("ifAdminClickedProduct",true);		
		mv.addObject("product", productDAO.get(id));
		mv.addObject("products", productDAO.getAll());
		return mv;		
		
	}


	@PostMapping("/product/save")
	public String adminSaveProduct(@ModelAttribute("product") ProductModel product) {
		if(product.isNewProduct()) {
			productDAO.insert(product);
		}
		else {
			productDAO.update(product);	
		}
		
		return "redirect:/admin/product";				
	}
}
