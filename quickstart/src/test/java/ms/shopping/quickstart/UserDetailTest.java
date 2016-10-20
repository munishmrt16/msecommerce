package ms.shopping.quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ms.shopping.dao.ProductDAO;
import ms.shopping.dao.UserDetailDAO;
import ms.shopping.model.ProductModel;
import ms.shopping.model.UserDetailModel;


public class UserDetailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
		ctxt.scan("ms.shopping");
		ctxt.refresh();
		
		UserDetailDAO udDAO = ctxt.getBean(UserDetailDAO.class);
		
		UserDetailModel p = new UserDetailModel();
		p.setUsername("admin");
		p.setPwd("pwd");
		udDAO.insertUD(p);
		
		p = new UserDetailModel();
		p.setUsername("administrator");
		p.setPwd("pwd");
		udDAO.insertUD(p);
			
		p = new UserDetailModel();
		p.setUsername("administrator");
		p.setPwd("admin");
		udDAO.insertUD(p);
		ctxt.close();
			}
	
}
