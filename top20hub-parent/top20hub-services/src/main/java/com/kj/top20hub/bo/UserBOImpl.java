package com.kj.top20hub.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kj.top20hub.dao.UserDAO;
import com.kj.top20hub.dto.User;

@Service
public class UserBOImpl implements UserBO {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public List<User> getAllUsers() {

		List<User> user = userDao.getAlluser();
		return user;
	}

	
}
