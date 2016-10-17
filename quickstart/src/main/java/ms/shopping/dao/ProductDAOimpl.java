package ms.shopping.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ms.shopping.model.*;

@Repository("productDAO")
public class ProductDAOimpl implements ProductDAO
{

	
	
	List<productModel> prod;
	
	public ProductDAOimpl()
	{
		prod=new ArrayList<productModel>();
		
		
		productModel p1=new productModel();
		p1.setId(101);
		p1.setName("Dell Laptop");
		p1.setPrice(35000);
		productModel p2=new productModel();
		p2.setId(201);
		p2.setName("Sony TV");
		p2.setPrice(55000);
		productModel p3=new productModel();
		p3.setId(301);
		p3.setName("Samsung AC");
		p3.setPrice(40000);
		productModel p4=new productModel();
		p4.setId(103);
		p4.setName("HP Laptop");
		p4.setPrice(30000);
		productModel p5=new productModel();
		p5.setId(106);
		p5.setName("Sony Laptop");
		p5.setPrice(42000);
		productModel p6=new productModel();
		p6.setId(206);
		p6.setName("Samsung TV");
		p6.setPrice(25000);
		productModel p7=new productModel();
		p7.setId(209);
		p7.setName("LG TV");
		p7.setPrice(28000);
		productModel p8=new productModel();
		p8.setId(303);
		p8.setName("Voltas AC");
		p8.setPrice(29000);
		
		prod.add(p1);
		prod.add(p2);
		prod.add(p3);
		prod.add(p4);
		prod.add(p5);
		prod.add(p6);
		prod.add(p7);
		prod.add(p8);
		
		
	}

	public List<productModel> getAll() {
		
		return prod;
	}

}

