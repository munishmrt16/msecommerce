package ms.shopping.dao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ms.shopping.model.*;

@Repository

public class UserDetailDAOImpl implements UserDetailDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<UserDetailModel> getUDAll()
	{
		return sessionFactory.getCurrentSession().createQuery("from UserDetailModel").list();
	}

	@Transactional
	public void insertUD(UserDetailModel p) {
		sessionFactory.getCurrentSession().persist(p);		
	}
	
	@Override
	@Transactional
	public void updateUD(UserDetailModel p) {
		sessionFactory.getCurrentSession().update(p);		
	}
	
	@Override			 
	@Transactional
	public UserDetailDAO getUD(int uid) {		
		return sessionFactory.getCurrentSession().get(UserDetailDAO.class, uid);
	}

	@Override
	@Transactional
	public void deleteUD(int uid) {
	sessionFactory.getCurrentSession().remove(getUD(uid));
	}

}




