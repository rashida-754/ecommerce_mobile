package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.model.UserDetail;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean registerUser(UserDetail user) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean updateUserDetail(UserDetail user) 
	{
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public List<UserDetail> retrieve()
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<UserDetail> list = session.createQuery("from User").list();
		session.getTransaction().commit();
		return list;
	}

	
	@Override
	public UserDetail getUser(String username) 
	{
		Session session=sessionFactory.openSession();
		UserDetail user=session.get(UserDetail.class, username);
		session.close();
		return user;
	}
	
}
