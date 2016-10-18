package ms.shopping.quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import ms.shopping.dao.ProductDAO;
import ms.shopping.model.ProductModel;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
		ctxt.scan("ms.shopping");
		ctxt.refresh();
		
		ProductDAO productDAO = ctxt.getBean(ProductDAO.class);
		
		ProductModel p = new ProductModel();
		p.setPcat("Men");
		p.setPname("Shirts");
		p.setPprice(400);
		p.setPurl("p001");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Men");
		p.setPname("Trousers");
		p.setPprice(700);
		p.setPurl("p002");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Men");
		p.setPname("TShirt");
		p.setPprice(700);
		p.setPurl("p003");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Women");
		p.setPname("Sarees");
		p.setPprice(1400);
		p.setPurl("p004");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Women");
		p.setPname("Suits");
		p.setPprice(900);
		p.setPurl("p005");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Women");
		p.setPname("Daily");
		p.setPprice(700);
		p.setPurl("p006");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Children");
		p.setPname("Uniform");
		p.setPprice(400);
		p.setPurl("p007");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Children");
		p.setPname("Casual");
		p.setPprice(700);
		p.setPurl("p008");
		productDAO.insert(p);
		
		p = new ProductModel();
		p.setPcat("Children");
		p.setPname("TShirt");
		p.setPprice(700);
		p.setPurl("p009");
		productDAO.insert(p);
		
		ctxt.close();
		
	}
}

