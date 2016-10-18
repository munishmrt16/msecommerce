package ms.shopping.webapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ms.shopping.dao.*;
import ms.shopping.model.*;

@Controller
public class ProductController {

	@Autowired
	ProductDAO  p;
	@RequestMapping("/product/all")
	public @ResponseBody List<ProductModel> getProduct()
	{
		return p.getAll();
	}
	
}
