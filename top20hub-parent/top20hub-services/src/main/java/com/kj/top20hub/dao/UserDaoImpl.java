package com.kj.top20hub.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kj.top20hub.dto.User;


@Repository
public class UserDaoImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getAlluser() {
		
		Session currentSession = null;
		
		currentSession = sessionFactory.getCurrentSession();
		
		Query<User> query = currentSession.createQuery("from User",User.class);
		
		List<User> result = query.getResultList();
		
		return result;
	}

	}
