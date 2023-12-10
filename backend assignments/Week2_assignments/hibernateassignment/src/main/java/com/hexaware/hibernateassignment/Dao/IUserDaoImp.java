package com.hexaware.hibernateassignment.Dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hexaware.hibernateassignment.Entity.User;

@Repository
public class IUserDaoImp implements IUserDao {

	
	
	SessionFactory sessionFactory = HibernateDaoUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	
	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		session.save(user);
		tr.commit();
		sessionFactory.close();
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(user);
		tr.commit();
		sessionFactory.close();
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		session.delete(user);
		tr.commit();
		sessionFactory.close();
		return false;
	}

	@Override
	public User getUserById(int id) { 
		// TODO Auto-generated method stub
		TypedQuery<User> query1 = session.getNamedQuery("getUserById");
		query1.setParameter("uid",id);
		User s1 = query1.getSingleResult();
		tr.commit();
		sessionFactory.close();
		return s1;
	}
	

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub

		javax.persistence.Query query3 = session.createNamedQuery("getAllUser");
		List <User> list = query3.getResultList();
		tr.commit();
		sessionFactory.close();
		
		
		return list;
	}


	

	
}
